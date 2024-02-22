FROM openjdk:17-jdk-alpine
ADD target/*.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]