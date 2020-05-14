#! /bin/bash

mkdir -p ./bin
files=$(find src -regex '.*/\(communication\|client\)/.*\.java')
javac -d ./bin -sourcepath src $files

