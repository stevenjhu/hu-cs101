
package edu.nyu.cs.sh5005.selection_examples;
import java.util.Random;

/**
* A class that shows if I should make a sandwich or not.
* @author Steven Hu
* @version 0.1 (version 1.0 would be a complete project)
*/

public class codenote1 {
	
	public static void main(String[] args){
	
		//create an instance of the Random type
		Random r = new Random();
		
		//genereate a pseudorandom int between 0-1, inclusive
		int decision = r.nextInt(2);
		
		//print out the number
		System.out.println("And the number is: " + decision);
		
		if (decision == 0){
			//if the value of decision is 0
			System.out.println("Sorry, no more sandwiches for you.");
		}
		else{
			//otherwise, if the value of decision is not 0..
			System.out.println("Have another sandwich.");
		}
	}
	
}