FROM java:8-jre
MAINTAINER Selahaddin Akgun <selahaddin.akgun@fmsstech.com>

ADD ./target/catalog-service.jar /app/
CMD ["java", "-Xmx256m", "-jar", "/app/catalog-service.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:9010/actuator/health || exit 1

EXPOSE 9010