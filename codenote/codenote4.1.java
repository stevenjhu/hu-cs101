public class Car {
	
	//some orientations a car could possibly be facing
	public static enum Orientation{
			NORTH,
			SOUTH,
			EAST,
			WEST
	}

	public static enum DirectionsOfMovement{
		FORWARDs,
		BACKWARDs
	}

	private boolean on = false;

	//The orientation the car is currently facing
	private Orientatino orientation = Car.Orientation.NORTH; //when using static varibles in a non-static way, write out all the super class

	//The direction of movement, either forward or backward (reverse)
	private DirectionsOfMovement direction = Car.DirectionOfMovement.FORWARDS;

	//behaviors of a car
	public void goLeft(){
		if(this.on){
			this.direction = Car.DirectionsOfMovement.LEFT;
		}
	}

	public void goRight(){
		if(this.on){
			this.direction = Car.DirectionsOfMovement.RIGHT;
		}
	}
	public void goForwards(){
		if(this.on){
			this.direction = Car.DirectionsOfMovement.FORWARDS;
		}
	}
	public void goBackwards(){
		if(this.on){
			this.direction = Car.DirectionsOfMovement.BACKWARDS;
		}
	}
	public void turnOn(){
		this.on = true;
	}
	public void turnOff(){
		this.on = true;
	}
}