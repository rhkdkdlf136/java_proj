package chap10.ex01;

public class Human { // Human 은 '부모클래스'( super class )
//public class Human extends Object // ' extends Object ' 생략되어있다.
	
	
	//필드
	String name;
	int age;
	
	//기본생성자가 생략됨
	Human(){
		super(); //Object클래스가 호출. java.lang.Object
				//최상위 부모(Human)인데도 ' super() '가 생략되어있다.
	}
	 
	//(추가)생성자
	Human(String name, int age){ //Student에서 super("김똘똘", 20); 호출시
//		super();
		this.name = name; 
		this.age = age;
	}
	
	
	//메소드
	void eat() {
		System.out.println("모든 사람은 먹는다");
	}
	
	void sleep() {
		System.out.println("모든 사람은 잠을 잔다");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
