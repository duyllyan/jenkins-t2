FROM openjdk:11
WORKDIR /main
EXPOSE 8000
COPY target/jenkins-t2-0.0.1-SNAPSHOT.jar /main/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]