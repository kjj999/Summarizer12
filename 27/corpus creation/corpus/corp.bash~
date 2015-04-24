while read p; do
  s="http://en.wikipedia.org/wiki/"$p
  echo $s
  java -cp tika-app-1.7.jar:. TextExtractor $s >> output.txt
  echo "Page Over"
done < keywordListFinal.txt
