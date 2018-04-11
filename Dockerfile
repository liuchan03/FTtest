FROM 100.125.0.94:20202/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/yyy-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
