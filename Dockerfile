FROM openjdk
EXPOSE 9095
ADD target/devops-integration.jar devops-integration.jar
ENTRYPOINT ["java", "-jar", "/devops-integration.jar"]