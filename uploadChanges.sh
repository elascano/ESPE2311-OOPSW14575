#!/bin/sh

git pull && git add . && git commit -am "$1"

echo "Commit $1 has been successfully uploaded"
