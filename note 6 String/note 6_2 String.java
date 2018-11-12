import java.util.Random


public class StringAccumulator{
	String[]nouns = {
		"fabulousness",
		"dog",
		"fish",
		"game"
	};
	String[]adjectives = {
		"beautiful",
		"good",
		"evil",
		"lengthy"
	};
	String[]verbs = {
		"create",
		"eat",
		"sleep",
		"blink"
	};
	String adverbs = {
		"likely",
		"pleasantly",
		"benevolently",
		"heavenly"
	};

	StringBuilder poem = new StringBuilder ("");

	Random randy = new Random();
	for(int i =0;i<25;i++){
		//randomly pick a noun
		String noun = nouns[randy.nextInt(nouns.length)];

		//capitablize the noun
		char[] characters = noun.toCharArray(); //get the char array from this string
		char c = Character.toUpperCase(characters[0]);
		characters[0] = c; //replace the first character in the word with its upper-case equivalent
		noun = new String(characters); //make a new string from this char array
		
		poem.append(" " + noun);

		//randomly pick a adverb
		String adverb = adverb[randy.nextInt(adverbs.length)];
		poem.append(" " + adverb);

		//randomly pick a verb
		String verb = verbs[randy.nextInt(verbs.length)];
		poem.append(" " + verb);

		//randomly pick a adjectives
		String adj = adjectives[randy.nextInt(adjectives.length)];
		poem.append(" " + adj);

		//randomly pick a noun
		String object = nouns[randy.nextInt(nouns.length)];
		poem.append(" " + object);

		poem.append(".\n ");

		poem.insert(2,"foo");
		poem.delete(4,10); //remove characters 
		poem.replace(4,10, "foo"); //remove and replace
		poem.reverse();
		System.out.println(poem.toString());
	}

}