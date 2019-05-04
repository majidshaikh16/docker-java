FROM maven:alpine as builder
WORKDIR /app/docker/proj/
COPY ./repository/ /root/.m2/repository/
COPY ./ ./
RUN mvn clean install

FROM java:8
WORKDIR /app/research
COPY --from=builder /app/docker/proj/target/Research-exec.jar ./
CMD [ "java","-jar","Research-exec.jar" ]