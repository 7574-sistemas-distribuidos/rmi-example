FROM openjdk:7
COPY simple-rmi /usr/simple-rmi
WORKDIR /usr/simple-rmi
RUN ./compile-client.sh
CMD ["./run-client.sh"]

