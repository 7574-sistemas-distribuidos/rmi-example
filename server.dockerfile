FROM openjdk:7
COPY simple-rmi /usr/simple-rmi
WORKDIR /usr/simple-rmi
RUN ./compile-server.sh
CMD ["./run-server.sh"]

