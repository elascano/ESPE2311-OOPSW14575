while read line; 
do 
  cp ../README.md "$line";  
done < students.txt
