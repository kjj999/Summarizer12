import java.io.*;
import java.util.HashMap;

public class PythonCaller {
 
	public static void CallSummarizer(String file, int SummarizerSelection) throws IOException {
	// set up the command and parameter
		HashMap<String,Boolean> hm=new HashMap()
        {{
         put("about",Boolean.TRUE);put("above",Boolean.TRUE);put("after",Boolean.TRUE);put("again",Boolean.TRUE);put("against",Boolean.TRUE);put("all",Boolean.TRUE);put("am",Boolean.TRUE);put("an",Boolean.TRUE);put("and",Boolean.TRUE);put("any",Boolean.TRUE);put("are",Boolean.TRUE);put("aren't",Boolean.TRUE);put("as",Boolean.TRUE);put("at",Boolean.TRUE);put("be",Boolean.TRUE);put("because",Boolean.TRUE);put("been",Boolean.TRUE);put("before",Boolean.TRUE);put("being",Boolean.TRUE);put("below",Boolean.TRUE);put("between",Boolean.TRUE);put("both",Boolean.TRUE);put("but",Boolean.TRUE);put("by",Boolean.TRUE);put("can't",Boolean.TRUE);put("cannot",Boolean.TRUE);put("could",Boolean.TRUE);put("couldn't",Boolean.TRUE);put("did",Boolean.TRUE);put("didn't",Boolean.TRUE);put("do",Boolean.TRUE);put("does",Boolean.TRUE);put("doesn't",Boolean.TRUE);put("doing",Boolean.TRUE);put("don't",Boolean.TRUE);put("down",Boolean.TRUE);put("during",Boolean.TRUE);put("each",Boolean.TRUE);put("few",Boolean.TRUE);put("for",Boolean.TRUE);put("from",Boolean.TRUE);put("further",Boolean.TRUE);put("had",Boolean.TRUE);put("hadn't",Boolean.TRUE);put("has",Boolean.TRUE);put("hasn't",Boolean.TRUE);put("have",Boolean.TRUE);put("haven't",Boolean.TRUE);put("having",Boolean.TRUE);put("he",Boolean.TRUE);put("he'd",Boolean.TRUE);put("he'll",Boolean.TRUE);put("he's",Boolean.TRUE);put("her",Boolean.TRUE);put("here",Boolean.TRUE);put("here's",Boolean.TRUE);put("hers",Boolean.TRUE);put("herself",Boolean.TRUE);put("him",Boolean.TRUE);put("himself",Boolean.TRUE);put("his",Boolean.TRUE);put("how",Boolean.TRUE);put("how's",Boolean.TRUE);put("i",Boolean.TRUE);put("i'd",Boolean.TRUE);put("i'll",Boolean.TRUE);put("i'm",Boolean.TRUE);put("i've",Boolean.TRUE);put("if",Boolean.TRUE);put("in",Boolean.TRUE);put("into",Boolean.TRUE);put("is",Boolean.TRUE);put("isn't",Boolean.TRUE);put("it",Boolean.TRUE);put("it's",Boolean.TRUE);put("its",Boolean.TRUE);put("itself",Boolean.TRUE);put("let's",Boolean.TRUE);put("me",Boolean.TRUE);put("more",Boolean.TRUE);put("most",Boolean.TRUE);put("mustn't",Boolean.TRUE);put("my",Boolean.TRUE);put("myself",Boolean.TRUE);put("no",Boolean.TRUE);put("nor",Boolean.TRUE);put("not",Boolean.TRUE);put("of",Boolean.TRUE);put("off",Boolean.TRUE);put("on",Boolean.TRUE);put("once",Boolean.TRUE);put("only",Boolean.TRUE);put("or",Boolean.TRUE);put("other",Boolean.TRUE);put("ought",Boolean.TRUE);put("our",Boolean.TRUE);put("ours",Boolean.TRUE);put("ourselves",Boolean.TRUE);put("out",Boolean.TRUE);put("over",Boolean.TRUE);put("own",Boolean.TRUE);put("same",Boolean.TRUE);put("shan't",Boolean.TRUE);put("she",Boolean.TRUE);put("she'd",Boolean.TRUE);put("she'll",Boolean.TRUE);put("she's",Boolean.TRUE);put("should",Boolean.TRUE);put("shouldn't",Boolean.TRUE);put("so",Boolean.TRUE);put("some",Boolean.TRUE);put("such",Boolean.TRUE);put("than",Boolean.TRUE);put("that",Boolean.TRUE);put("that's",Boolean.TRUE);put("the",Boolean.TRUE);put("their",Boolean.TRUE);put("theirs",Boolean.TRUE);put("them",Boolean.TRUE);put("themselves",Boolean.TRUE);put("then",Boolean.TRUE);put("there",Boolean.TRUE);put("there's",Boolean.TRUE);put("these",Boolean.TRUE);put("they",Boolean.TRUE);put("they'd",Boolean.TRUE);put("they'll",Boolean.TRUE);put("they're",Boolean.TRUE);put("they've",Boolean.TRUE);put("this",Boolean.TRUE);put("those",Boolean.TRUE);put("through",Boolean.TRUE);put("to",Boolean.TRUE);put("too",Boolean.TRUE);put("under",Boolean.TRUE);put("until",Boolean.TRUE);put("up",Boolean.TRUE);put("very",Boolean.TRUE);put("was",Boolean.TRUE);put("wasn't",Boolean.TRUE);put("we",Boolean.TRUE);put("we'd",Boolean.TRUE);put("we'll",Boolean.TRUE);put("we're",Boolean.TRUE);put("we've",Boolean.TRUE);put("were",Boolean.TRUE);put("weren't",Boolean.TRUE);put("what",Boolean.TRUE);put("what's",Boolean.TRUE);put("when",Boolean.TRUE);put("when's",Boolean.TRUE);put("where",Boolean.TRUE);put("where's",Boolean.TRUE);put("which",Boolean.TRUE);put("while",Boolean.TRUE);put("who",Boolean.TRUE);put("who's",Boolean.TRUE);put("whom",Boolean.TRUE);put("why",Boolean.TRUE);put("why's",Boolean.TRUE);put("with",Boolean.TRUE);put("won't",Boolean.TRUE);put("would",Boolean.TRUE);put("wouldn't",Boolean.TRUE);put("you",Boolean.TRUE);put("you'd",Boolean.TRUE);put("you'll",Boolean.TRUE);put("you're",Boolean.TRUE);put("you've",Boolean.TRUE);put("your",Boolean.TRUE);put("yours",Boolean.TRUE);put("yourself",Boolean.TRUE);put("yourselves",Boolean.TRUE);put("I",Boolean.TRUE);put("",Boolean.TRUE);put("a",Boolean.TRUE);put("",Boolean.TRUE);put("about",Boolean.TRUE);put("",Boolean.TRUE);put("an",Boolean.TRUE);put("",Boolean.TRUE);put("are",Boolean.TRUE);put("",Boolean.TRUE);put("as",Boolean.TRUE);put("",Boolean.TRUE);put("at",Boolean.TRUE);put("",Boolean.TRUE);put("be",Boolean.TRUE);put("",Boolean.TRUE);put("by",Boolean.TRUE);put("",Boolean.TRUE);put("com",Boolean.TRUE);put("",Boolean.TRUE);put("for",Boolean.TRUE);put("",Boolean.TRUE);put("from",Boolean.TRUE);put("how",Boolean.TRUE);put("in",Boolean.TRUE);put("",Boolean.TRUE);put("is",Boolean.TRUE);put("",Boolean.TRUE);put("it",Boolean.TRUE);put("",Boolean.TRUE);put("of",Boolean.TRUE);put("",Boolean.TRUE);put("on",Boolean.TRUE);put("",Boolean.TRUE);put("or",Boolean.TRUE);put("",Boolean.TRUE);put("that",Boolean.TRUE);put("the",Boolean.TRUE);put("",Boolean.TRUE);put("this",Boolean.TRUE);put("to",Boolean.TRUE);put("",Boolean.TRUE);put("was",Boolean.TRUE);put("",Boolean.TRUE);put("what",Boolean.TRUE);put("",Boolean.TRUE);put("when",Boolean.TRUE);put("where",Boolean.TRUE);put("who",Boolean.TRUE);put("",Boolean.TRUE);put("will",Boolean.TRUE);put("",Boolean.TRUE);put("with",Boolean.TRUE);put("the",Boolean.TRUE);put("www",Boolean.TRUE);put("a",Boolean.TRUE);put("able",Boolean.TRUE);put("about",Boolean.TRUE);put("above",Boolean.TRUE);put("abst",Boolean.TRUE);put("accordance",Boolean.TRUE);put("according",Boolean.TRUE);put("accordingly",Boolean.TRUE);put("across",Boolean.TRUE);put("act",Boolean.TRUE);put("actually",Boolean.TRUE);put("added",Boolean.TRUE);put("adj",Boolean.TRUE);put("affected",Boolean.TRUE);put("affecting",Boolean.TRUE);put("affects",Boolean.TRUE);put("after",Boolean.TRUE);put("afterwards",Boolean.TRUE);put("again",Boolean.TRUE);put("against",Boolean.TRUE);put("ah",Boolean.TRUE);put("all",Boolean.TRUE);put("almost",Boolean.TRUE);put("alone",Boolean.TRUE);put("along",Boolean.TRUE);put("already",Boolean.TRUE);put("also",Boolean.TRUE);put("although",Boolean.TRUE);put("always",Boolean.TRUE);put("am",Boolean.TRUE);put("among",Boolean.TRUE);put("amongst",Boolean.TRUE);put("an",Boolean.TRUE);put("and",Boolean.TRUE);put("announce",Boolean.TRUE);put("another",Boolean.TRUE);put("any",Boolean.TRUE);put("anybody",Boolean.TRUE);put("anyhow",Boolean.TRUE);put("anymore",Boolean.TRUE);put("anyone",Boolean.TRUE);put("anything",Boolean.TRUE);put("anyway",Boolean.TRUE);put("anyways",Boolean.TRUE);put("anywhere",Boolean.TRUE);put("apparently",Boolean.TRUE);put("approximately",Boolean.TRUE);put("are",Boolean.TRUE);put("aren",Boolean.TRUE);put("arent",Boolean.TRUE);put("arise",Boolean.TRUE);put("around",Boolean.TRUE);put("as",Boolean.TRUE);put("aside",Boolean.TRUE);put("ask",Boolean.TRUE);put("asking",Boolean.TRUE);put("at",Boolean.TRUE);put("auth",Boolean.TRUE);put("available",Boolean.TRUE);put("away",Boolean.TRUE);put("awfully",Boolean.TRUE);put("b",Boolean.TRUE);put("back",Boolean.TRUE);put("be",Boolean.TRUE);put("became",Boolean.TRUE);put("because",Boolean.TRUE);put("become",Boolean.TRUE);put("becomes",Boolean.TRUE);put("becoming",Boolean.TRUE);put("been",Boolean.TRUE);put("before",Boolean.TRUE);put("beforehand",Boolean.TRUE);put("begin",Boolean.TRUE);put("beginning",Boolean.TRUE);put("beginnings",Boolean.TRUE);put("begins",Boolean.TRUE);put("behind",Boolean.TRUE);put("being",Boolean.TRUE);put("believe",Boolean.TRUE);put("below",Boolean.TRUE);put("beside",Boolean.TRUE);put("besides",Boolean.TRUE);put("between",Boolean.TRUE);put("beyond",Boolean.TRUE);put("biol",Boolean.TRUE);put("both",Boolean.TRUE);put("brief",Boolean.TRUE);put("briefly",Boolean.TRUE);put("but",Boolean.TRUE);put("by",Boolean.TRUE);put("c",Boolean.TRUE);put("ca",Boolean.TRUE);put("came",Boolean.TRUE);put("can",Boolean.TRUE);put("cannot",Boolean.TRUE);put("can't",Boolean.TRUE);put("cause",Boolean.TRUE);put("causes",Boolean.TRUE);put("certain",Boolean.TRUE);put("certainly",Boolean.TRUE);put("co",Boolean.TRUE);put("com",Boolean.TRUE);put("come",Boolean.TRUE);put("comes",Boolean.TRUE);put("contain",Boolean.TRUE);put("containing",Boolean.TRUE);put("contains",Boolean.TRUE);put("could",Boolean.TRUE);put("couldnt",Boolean.TRUE);put("d",Boolean.TRUE);put("date",Boolean.TRUE);put("did",Boolean.TRUE);put("didn't",Boolean.TRUE);put("different",Boolean.TRUE);put("do",Boolean.TRUE);put("does",Boolean.TRUE);put("doesn't",Boolean.TRUE);put("doing",Boolean.TRUE);put("done",Boolean.TRUE);put("don't",Boolean.TRUE);put("down",Boolean.TRUE);put("downwards",Boolean.TRUE);put("due",Boolean.TRUE);put("during",Boolean.TRUE);put("e",Boolean.TRUE);put("each",Boolean.TRUE);put("ed",Boolean.TRUE);put("edu",Boolean.TRUE);put("effect",Boolean.TRUE);put("eg",Boolean.TRUE);put("eight",Boolean.TRUE);put("eighty",Boolean.TRUE);put("either",Boolean.TRUE);put("else",Boolean.TRUE);put("elsewhere",Boolean.TRUE);put("end",Boolean.TRUE);put("ending",Boolean.TRUE);put("enough",Boolean.TRUE);put("especially",Boolean.TRUE);put("et",Boolean.TRUE);put("et-al",Boolean.TRUE);put("etc",Boolean.TRUE);put("even",Boolean.TRUE);put("ever",Boolean.TRUE);put("every",Boolean.TRUE);put("everybody",Boolean.TRUE);put("everyone",Boolean.TRUE);put("everything",Boolean.TRUE);put("everywhere",Boolean.TRUE);put("ex",Boolean.TRUE);put("except",Boolean.TRUE);put("f",Boolean.TRUE);put("far",Boolean.TRUE);put("few",Boolean.TRUE);put("ff",Boolean.TRUE);put("fifth",Boolean.TRUE);put("first",Boolean.TRUE);put("five",Boolean.TRUE);put("fix",Boolean.TRUE);put("followed",Boolean.TRUE);put("following",Boolean.TRUE);put("follows",Boolean.TRUE);put("for",Boolean.TRUE);put("former",Boolean.TRUE);put("formerly",Boolean.TRUE);put("forth",Boolean.TRUE);put("found",Boolean.TRUE);put("four",Boolean.TRUE);put("from",Boolean.TRUE);put("further",Boolean.TRUE);put("furthermore",Boolean.TRUE);put("g",Boolean.TRUE);put("gave",Boolean.TRUE);put("get",Boolean.TRUE);put("gets",Boolean.TRUE);put("getting",Boolean.TRUE);put("give",Boolean.TRUE);put("given",Boolean.TRUE);put("gives",Boolean.TRUE);put("giving",Boolean.TRUE);put("go",Boolean.TRUE);put("goes",Boolean.TRUE);put("gone",Boolean.TRUE);put("got",Boolean.TRUE);put("gotten",Boolean.TRUE);put("h",Boolean.TRUE);put("had",Boolean.TRUE);put("happens",Boolean.TRUE);put("hardly",Boolean.TRUE);put("has",Boolean.TRUE);put("hasn't",Boolean.TRUE);put("have",Boolean.TRUE);put("haven't",Boolean.TRUE);put("having",Boolean.TRUE);put("he",Boolean.TRUE);put("hed",Boolean.TRUE);put("hence",Boolean.TRUE);put("her",Boolean.TRUE);put("here",Boolean.TRUE);put("hereafter",Boolean.TRUE);put("hereby",Boolean.TRUE);put("herein",Boolean.TRUE);put("heres",Boolean.TRUE);put("hereupon",Boolean.TRUE);put("hers",Boolean.TRUE);put("herself",Boolean.TRUE);put("hes",Boolean.TRUE);put("hi",Boolean.TRUE);put("hid",Boolean.TRUE);put("him",Boolean.TRUE);put("himself",Boolean.TRUE);put("his",Boolean.TRUE);put("hither",Boolean.TRUE);put("home",Boolean.TRUE);put("how",Boolean.TRUE);put("howbeit",Boolean.TRUE);put("however",Boolean.TRUE);put("hundred",Boolean.TRUE);put("i",Boolean.TRUE);put("id",Boolean.TRUE);put("ie",Boolean.TRUE);put("if",Boolean.TRUE);put("i'll",Boolean.TRUE);put("im",Boolean.TRUE);put("immediate",Boolean.TRUE);put("immediately",Boolean.TRUE);put("importance",Boolean.TRUE);put("important",Boolean.TRUE);put("in",Boolean.TRUE);put("inc",Boolean.TRUE);put("indeed",Boolean.TRUE);put("index",Boolean.TRUE);put("information",Boolean.TRUE);put("instead",Boolean.TRUE);put("into",Boolean.TRUE);put("invention",Boolean.TRUE);put("inward",Boolean.TRUE);put("is",Boolean.TRUE);put("isn't",Boolean.TRUE);put("it",Boolean.TRUE);put("itd",Boolean.TRUE);put("it'll",Boolean.TRUE);put("its",Boolean.TRUE);put("itself",Boolean.TRUE);put("i've",Boolean.TRUE);put("j",Boolean.TRUE);put("just",Boolean.TRUE);put("k",Boolean.TRUE);put("keep",Boolean.TRUE);put("keeps",Boolean.TRUE);put("kept",Boolean.TRUE);put("kg",Boolean.TRUE);put("km",Boolean.TRUE);put("know",Boolean.TRUE);put("known",Boolean.TRUE);put("knows",Boolean.TRUE);put("l",Boolean.TRUE);put("largely",Boolean.TRUE);put("last",Boolean.TRUE);put("lately",Boolean.TRUE);put("later",Boolean.TRUE);put("latter",Boolean.TRUE);put("latterly",Boolean.TRUE);put("least",Boolean.TRUE);put("less",Boolean.TRUE);put("lest",Boolean.TRUE);put("let",Boolean.TRUE);put("lets",Boolean.TRUE);put("like",Boolean.TRUE);put("liked",Boolean.TRUE);put("likely",Boolean.TRUE);put("line",Boolean.TRUE);put("little",Boolean.TRUE);put("'ll",Boolean.TRUE);put("look",Boolean.TRUE);put("looking",Boolean.TRUE);put("looks",Boolean.TRUE);put("ltd",Boolean.TRUE);put("m",Boolean.TRUE);put("made",Boolean.TRUE);put("mainly",Boolean.TRUE);put("make",Boolean.TRUE);put("makes",Boolean.TRUE);put("many",Boolean.TRUE);put("may",Boolean.TRUE);put("maybe",Boolean.TRUE);put("me",Boolean.TRUE);put("mean",Boolean.TRUE);put("means",Boolean.TRUE);put("meantime",Boolean.TRUE);put("meanwhile",Boolean.TRUE);put("merely",Boolean.TRUE);put("mg",Boolean.TRUE);put("might",Boolean.TRUE);put("million",Boolean.TRUE);put("miss",Boolean.TRUE);put("ml",Boolean.TRUE);put("more",Boolean.TRUE);put("moreover",Boolean.TRUE);put("most",Boolean.TRUE);put("mostly",Boolean.TRUE);put("mr",Boolean.TRUE);put("mrs",Boolean.TRUE);put("much",Boolean.TRUE);put("mug",Boolean.TRUE);put("must",Boolean.TRUE);put("my",Boolean.TRUE);put("myself",Boolean.TRUE);put("n",Boolean.TRUE);put("na",Boolean.TRUE);put("name",Boolean.TRUE);put("namely",Boolean.TRUE);put("nay",Boolean.TRUE);put("nd",Boolean.TRUE);put("near",Boolean.TRUE);put("nearly",Boolean.TRUE);put("necessarily",Boolean.TRUE);put("necessary",Boolean.TRUE);put("need",Boolean.TRUE);put("needs",Boolean.TRUE);put("neither",Boolean.TRUE);put("never",Boolean.TRUE);put("nevertheless",Boolean.TRUE);put("new",Boolean.TRUE);put("next",Boolean.TRUE);put("nine",Boolean.TRUE);put("ninety",Boolean.TRUE);put("no",Boolean.TRUE);put("nobody",Boolean.TRUE);put("non",Boolean.TRUE);put("none",Boolean.TRUE);put("nonetheless",Boolean.TRUE);put("noone",Boolean.TRUE);put("nor",Boolean.TRUE);put("normally",Boolean.TRUE);put("nos",Boolean.TRUE);put("not",Boolean.TRUE);put("noted",Boolean.TRUE);put("nothing",Boolean.TRUE);put("now",Boolean.TRUE);put("nowhere",Boolean.TRUE);put("o",Boolean.TRUE);put("obtain",Boolean.TRUE);put("obtained",Boolean.TRUE);put("obviously",Boolean.TRUE);put("of",Boolean.TRUE);put("off",Boolean.TRUE);put("often",Boolean.TRUE);put("oh",Boolean.TRUE);put("ok",Boolean.TRUE);put("okay",Boolean.TRUE);put("old",Boolean.TRUE);put("omitted",Boolean.TRUE);put("on",Boolean.TRUE);put("once",Boolean.TRUE);put("one",Boolean.TRUE);put("ones",Boolean.TRUE);put("only",Boolean.TRUE);put("onto",Boolean.TRUE);put("or",Boolean.TRUE);put("ord",Boolean.TRUE);put("other",Boolean.TRUE);put("others",Boolean.TRUE);put("otherwise",Boolean.TRUE);put("ought",Boolean.TRUE);put("our",Boolean.TRUE);put("ours",Boolean.TRUE);put("ourselves",Boolean.TRUE);put("out",Boolean.TRUE);put("outside",Boolean.TRUE);put("over",Boolean.TRUE);put("overall",Boolean.TRUE);put("owing",Boolean.TRUE);put("own",Boolean.TRUE);put("p",Boolean.TRUE);put("page",Boolean.TRUE);put("pages",Boolean.TRUE);put("part",Boolean.TRUE);put("particular",Boolean.TRUE);put("particularly",Boolean.TRUE);put("past",Boolean.TRUE);put("per",Boolean.TRUE);put("perhaps",Boolean.TRUE);put("placed",Boolean.TRUE);put("please",Boolean.TRUE);put("plus",Boolean.TRUE);put("poorly",Boolean.TRUE);put("possible",Boolean.TRUE);put("possibly",Boolean.TRUE);put("potentially",Boolean.TRUE);put("pp",Boolean.TRUE);put("predominantly",Boolean.TRUE);put("present",Boolean.TRUE);put("previously",Boolean.TRUE);put("primarily",Boolean.TRUE);put("probably",Boolean.TRUE);put("promptly",Boolean.TRUE);put("proud",Boolean.TRUE);put("provides",Boolean.TRUE);put("put",Boolean.TRUE);put("q",Boolean.TRUE);put("que",Boolean.TRUE);put("quickly",Boolean.TRUE);put("quite",Boolean.TRUE);put("qv",Boolean.TRUE);put("r",Boolean.TRUE);put("ran",Boolean.TRUE);put("rather",Boolean.TRUE);put("rd",Boolean.TRUE);put("re",Boolean.TRUE);put("readily",Boolean.TRUE);put("really",Boolean.TRUE);put("recent",Boolean.TRUE);put("recently",Boolean.TRUE);put("ref",Boolean.TRUE);put("refs",Boolean.TRUE);put("regarding",Boolean.TRUE);put("regardless",Boolean.TRUE);put("regards",Boolean.TRUE);put("related",Boolean.TRUE);put("relatively",Boolean.TRUE);put("research",Boolean.TRUE);put("respectively",Boolean.TRUE);put("resulted",Boolean.TRUE);put("resulting",Boolean.TRUE);put("results",Boolean.TRUE);put("right",Boolean.TRUE);put("run",Boolean.TRUE);put("s",Boolean.TRUE);put("said",Boolean.TRUE);put("same",Boolean.TRUE);put("saw",Boolean.TRUE);put("say",Boolean.TRUE);put("saying",Boolean.TRUE);put("says",Boolean.TRUE);put("sec",Boolean.TRUE);put("section",Boolean.TRUE);put("see",Boolean.TRUE);put("seeing",Boolean.TRUE);put("seem",Boolean.TRUE);put("seemed",Boolean.TRUE);put("seeming",Boolean.TRUE);put("seems",Boolean.TRUE);put("seen",Boolean.TRUE);put("self",Boolean.TRUE);put("selves",Boolean.TRUE);put("sent",Boolean.TRUE);put("seven",Boolean.TRUE);put("several",Boolean.TRUE);put("shall",Boolean.TRUE);put("she",Boolean.TRUE);put("shed",Boolean.TRUE);put("she'll",Boolean.TRUE);put("shes",Boolean.TRUE);put("should",Boolean.TRUE);put("shouldn't",Boolean.TRUE);put("show",Boolean.TRUE);put("showed",Boolean.TRUE);put("shown",Boolean.TRUE);put("showns",Boolean.TRUE);put("shows",Boolean.TRUE);put("significant",Boolean.TRUE);put("significantly",Boolean.TRUE);put("similar",Boolean.TRUE);put("similarly",Boolean.TRUE);put("since",Boolean.TRUE);put("six",Boolean.TRUE);put("slightly",Boolean.TRUE);put("so",Boolean.TRUE);put("some",Boolean.TRUE);put("somebody",Boolean.TRUE);put("somehow",Boolean.TRUE);put("someone",Boolean.TRUE);put("somethan",Boolean.TRUE);put("something",Boolean.TRUE);put("sometime",Boolean.TRUE);put("sometimes",Boolean.TRUE);put("somewhat",Boolean.TRUE);put("somewhere",Boolean.TRUE);put("soon",Boolean.TRUE);put("sorry",Boolean.TRUE);put("specifically",Boolean.TRUE);put("specified",Boolean.TRUE);put("specify",Boolean.TRUE);put("specifying",Boolean.TRUE);put("still",Boolean.TRUE);put("stop",Boolean.TRUE);put("strongly",Boolean.TRUE);put("sub",Boolean.TRUE);put("substantially",Boolean.TRUE);put("successfully",Boolean.TRUE);put("such",Boolean.TRUE);put("sufficiently",Boolean.TRUE);put("suggest",Boolean.TRUE);put("sup",Boolean.TRUE);put("sure",Boolean.TRUE);
        }};
		
		String pythonScriptPath = null;
		//System.out.println(SummarizerSelection);
		switch (SummarizerSelection){
		
		case 1: pythonScriptPath = "./summarizer_1.py";
				break;
				
		case 2: pythonScriptPath = "./summarizer_2.py";
				break;
				
		case 3: pythonScriptPath = "./summarizer_3.py";
				break;
		case 4: pythonScriptPath = "./summarizer_4.py";
				break;
				
		case 5: pythonScriptPath = "./summarizer_5.py";
				break;
				
		default: System.out.println("Please Select a Summarizer and try again!");
					System.exit(1);
					break;
		
		}
	String[] cmd = new String[3];
	cmd[0] = "python";
	cmd[1] = pythonScriptPath;
	cmd[2] = file;
	 
	// create runtime to execute external command
	Runtime rt = Runtime.getRuntime();
	Process pr = rt.exec(cmd);
	 
	// retrieve output from python script
	BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
	String line = "";
	StringBuilder sb = new StringBuilder();
	String[] spl=null ;
				while((line = bfr.readLine()) != null) {
					
					line=line.trim();
					if(line.length() > 1){
						line=line.toLowerCase();
						spl = null;
						spl = line.split(" ");
						Porter stu = new Porter();
						for(int i = 0; i < spl.length;i++){
							if(hm.containsKey(spl[i])){
								
							}
							else{
								spl[i] = spl[i].trim();
								stu.add(spl[i],spl[i].length());
					            spl[i]=stu.stem();
					            sb.append(spl[i]+" ");
								
						        
							}
						}
						
					}	
					
				// display each output line form python script
	     }
				String[] cmd1 = new String[3];
				cmd1[0] = "python";
				cmd1[1] = "./relavance.py";
				cmd1[2] = '"'+sb.toString()+'"';
				//System.out.println(sb);
				Runtime rt1 = Runtime.getRuntime();
				Process pr1 = rt1.exec(cmd1);

				//System.out.println(sb.toString());
				// retrieve output from python script
				BufferedReader bfr1 = new BufferedReader(new InputStreamReader(pr1.getInputStream()));
				String line1 = "";
							while((line1 = bfr1.readLine()) != null) {
							// display each output line form python script
								System.out.println(line1);
							}
				
				//System.out.println(sb);
	}
}
