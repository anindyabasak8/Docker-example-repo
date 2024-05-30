FROM openjdk:8
EXPOSE 8080
ADD target/devops-docker-ex.jar devops-docker-ex.jar
ENTRYPOINT [ "java","-jar","/devops-docker-ex.jar" ]