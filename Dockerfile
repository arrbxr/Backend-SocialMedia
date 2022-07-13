FROM openjdk:8
EXPOSE 8080
ADD target/FirstSpringBoot-1.0.0-SNAPSHOT.jar FirstSpringBoot-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/FirstSpringBoot-1.0.0-SNAPSHOT.jar"]