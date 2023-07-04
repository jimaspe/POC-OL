FROM openjdk:11-slim
COPY './target/poc-accountscanonicalsummary.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/poc-accountscanonicalsummary.jar
CMD ["java", "-jar", "./usr/local/poc-accountscanonicalsummary.jar"]
