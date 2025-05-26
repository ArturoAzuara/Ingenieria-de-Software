FROM amazoncorretto:24.0.1-alpine3.21
LABEL authors="aazuara"
WORKDIR /app
COPY target/albumesapi-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080
CMD ["java","-jar","./app.jar"]