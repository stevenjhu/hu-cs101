package edu.nyu.cs.sh5005

public class codenote3{
	

	public static int x = 2; //this is not a global variable, belongs to the class, codenote3
	
	/**
	*Add two plus two and return the result. Shows how to refer to the FirstClass
	*@return
	*/
	
	public static int getTwoPlusTwo(){
		int x = 2;
		
		//this adds the static variable that belongs to the class to the local x variable that 
		int z = FirstClass.x + x;
		return z;
	}
	
	/**
	* Output the value of an int.
	* @param theNumber an integer to output
	* @param className a class name to output
	*/
	public static void displayNumber(int theNumber, String className){
		System.out.println("The value of two plus two according to " + className + "is " + theNumber);
	}
	
	//static: this particular object belongs to the class
	public static void main(String[] args){
		int four1 = FirstClass.getTwoPlusTwo(); // if not specified the FirstClass or other class, the method is defaultly choosing from this current class.
		System.out.println("The value of two plus two according to SecondClass is " + four1);
		
		//same thing as above
		int four2 = FirstClass.getTwoPlusTwo(); 
		displayNumber(four2, "FirstClass")
	}
	
}