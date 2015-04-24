javac -cp  tika-app-1.7.jar TextExtractor.java
java -cp tika-app-1.7.jar:. TextExtractor $1 > output.txt
