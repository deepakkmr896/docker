FROM openjdk:8
ADD target/docker-demo.jar docker-demo.jar
EXPOSE 7071
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]