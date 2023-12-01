package lab.chap10.car;

public class Car { //부모클래스
	
	//필드
	String name;

	
	
	//메소드(인스턴스 메소드) : 인스턴스 메소드만 오버라이딩(Overriding) 됨.
	void run() { //부모인 run()은 자식에 그대로 넘어간다. 부모타입으로 두면서 자식을 객체화하면 오버라이딩 된다.
		System.out.println("모든 자동차는 달린다");
	}
	// 다른 클래스에서 오버라이딩 시켜서, 'run()' 입력 후 'crtl + 스페이스바' 누르면 목록 팝업창에서 '오바라이딩' 선택 할 수 있다
	
	
	
	static void move() {
		System.out.println("static은 달린다");
	}
	

}
