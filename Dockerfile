FROM openjdk:17-jdk-alpine
COPY /target/*.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
