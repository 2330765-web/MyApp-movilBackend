# Etapa 1: Compilar la aplicación
FROM gradle:8.5-jdk17 AS build

WORKDIR /home/gradle/src

COPY --chown=gradle:gradle . /home/gradle/src

RUN gradle build -x test --no-daemon


# Etapa 2: Ejecutar la aplicación
FROM eclipse-temurin:17-jre-jammy

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/plottwist-app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/plottwist-app.jar", "-port=8080"]
