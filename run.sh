#!/bin/bash

mkdir -p build

javac -d build src/*.java

java -cp build Main