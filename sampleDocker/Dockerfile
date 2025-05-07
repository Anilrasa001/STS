FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/application1.jar /app/application1.jar
EXPOSE 9797
ENTRYPOINT ["java", "-jar", "application1.jar"]