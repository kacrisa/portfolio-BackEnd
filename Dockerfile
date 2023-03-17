FROM amazoncorretto:17-alpine-jdk
LABEL maintainer="kacrisa@outlook.com.ar" 
COPY target/portfolioArgentinaPrograma-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]