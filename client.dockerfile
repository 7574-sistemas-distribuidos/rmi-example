FROM openjdk:7
COPY simple-rmi /usr/simple-rmi
WORKDIR /usr/simple-rmi
RUN chmod ugo+x compile-client.sh run-client.sh && ./compile-client.sh
CMD ["./run-client.sh"]

