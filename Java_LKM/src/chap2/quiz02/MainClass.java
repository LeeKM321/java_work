package chap2.quiz02;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car c = new Car("Porsche 파나메라");
		c.engineStart();
		c.setMode('D');
		c.setSpeed(100);
		c.setSpeed(0);
		c.setMode('P');
		c.engineStop();
		
	}

}
