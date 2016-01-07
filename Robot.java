
public class Robot {
	
	int speed;
	int power;
	int position;
	
	FlameThrower attachment1 = new FlameThrower();
	
	void move(int steps){
		System.out.println("vooom");
		position = position + (steps*speed);
	}
	
	void moveBack(int steps){
		System.out.println("aaaah");
		position = position - (steps*speed);
	}
	
	void attack(){
		System.out.println("Baaam");
		attachment1.fire();
	}
}

