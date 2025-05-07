FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/application.jar /app/application.jar
EXPOSE 9797
ENTRYPOINT ["java", "-jar", "application.jar"]