#FROM openjdk:8-jdk-alpine

FROM eclipse-temurin:11 

#Running the application as non-root user
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]