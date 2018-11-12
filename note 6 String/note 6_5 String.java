public class PlayWithMondays {
	public static void main(String[] args){

		Monday october29 = new Monday(2,4);
		Monday november5 = new Monday(2,4);

		//compare Mondays
		if (october29 == november5){
			System.out.printf("The monday, '%s' is the same as the monday, '%s'!",october29,november5);
		}
		else if (october29.equals(november5)){
			System.out.printf("The monday, '%s' equals the same as the monday, '%s'!",october29,november5);

		}
		else{
			System.out.printf("The monday, '%s' is the diierent from the monday, '%s'!",october29,november5);

		}

	}
}