FROM debian:9-slim

COPY target/app.war /root
COPY myjre /root/myjre

EXPOSE 8080 5005
WORKDIR /root
ENV _JAVA_OPTIONS '-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005'

CMD ["./myjre/bin/java", "-jar", "app.war"]