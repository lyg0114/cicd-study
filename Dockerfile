# 빌드를 위한 Gradle 이미지
FROM gradle:7.2-jdk11 AS builder
WORKDIR /app
COPY . .
RUN gradle clean build --no-daemon

# 실행을 위한 JRE 이미지
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]