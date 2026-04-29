# kallpa-survey

Simulador web de comportamiento del consumidor desarrollado para **Yachay-Tech**, orientado a identificar perfiles de compra de la Tablet Kallpa.

Los usuarios responden una serie de preguntas y el sistema calcula su perfil automáticamente (orientado al precio, equilibrio o calidad), mostrando una recomendación personalizada al finalizar.

## Stack

**Backend** — Spring Boot 3.4 · Java 17 · Spring Data JPA · MySQL · BCrypt  
**Frontend** — Thymeleaf · HTML/CSS vanilla  
**Extras** — IBM Watson Assistant (chatbot) · Bootstrap (admin)

## Funcionalidades

- Registro e inicio de sesión con contraseñas hasheadas
- Flujo de simulación con preguntas encadenadas por alternativa
- Resultado personalizado según puntaje obtenido
- Panel de administración para gestionar simulaciones, preguntas, alternativas y perfiles de resultado
- Chatbot de asistencia integrado con IBM Watson

## Configuración

Copia `application.properties.example` a `application.properties` y completa tus credenciales:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_yachay
spring.datasource.username=root
spring.datasource.password=tu_password

watson.integration-id=tu_integration_id
watson.region=us-east
watson.service-instance-id=tu_service_instance_id
```

Ejecuta el script `BD_Proyecto.sql` en MySQL para crear la base de datos con los datos iniciales.

## Equipo

Proyecto Integrador — Cibertec, 6to ciclo  
Grupo 09 · Blas · Alzamora · Retuerto · León
