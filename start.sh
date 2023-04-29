docker build -t my-spring-app .;
docker rm --force my-app;
docker run -p 8080:8080 --name my-app my-spring-app;