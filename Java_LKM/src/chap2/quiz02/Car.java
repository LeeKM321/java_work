package chap2.quiz02;

public class Car {
	
	private String model;
	private int speed;
	private char mode;
	private boolean start;
	
	public Car(String model) {
		this.model = model;
		System.out.println("모델명: " + model);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200) {
			System.out.println("잘못된 속도 입니다.");
			return;
		}
		if(!start) {
			System.out.println("시동부터 먼저 거세요~");
			return;
		}
		if(mode == 'D' || mode == 'R') {
			if(mode == 'R' && speed > 40) {
				System.out.println("후진은 40이상 가속할 수 없습니다.");
				return;
			}
			System.out.println("속도를 " + speed + "로 맞춥니다.");
			this.speed = speed;
		} else {
			System.out.println("변속기 위치를 확인하세요.");
			return;
		}
		
	}

	public char getMode() {
		return mode;
	}

	public void setMode(char mode) {
		switch (mode) {
		case 'D': case 'R': case 'N': case 'P':
			this.mode = mode;
			break;

		default:
			this.mode = 'P';
		}
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}
	
	//시동 버튼 누르는 행위
	public void engineStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		injectOil();
		injectGasoline();
		this.start = true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	
	//엔진오일이 주입되는 기능
	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");
	}
	
	//엔진에 연료가 주입되는 기능
	private void injectGasoline() {
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	
	//실린더가 움직이는 기능
	private void moveCylinder() {
		if(start) {
			System.out.println("실린더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}
	
	//시동을 끄는 기능
	public void engineStop() {
		if(this.speed > 0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		}
		if(this.mode != 'P') {
			System.out.println("P모드로 먼저 변속기를 변경하세요.");
			return;
		} else {
			this.start = false;
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	
	

}




















