FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java", "-jar", "demo.jar"]
