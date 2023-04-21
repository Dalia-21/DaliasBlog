FROM eclipse-temurin:17-jdk-focal
ADD build/libs/Blog-0.0.1-SNAPSHOT.jar Blog-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "Blog-0.0.1-SNAPSHOT.jar" ]