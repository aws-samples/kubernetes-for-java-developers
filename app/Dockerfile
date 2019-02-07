FROM maven:3.5-jdk-8 as BUILD

ADD m2.tar.gz /root

COPY . /usr/src/app
RUN mvn -Dmaven.repo.local=/root/m2 --batch-mode -f /usr/src/app/pom.xml clean package

FROM openjdk:8-jre
EXPOSE 8080 5005
COPY --from=BUILD /usr/src/app/target /opt/target
WORKDIR /opt/target
ENV _JAVA_OPTIONS '-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005'

CMD ["java", "-jar", "app.war"]

