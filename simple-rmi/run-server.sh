#! /bin/bash

rmiregistry -J-Djava.class.path=./bin &
java -classpath ./bin -Djava.rmi.server.codebase=file:bin/ ar.uba.fi.distribuidos.rmi.server.ServerApp "//localhost"

