#!/bin/sh

<<<<<<< HEAD
git pull && git add . && git commit -am "$1"
=======
git pull && git add . && git commit -am "$1" && git push
>>>>>>> 7ad623e1c914bfdcb885f888488936540dbfba3f

echo "Commit $1 has been successfully uploaded"
