import java.util.Random

public class StringAccumulator{
	String[]nouns = {
		"fabulousness",
		
	};
	String[]adjectives = {

	};
	String[]verbs = {
		"create",
		"eat",
		"sleep",
		"blink"
	};
	String adverbs = {

	};

	String poem = "";

	Random randy = new Random();
	for(int i =0;i<25;i++){
		//randomly pick a noun
		String noun = nouns[randy.nextInt(nouns.length)];
		poem += noun;

		//randomly pick a adverb
		String adverb = adverb[randy.nextInt(adverbs.length)];
		poem += adverb;

		//randomly pick a verb
		String verb = verbs[randy.nextInt(verbs.length)];
		poem += verb;

		//randomly pick a adjectives
		String adj = adjectives[randy.nextInt(adjectives.length)];
		poem += adjectives;

		//randomly pick a noun
		String object = nouns[randy.nextInt(nouns.length)];
		poem += object;

		poem += ".\n";


		System.out.println(poem);
	}

}