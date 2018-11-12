package edu.nyu.cs.sh5005.note4

public class Vehicle {
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

	//The orientation the car is currently facing
	private Orientatino orientation = Vehicle.Orientation.NORTH; //when using static varibles in a non-static way, write out all the super class

	//The direction of movement, either forward or backward (reverse)
	private DirectionsOfMovement direction = Vehicle.DirectionOfMovement.FORWARDS;

	//behaviors of a vehicle
	public void goLeft(){
		this.direction = Car.DirectionsOfMovement.LEFT;
		switch(this.orientation){
			case NORTH:
				this.setOrientation(Orientation.WEST);
				break;
			case SOUTH:
				this.setOrientation(Orientation.EAST);
				break;
			case WEST:
				this.setOrientation(Orientation.SOUTH);
				break; 
			case EAST:
				this.setOrientation(Orientation.NORTH);
				break;
		}
		//output the orientation & direction
		System.out.printf("The vehicle is now facing %s",this.orientation);
		System.out.printf("The vehicle is now going %s",this.direction);
	}

	public void goRight(){
		this.direction = Car.DirectionsOfMovement.RIGHT;
		switch(this.orientation){
			case NORTH:
				this.setOrientation(Orientation.EAST);
				break;
			case SOUTH:
				this.setOrientation(Orientation.WEST);
				break;
			case WEST:
				this.setOrientation(Orientation.NORTH);
				break; 
			case EAST:
				this.setOrientation(Orientation.SOUTH);
				break;
		}
			//output the orientation & direction
		System.out.printf("The vehicle is now facing %s\n",this.orientation);
		System.out.printf("The vehicle is now going %s\n",this.direction);
	}
	public void goForwards(){
		this.direction = Car.DirectionsOfMovement.FORWARDS;
			//output the orientation & direction
		System.out.printf("The vehicle is now facing %s\n",this.orientation);
		System.out.printf("The vehicle is now going %s\n",this.direction);
	}
	public void goBackwards(){
		this.direction = Car.DirectionsOfMovement.BACKWARDS;
			//output the orientation & direction
		System.out.printf("The vehicle is now facing %s\n",this.orientation);
		System.out.printf("The vehicle is now going %s\n",this.direction);
	}
	public void setOrientation(Orientation orientation){
		this.orientation = orientation;
	}
	public void setDirection(DirectionsOfMovement direction){
		this.direction = direction;
	}
	public Orientation getOrientation(){
		return this.orientation;
	}
	public DirectionsOfMovement getDirection(){
		return this.direction;
	}
}