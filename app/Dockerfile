FROM maven:3.5-jdk-8 as BUILD

ADD m2.tar.gz /root

COPY . /usr/src/app
RUN mvn --batch-mode -f /usr/src/app/pom.xml clean package

FROM openjdk:8-jre
ENV PORT 8080
EXPOSE 8080
COPY --from=BUILD /usr/src/app/target /opt/target
WORKDIR /opt/target

CMD ["java", "-jar", "app-swarm.jar"]

