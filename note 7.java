package edu.nyu.cs.sh5005.note4;
import edu.nyu.cs.sh5005.note4.Vehicle;

public class Car extends Vehicle{

	private boolean on = false;

	//behaviors of a car(override the parent class functions)
	public void goLeft(){
		if(this.on){
			super.goForwards();
		}else{
			System.out.println("Sorry the car is not on.");
		}
	}
	public void goRight(){
		if(this.on){
			this.direction = Car.DirectionsOfMovement.RIGHT;
		}else{
			System.out.println("Sorry the car is not on.");
		}
	}
	public void goForwards(){
		if(this.on){
			this.direction = Car.DirectionsOfMovement.FORWARDS;
		}else{
			System.out.println("Sorry the car is not on.");
		}
	}
	public void goBackwards(){
		if(this.on){
			this.direction = Car.DirectionsOfMovement.BACKWARDS;
		}else{
			System.out.println("Sorry the car is not on.");
		}
	}
	public void turnOn(){
		this.on = true;
	}
	public void turnOff(){
		this.on = true;
	}
	public boolean isOn(){
		return this.on;
	}
}