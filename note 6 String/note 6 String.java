public class StringsAreImmutable {
	public static void main(String[] args){

		String x ="foo"; //assigning the variable x to refer to the string "foo"
		x[2] = "r"; //can't do this, becasue strings are immutable
		x[2] = 'r'; //can't do this, becasue strings are immutable

		//THIS IS NOT CHANGING THE VALUE "FOO" INTO SOMETHING ELSE
		x = "foobar"; //re-assigning the variable x to refer to the different string "foobar"

		//the 'normal' way to instantiate an object
		String y = new String("foobar"); //instatiating a new string with the value "foobar"

		//syntactic sugar - a simpler syntax for instantiating a string object
		String z = "foobar"; //absolutely not 'normal'

		System.out.println(x);
	}
}