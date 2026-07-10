# Sur Salud

Sistema de gestión de citas médicas para clínicas, con arquitectura Spring Boot y documentación completa vía Swagger.

🔗 **Documentación / probar la API (Swagger):** [sursaludapp-1.onrender.com/swagger-ui](https://sursaludapp-1.onrender.com/swagger-ui/index.html)

## Tecnologías

- Java
- Spring Boot
- Swagger / OpenAPI
- H2 (base de datos)
- Desplegado en Render

## Entidades principales

- **Paciente** — datos y registro de pacientes
- **Medico** — gestión de médicos y especialidades
- **Cita** — agendamiento y control de citas médicas entre pacientes y médicos

## Cómo ejecutarlo localmente

```bash
git clone https://github.com/King-911/sursaludapp.git
cd sursaludapp
./mvnw spring-boot:run
```

La API queda disponible en `http://localhost:8080` y la documentación Swagger en `http://localhost:8080/swagger-ui/index.html`.

## Autor

Stewart Leon Gil — [GitHub](https://github.com/King-911) · [LinkedIn](https://www.linkedin.com/in/stewartleon87)
