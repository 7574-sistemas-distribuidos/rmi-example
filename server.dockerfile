FROM openjdk:7
COPY simple-rmi /usr/simple-rmi
WORKDIR /usr/simple-rmi
RUN chmod ugo+x compile-server.sh run-server.sh && ./compile-server.sh
CMD ["./run-server.sh"]

