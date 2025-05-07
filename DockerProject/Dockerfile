FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/Myapp.jar /app/Myapp.jar
EXPOSE 9999
ENTRYPOINT ["java", "-jar", "Myapp.jar"]