class WatsonChatbot {
    constructor() {
        this.watsonUrl = null;
        this.isOpen = false;
        this.isLoaded = false;
        this.elements = {};
        this.init();
    }

    async init() {
        try {
            await this.loadWatsonUrl();

            this.cacheElements();

            this.attachEventListeners();

            console.log('[Watson] Chatbot inicializado correctamente');
        } catch (error) {
            console.error('[Watson] Error al inicializar:', error.message);
        }
    }

    async loadWatsonUrl() {
        try {
            const response = await fetch('/api/watson/config', {
                method: 'GET',
                headers: {
                    'Content-Type': 'application/json',
                    'X-Requested-With': 'XMLHttpRequest'
                }
            });

            if (response.ok) {
                const config = await response.json();
				this.config = config;
                this.applyCssVariables(config);
                console.log('[Watson] Configuración cargada desde backend');
            } else {
                throw new Error('No se pudo obtener la configuración del servidor');
            }
        } catch (error) {
            this.watsonUrl = this.getWatsonUrlFromMeta() || this.getWatsonUrlFromWindow();

            if (!this.watsonUrl) {
                throw new Error('No se encontró la URL de Watson.');
            }
            console.log('[Watson] URL cargada desde configuración alternativa');
        }
    }

    applyCssVariables(config) {
        const root = document.documentElement;
        if (config.primary) root.style.setProperty('--watson-primary', config.primary);
        if (config.primaryHover) root.style.setProperty('--watson-primary-hover', config.primaryHover);
        if (config.bgLight) root.style.setProperty('--watson-bg-light', config.bgLight);
        if (config.bgDark) root.style.setProperty('--watson-bg-dark', config.bgDark);
        if (config.textPrimary) root.style.setProperty('--watson-text-primary', config.textPrimary);
        if (config.textSecondary) root.style.setProperty('--watson-text-secondary', config.textSecondary);
        if (config.border) root.style.setProperty('--watson-border', config.border);
        if (config.badge) root.style.setProperty('--watson-badge', config.badge);
    }

    getWatsonUrlFromMeta() {
        const meta = document.querySelector('meta[name="watson-url"]');
        return meta ? meta.getAttribute('content') : null;
    }

    getWatsonUrlFromWindow() {
        return window.WATSON_URL || window.IBM_WATSON_URL || null;
    }

    cacheElements() {
        this.elements = {
            container: document.getElementById('watson-container'),
            toggleBtn: document.getElementById('watson-toggle'),
            panel: document.getElementById('watson-panel'),
            badge: document.getElementById('watson-badge'),
            iconChat: document.getElementById('watson-icon-chat'),
            iconClose: document.getElementById('watson-icon-close')
        };

        if (!Object.values(this.elements).every(el => el)) {
            throw new Error('No se encontraron elementos del DOM requeridos');
        }
    }

    attachEventListeners() {
        this.elements.toggleBtn.addEventListener('click', () => this.toggle());

        document.addEventListener('keydown', (e) => {
            if (e.key === 'Escape' && this.isOpen) {
                this.close();
            }
        });

        document.addEventListener('click', (e) => {
            if (this.isOpen &&
                !this.elements.container.contains(e.target) &&
                !e.target.closest('[data-watson-ignore]')) {
            }
        });
    }

    toggle() {
        if (this.isOpen) {
            this.close();
        } else {
            this.open();
        }
    }

    open() {
        if (!this.watsonUrl) {
            console.error('[Watson] URL no configurada');
            return;
        }

        this.isOpen = true;

        this.elements.panel.classList.add('active');
        this.elements.toggleBtn.classList.add('active');

        if (!this.isLoaded) {
            this.loadWatson();
        }

        this.elements.panel.style.opacity = '0';
        setTimeout(() => {
            this.elements.panel.style.transition = 'opacity 0.3s ease-in';
            this.elements.panel.style.opacity = '1';
        }, 10);

        console.log('[Watson] Panel abierto');
    }

    close() {
        this.isOpen = false;

        this.elements.panel.style.opacity = '0';
        setTimeout(() => {
            this.elements.panel.classList.remove('active');
            this.elements.toggleBtn.classList.remove('active');
        }, 300);

        console.log('[Watson] Panel cerrado');
    }

	loadWatson() {
	    if (this.isLoaded) return;
	    this.showLoading();

	    window.watsonAssistantChatOptions = {
	        integrationID: this.config.integrationId,
	        region: this.config.region,
	        serviceInstanceID: this.config.serviceInstanceId,
	        onLoad: async (instance) => {
	            await instance.render();
	            this.isLoaded = true;
	            this.hideLoading();
	        }
	    };

	    const t = document.createElement('script');
	    t.src = 'https://web-chat.global.assistant.watson.appdomain.cloud/versions/latest/WatsonAssistantChatEntry.js';
	    t.async = true;
	    document.head.appendChild(t);
	}

    showLoading() {
        const loading = document.createElement('div');
        loading.className = 'watson-loading';
        loading.id = 'watson-loading';
        loading.innerHTML = `
            <div class="watson-spinner"></div>
            <div class="watson-loading-text">Cargando asistente virtual...</div>
        `;
        this.elements.panel.innerHTML = '';
        this.elements.panel.appendChild(loading);
    }

    hideLoading() {
        const loading = document.getElementById('watson-loading');
        if (loading) {
            loading.remove();
        }
    }

    showError(message) {
        const error = document.createElement('div');
        error.className = 'watson-loading';
        error.innerHTML = `
            <svg style="width: 48px; height: 48px; color: #e81818;" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2">
                <circle cx="12" cy="12" r="10"></circle>
                <line x1="12" y1="8" x2="12" y2="12"></line>
                <line x1="12" y1="16" x2="12.01" y2="16"></line>
            </svg>
            <div class="watson-loading-text">${message}</div>
        `;
        this.elements.panel.innerHTML = '';
        this.elements.panel.appendChild(error);
    }

    showNotification(count = 1) {
        const badge = this.elements.badge;
        badge.textContent = count;
        badge.style.display = 'flex';
    }

    hideNotification() {
        this.elements.badge.style.display = 'none';
    }

    destroy() {
        this.elements.toggleBtn.removeEventListener('click', () => this.toggle());
        document.removeEventListener('keydown', (e) => {
            if (e.key === 'Escape') this.close();
        });
        this.isOpen = false;
        this.isLoaded = false;
    }
}

if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', () => {
        window.watsonChatbot = new WatsonChatbot();
    });
} else {
    window.watsonChatbot = new WatsonChatbot();
}

if (typeof module !== 'undefined' && module.exports) {
    module.exports = WatsonChatbot;
}
