tar -czvf 0.tar.gz tar.png
counter=1
num=0
while [ $counter -le 500 ]
do
echo $counter
tar -czvf $counter.tar.gz $num.tar.gz
((counter++))
((num++))
done
echo All done
