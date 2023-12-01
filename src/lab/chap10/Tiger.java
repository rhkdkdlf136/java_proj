package lab.chap10;

public class Tiger extends Animal { //Animal을 상속
	
	String tName;
	int leg;
	
	Tiger() {}
	
	Tiger(String tName, int leg){
		super("타이거", "금빛");
		this.tName = tName;
		this.leg = leg;
		super.eat();
	}
	
	void goTo() {
		System.out.println("달린다");
	}

	void info() {
		System.out.println("나의 이름은 " + name + "입니다");
		System.out.println("나의 색깔은 " + color + "입니다");
	}
	
}
