FROM openjdk:8-jre-alpine
EXPOSE 8085
ADD target/hello-kubernetes-1.0.jar hello-kubernetes.jar
ENTRYPOINT ["java","-jar","hello-kubernetes.jar"]