import java.io.BufferedWriter;
import java.io.FileWriter;

public class DocSummary {

	public static void main(String args[]) throws Exception {  
	    try {  
	    	TextExtractor TE = new TextExtractor();
	    	String Result = TE.getTextContent(args[0]);
	    	
	    	int Summarizer = 0;
	    	
	    	if(args[1].compareTo("1") == 0)
	    		Summarizer = 1;
	    	if(args[1].compareTo("2") == 0)
	    		Summarizer = 2;
	    	if(args[1].compareTo("3") == 0)
	    		Summarizer = 3;
    		if(args[1].compareTo("4") == 0)
    		    Summarizer = 4;
    		if(args[1].compareTo("5") == 0)
    		    Summarizer = 5;
    	
	    	BufferedWriter filewrite = new BufferedWriter(new FileWriter("./InputContent.txt"));
	    	filewrite.write(Result);
	    	filewrite.close();
	    	PythonCaller PC = new PythonCaller();
	    	PC.CallSummarizer("./InputContent.txt", Summarizer);
	    } 
	    
	    catch (Exception e) {
			e.printStackTrace();
		}
	}

}
