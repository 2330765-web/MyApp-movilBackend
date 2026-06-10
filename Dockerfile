# Etapa 1: Compilar con Java 21
FROM gradle:8.7-jdk21 AS build

WORKDIR /home/gradle/src

COPY --chown=gradle:gradle . .

RUN gradle build -x test --no-daemon


# Etapa 2: Ejecutar con Java 21
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /home/gradle/src/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]