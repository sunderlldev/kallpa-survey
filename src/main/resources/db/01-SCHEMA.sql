-- =========================================
-- BD_Proyecto.sql
-- =========================================

DROP DATABASE IF EXISTS db_yachay;
CREATE DATABASE db_yachay CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE db_yachay;

-- =========================================
-- 1. TABLA ROL
-- =========================================
CREATE TABLE rol (
    id_rol     INT PRIMARY KEY AUTO_INCREMENT,
    nombre_rol VARCHAR(30) NOT NULL UNIQUE
);

-- =========================================
-- 2. TABLA USUARIO
-- password almacenado como hash BCrypt
-- =========================================
CREATE TABLE usuario (
    id_usuario     INT PRIMARY KEY AUTO_INCREMENT,
    nombre         VARCHAR(60)  NOT NULL,
    apellido       VARCHAR(60)  NOT NULL,
    correo         VARCHAR(100) NOT NULL UNIQUE,
    password       VARCHAR(255) NOT NULL,
    estado         TINYINT(1)   NOT NULL DEFAULT 1,
    id_rol         INT          NOT NULL,
    fecha_registro DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_usuario_rol FOREIGN KEY (id_rol) REFERENCES rol(id_rol)
);

-- =========================================
-- 3. TABLA SIMULACION
-- =========================================
CREATE TABLE simulacion (
    id_simulacion  INT PRIMARY KEY AUTO_INCREMENT,
    titulo         VARCHAR(150) NOT NULL,
    descripcion    VARCHAR(255),
    estado         TINYINT(1)   NOT NULL DEFAULT 1,
    fecha_creacion DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- =========================================
-- 4. TABLA PREGUNTA
-- =========================================
CREATE TABLE pregunta (
    id_pregunta    INT PRIMARY KEY AUTO_INCREMENT,
    id_simulacion  INT          NOT NULL,
    texto          VARCHAR(255) NOT NULL,
    orden          INT          DEFAULT NULL,
    es_inicial     TINYINT(1)   NOT NULL DEFAULT 0,
    es_final       TINYINT(1)   NOT NULL DEFAULT 0,
    estado         TINYINT(1)   NOT NULL DEFAULT 1,
    fecha_creacion DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_pregunta_simulacion FOREIGN KEY (id_simulacion) REFERENCES simulacion(id_simulacion)
);

-- =========================================
-- 5. TABLA ALTERNATIVA
-- =========================================
CREATE TABLE alternativa (
    id_alternativa        INT PRIMARY KEY AUTO_INCREMENT,
    id_pregunta           INT          NOT NULL,
    texto                 VARCHAR(255) NOT NULL,
    puntaje               INT          NOT NULL DEFAULT 0,
    id_siguiente_pregunta INT          DEFAULT NULL,
    estado                TINYINT(1)   NOT NULL DEFAULT 1,
    fecha_creacion        DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_alt_pregunta  FOREIGN KEY (id_pregunta)           REFERENCES pregunta(id_pregunta),
    CONSTRAINT fk_alt_sig_preg  FOREIGN KEY (id_siguiente_pregunta) REFERENCES pregunta(id_pregunta)
);

-- =========================================
-- 6. TABLA INTENTO_SIMULACION
-- =========================================
CREATE TABLE intento_simulacion (
    id_intento         INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario         INT         NOT NULL,
    id_simulacion      INT         NOT NULL,
    puntaje_total      INT         NOT NULL DEFAULT 0,
    estado             VARCHAR(20) NOT NULL DEFAULT 'EN_PROCESO',
    id_pregunta_actual INT         DEFAULT NULL,
    fecha_inicio       DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    fecha_fin          DATETIME    DEFAULT NULL,
    CONSTRAINT fk_intento_usuario    FOREIGN KEY (id_usuario)         REFERENCES usuario(id_usuario),
    CONSTRAINT fk_intento_simulacion FOREIGN KEY (id_simulacion)      REFERENCES simulacion(id_simulacion),
    CONSTRAINT fk_intento_preg_act   FOREIGN KEY (id_pregunta_actual) REFERENCES pregunta(id_pregunta)
);

-- =========================================
-- 7. TABLA RESPUESTA_USUARIO
-- =========================================
CREATE TABLE respuesta_usuario (
    id_respuesta_usuario INT PRIMARY KEY AUTO_INCREMENT,
    id_intento           INT      NOT NULL,
    id_pregunta          INT      NOT NULL,
    id_alternativa       INT      NOT NULL,
    puntaje_obtenido     INT      NOT NULL DEFAULT 0,
    fecha_respuesta      DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_resp_intento     FOREIGN KEY (id_intento)     REFERENCES intento_simulacion(id_intento),
    CONSTRAINT fk_resp_pregunta    FOREIGN KEY (id_pregunta)    REFERENCES pregunta(id_pregunta),
    CONSTRAINT fk_resp_alternativa FOREIGN KEY (id_alternativa) REFERENCES alternativa(id_alternativa)
);

-- =========================================
-- 8. TABLA PERFIL
-- =========================================
CREATE TABLE perfil (
    id_perfil     INT PRIMARY KEY AUTO_INCREMENT,
    id_simulacion INT          DEFAULT NULL,
    nombre_perfil VARCHAR(100) NOT NULL,
    descripcion   VARCHAR(255),
    feedback      TEXT,
    puntaje_min   INT          NOT NULL,
    puntaje_max   INT          NOT NULL,
    estado        TINYINT(1)   NOT NULL DEFAULT 1,
    CONSTRAINT fk_perfil_simulacion FOREIGN KEY (id_simulacion) REFERENCES simulacion(id_simulacion)
);

-- =========================================
-- 9. TABLA RESULTADO_FINAL
-- =========================================
CREATE TABLE resultado_final (
    id_resultado     INT PRIMARY KEY AUTO_INCREMENT,
    id_intento       INT      NOT NULL UNIQUE,
    id_perfil        INT      DEFAULT NULL,
    resumen          TEXT,
    feedback         TEXT,
    fecha_generacion DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_res_intento FOREIGN KEY (id_intento) REFERENCES intento_simulacion(id_intento),
    CONSTRAINT fk_res_perfil  FOREIGN KEY (id_perfil)  REFERENCES perfil(id_perfil)
);


-- =========================================
-- DATOS INICIALES
-- =========================================

INSERT INTO rol (nombre_rol) VALUES ('ADMIN'), ('DOCENTE'), ('USUARIO');

-- admin@cibertec.edu.pe      → admin123
-- docente@cibertec.edu.pe    → docente123
-- estudiante@cibertec.edu.pe → usuario123
INSERT INTO usuario (nombre, apellido, correo, password, id_rol) VALUES
('Admin',      'Sistema',   'admin@cibertec.edu.pe',      '$2a$10$uJ3blnhgLqgx3Tm1vO/ImO/VeSQOV0aTIkf/IDdGRs//B8K.9dOQa', 1),
('Juan',       'Docente',   'docente@cibertec.edu.pe',    '$2a$10$wplqaJ.Kd4kmFGOfcGfue.n.mycxw9N6cvBwbNN60mNP6brAi0DKS', 2),
('Estudiante', 'Demo',      'estudiante@cibertec.edu.pe', '$2a$10$wplqaJ.Kd4kmFGOfcGfue.n.mycxw9N6cvBwbNN60mNP6brAi0DKS', 3);


-- =========================================
-- SIMULACION 1: Compra de Tablet Kallpa
-- =========================================
INSERT INTO simulacion (titulo, descripcion) VALUES
('Simulación de compra de Tablet Kallpa',
 'Analiza tu comportamiento como consumidor frente a la Tablet Kallpa y descubre qué tipo de comprador eres.');

INSERT INTO pregunta (id_simulacion, texto, orden) VALUES
(1, '¿Qué valoras más al momento de comprar una tablet?',          1),
(1, 'Si el precio es tu prioridad, ¿qué aspecto te preocupa más?', 2),
(1, 'Si la calidad es tu prioridad, ¿qué esperas del producto?',   3);

INSERT INTO alternativa (id_pregunta, texto, puntaje, id_siguiente_pregunta) VALUES
(1, 'El precio - busco la opción más económica',                5,  2),
(1, 'La calidad - prefiero pagar más por algo que dure',        10, 3),
(2, 'Que sea económico y sirva para tareas básicas',            5,  NULL),
(2, 'Que tenga garantía y soporte técnico accesible',           8,  NULL),
(3, 'Durabilidad, buen procesador y batería de larga duración', 10, NULL),
(3, 'Prestigio de marca y ecosistema de apps confiable',        7,  NULL);

INSERT INTO perfil (id_simulacion, nombre_perfil, descripcion, feedback, puntaje_min, puntaje_max) VALUES
(1, 'Comprador orientado al precio',
 'Prioriza el ahorro y la funcionalidad básica',
 'Eres un consumidor práctico que busca el mayor valor por su dinero. La Tablet Kallpa Basic es perfecta para ti: cumple todas las funciones esenciales a un precio accesible.',
 0, 10),
(1, 'Comprador equilibrado',
 'Busca balance entre precio, calidad y respaldo',
 'Valoras tanto el costo como la confianza en el producto. La Tablet Kallpa Plus es tu opción: garantía extendida, soporte técnico y rendimiento sólido para trabajo y estudio.',
 11, 17),
(1, 'Comprador orientado a la calidad',
 'Prioriza el rendimiento, durabilidad y experiencia de marca',
 'Eres un usuario exigente que sabe lo que quiere. La Tablet Kallpa Pro es para ti: procesador de última generación, batería de 12h, pantalla AMOLED y 3 años de garantía.',
 18, 30);


-- =========================================
-- SIMULACION 2: Servicio postventa Kallpa
-- =========================================
INSERT INTO simulacion (titulo, descripcion) VALUES
('Evaluación del servicio postventa',
 'Descubre qué canal de atención y soporte se adapta mejor a tu perfil como cliente Kallpa.');

INSERT INTO pregunta (id_simulacion, texto, orden) VALUES
(2, '¿Cómo prefieres resolver un problema con tu tablet?',              1),
(2, 'Si prefieres atención presencial, ¿qué valoras más del servicio?', 2),
(2, 'Si prefieres atención digital, ¿qué canal usarías primero?',       3);

INSERT INTO alternativa (id_pregunta, texto, puntaje, id_siguiente_pregunta) VALUES
(4, 'Ir directamente a una tienda o centro de servicio',  5,  5),
(4, 'Resolverlo por medios digitales sin salir de casa',  10, 6),
(5, 'Rapidez en la atención y solución en el mismo día',  8,  NULL),
(5, 'Trato personalizado y explicación detallada',        6,  NULL),
(6, 'Chat en vivo o videollamada con un técnico',         10, NULL),
(6, 'Tutoriales en video y base de conocimiento online',  7,  NULL);

INSERT INTO perfil (id_simulacion, nombre_perfil, descripcion, feedback, puntaje_min, puntaje_max) VALUES
(2, 'Cliente presencial',
 'Prefiere el contacto directo y la atención cara a cara',
 'Te sentirás más cómodo en nuestros centros de servicio autorizados Kallpa. Tenemos 12 puntos de atención en Lima con técnicos certificados. Te recomendamos sacar cita previa en nuestra web.',
 0, 10),
(2, 'Cliente híbrido',
 'Combina atención presencial y digital según la situación',
 'Eres flexible y adaptable. Kallpa tiene una app de soporte donde puedes iniciar tu caso, y si no se resuelve en línea, un técnico te visitará en casa sin costo adicional en garantía.',
 11, 17),
(2, 'Cliente digital nativo',
 'Resuelve todo online y valora la autonomía',
 'La plataforma de soporte digital Kallpa fue diseñada para ti: diagnóstico automático, chat con IA 24/7 y actualizaciones remotas. El 90% de los casos se resuelven sin salir de casa.',
 18, 20);


-- =========================================
-- SIMULACION 3: Plan de uso de la Tablet
-- =========================================
INSERT INTO simulacion (titulo, descripcion) VALUES
('¿Para qué usarías tu Tablet Kallpa?',
 'Identifica el modelo Kallpa más adecuado según tu caso de uso principal.');

INSERT INTO pregunta (id_simulacion, texto, orden) VALUES
(3, '¿Cuál sería tu uso principal de la tablet?',                  1),
(3, 'Para entretenimiento, ¿qué actividad harías más?',            2),
(3, 'Para trabajo/estudio, ¿qué herramienta usarías más seguido?', 3);

INSERT INTO alternativa (id_pregunta, texto, puntaje, id_siguiente_pregunta) VALUES
(7,  'Entretenimiento - series, música y videojuegos',  5,  8),
(7,  'Trabajo y estudio - productividad y aprendizaje', 10, 9),
(8,  'Streaming de video en alta calidad',              6,  NULL),
(8,  'Videojuegos casuales y redes sociales',           4,  NULL),
(9,  'Videoconferencias y presentaciones',              9,  NULL),
(9,  'Edición de documentos, hojas de cálculo y PDF',  8,  NULL);

INSERT INTO perfil (id_simulacion, nombre_perfil, descripcion, feedback, puntaje_min, puntaje_max) VALUES
(3, 'Usuario de entretenimiento',
 'Usa la tablet principalmente para ocio y consumo de contenido',
 'La Tablet Kallpa Entertainment es para ti: pantalla IPS de 10.5" con colores vibrantes, altavoces Dolby Atmos estéreo y batería de 8000mAh para maratones de series sin preocuparte por la carga.',
 0, 10),
(3, 'Usuario mixto',
 'Combina entretenimiento con algo de productividad',
 'La Tablet Kallpa Plus se adapta a tu estilo: potente para contenido multimedia y suficientemente capaz para tus tareas. Viene con teclado Bluetooth de regalo en nuestra promoción actual.',
 11, 17),
(3, 'Usuario productivo',
 'Usa la tablet como herramienta de trabajo y estudio',
 'La Tablet Kallpa Pro Business es tu compañera ideal: procesador octa-core, 8GB RAM, soporte para lápiz digital Kallpa Pen y compatibilidad con Microsoft 365 y Google Workspace.',
 18, 20);


-- =========================================
-- CONSULTAS ÚTILES
-- =========================================

-- Ver usuarios con su rol
SELECT u.id_usuario, u.nombre, u.apellido, u.correo, r.nombre_rol, u.estado
FROM usuario u JOIN rol r ON u.id_rol = r.id_rol;

-- Ver simulaciones activas
SELECT * FROM simulacion WHERE estado = 1;

-- Ver preguntas ordenadas de una simulación
SELECT id_pregunta, texto, orden FROM pregunta
WHERE id_simulacion = 1 AND estado = 1
ORDER BY orden ASC, id_pregunta ASC;

-- Ver perfiles de una simulación
SELECT nombre_perfil, puntaje_min, puntaje_max, feedback
FROM perfil
WHERE id_simulacion = 1 AND estado = 1
ORDER BY puntaje_min ASC;
