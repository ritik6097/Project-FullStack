FROM openjdk:11
ADD ./target/tax-calculator-service-0.0.1-SNAPSHOT.jar /usr/src/tax-calculator-service-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "tax-calculator-service-0.0.1-SNAPSHOT.jar"]
