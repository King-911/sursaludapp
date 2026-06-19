FROM eclipse-temurin:17-jdk-alpine 
WORKDIR /app 
COPY sursaludapp . 
RUN ./mvnw clean package -DskipTests 
EXPOSE 8080 
