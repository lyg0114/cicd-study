docker rmi my-spring-app
docker build -t my-spring-app .
docker run -p 8080:8080 my-spring-app