
public class Arena {
	
	Robot monte;
	Robot krippler;

	void setup(){
		monte = new WheeledRobot();
		monte.speed = 5;
		monte.power = 100;
		monte.position = 0;
		krippler = new LeggedRobot();
		krippler.speed = 10;
		krippler.power = 200;
		krippler.position = 40;
	}
	
	void startFight() {
		monte.move(10);
		krippler.move(-10);
		monte.attack();
		monte.move(10);
		monte.attack();
		krippler.move(-10);
		krippler.attack();
		monte.moveBack(20);
	}
	
	public static void main(String[] args) {
		Arena streetFight = new Arena();
		streetFight.setup();
		streetFight.startFight();
	}

}

