#! /bin/bash

mkdir -p ./bin
files=$(find src -regex '.*/\(communication\|server\)/.*\.java')
javac -d ./bin -sourcepath src $files

