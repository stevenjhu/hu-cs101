public class Monday{

	//properties of mondays
	String name = "Mondays";
	int dread = 8; //out of 10
	int speed = 1; //out of 10

	//behaviors of mondays
	public void goQuickly(){
		this.speed = 10;
	}

	public void goSlowly(){
		this.speed = 1;
	}

	public void goDreadfully(){
		this.dread = 10;
	}

	public void goPainlessly(){
		this.dread = 1;
	}

	public boolean equals(Monday m2){
		//return true if the two mondays have the same dread factor and speed
		if(this.dread == m2.dread && this.speed == m2.speed){
			return true;
		}
		//otherwise, return false
		else{
			return false;
		}
	}
	public String toString(){
		return "A monday with dread="+ this.dread + " and speed=" + this.speed;
	}

}