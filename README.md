# kallpa-survey — Plataforma de Encuestas Interactivas

Plataforma web de encuestas interactivas desarrollada para Yachay-Tech. Permite crear simulaciones con preguntas encadenadas, calcular perfiles de resultado según el puntaje obtenido y mostrar recomendaciones personalizadas al usuario al finalizar.

El administrador puede gestionar múltiples encuestas, preguntas, alternativas y perfiles de resultado desde un panel dedicado.

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
