javac -cp  tika-app-1.7.jar TextExtractor.java
javac Porter.java
javac PythonCaller.java 
javac DocSummary.java 
java -cp tika-app-1.7.jar:. DocSummary $1 $2
