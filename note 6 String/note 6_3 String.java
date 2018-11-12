public class ComparingStrings{
	public static void main(String[] args){
		//make a few strings
		char[] characters = { 'f','o','o','b','a','r'};
		String x = new String(characters);

		String y = new String("foobar");

		//compare two strings
		if(x==y){
			System.out.printf("The string '%s' is the same as the string '%s'!",x,y);
		}
		else if (x.equals(y)){
			System.out.printf("The string '%s' equals the same as the string '%s'!",x,y);
		}
		else{
			System.out.printf("The string '%s' is different from the string '%s'!",x,y);
		}
	}
}