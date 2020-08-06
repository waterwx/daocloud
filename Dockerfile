FROM maven:3-openjdk-8 AS build
WORKDIR /code
COPY ./ /code
RUN mvn package -Dmaven.test.skip=true


FROM java:8
COPY --from=build /code/target/*.jar /app.jar
CMD java -jar /app.jar
