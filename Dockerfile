FROM openjdk
ADD target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]
