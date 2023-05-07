FROM openjdk:8
EXPOSE 8075
ADD target/tobeeb.jar tobeeb.jar
ENTRYPOINT ["java","-jar","/tobeeb.jar"]