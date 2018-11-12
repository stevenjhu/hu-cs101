package edu.nyu.cs.sh5005.note4;

public class TestVehicles {
	public static void main(String[] args){
		
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();

		Car car1 = new Car();
		Car car2 = new Car();

		Vehicle[] bikes = {
			bike1,
			bike2,
			car1,
			car2
		};

		for (Vehicle vehick : vehicles){
			if(vehick instanceof Bicycle){
				vehick.goForwards();
			}
			else{
				if(vehick instanceof Car && ((Car) vehick).isOn()){
					vehick.goForwards();
				}
				else if(vehick instanceof Car){
					System.out.println("Sorry the car is not on.");
					((Car)vehick).turnOn();
				}
			}
		}

	}
}