package edu.nyu.cs.sh5005
import java.util.Random;
import java.util.Scanner;

public class codenote2 {

	public static void main(Stirng[] args){
		boolean x = true;
		
		int i = 0; // a counter! also known as an accumulator
		while(i<10){
			System.out.println("Iterating within the first while loop");
			i++; //  shorthand for i = i + 1 (the equivalent of i += 1 in Python)
		}
		
		while (x){
			System.out.println("Iterating within the second while loop");
			
			//generate a random boolean
			Random r = new Random();
			x = r.nextBoolean();
		}
		
		Scanner scn = new Scanner(System.in); // if there are going to be a lot of inputs, put the scanner outside of the loop so the resource is not repeatedly opened and closed
		while (x){
			System.out.println("Iterating within the third while loop.");
			
			//get user input
			
			System.out.println("Please enter an integer between 1 and 10: ");
			int num = scn.nextInt();
			
			
			//validate the user's input
			if (num>= 1 && num <= 10){
				x = false;
				System.out.println("Thanks for the good input!...quitting loop");
			}
			//if the user's input is invalid, x is still true, so no need to set it to that!
			
		}
		scn.close();
		
		
		//an infinite loop with an example of an bad code in the break statement.
		while (x){
			System.out.println("This is the start of the fourth while loop.");
			break;
			//System.out.println("This is the end of the iteration."); // unreachable code!
		}
		
		//an infinite loop with an example of an bad code in the continue statement.
		while (x){
			System.out.println("This is the start of the fifth while loop.");
			continue; // This is bad code! A loop will always continue at the end of each iteration.
			//System.out.println("This is the end of the iteration."); // unreachable code!
		}
	}
}