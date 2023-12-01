package chap10.ex03;

public class Animal { //부모클래스
	
	//필드
	String name; //인스턴스 필드 : 객체화해야만(객체를 만들어야) 사용할 수 있다.
	int age; //인스턴스 필드
	static String color; // 정적('static')필드 : 객체화해서 사용하거나 클래스명으로 호출한다.
	
	
	//메소드(인스턴스메소드) : 객체화(=인스턴스화)해서 호출됨. 오버라이딩(Overriding) 가능
	void cry() {
		System.out.println("모든 동물은 웁니다.");
	}

	
	//메소드(정적메소드) : 객체화해서 호출. 객체화하지 않고(객체 생성하지 않고) 클래스명으로 호출
   //static void cry()	  <= 정적메소드	 
   //  키  리턴타입 메소드		
	static void eat() {
		System.out.println("모든 동물은 밥을 먹습니다.");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
