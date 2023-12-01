package chap10.ex03;

public class Method_Overriding_Test {

	public static void main(String[] args) {

//		※Method Overriding (메소드 오버라이딩) : 인스턴스 메소드만 오버라이딩 가능.
//			-정적 메소드 : ' static 메소드명 '. 객체 생성없이 ' 클래스명.메소드명 '으로 호출된다.
//			-인스턴스 메소드 : 메소드명 앞에 static키가 붙지 않은 메소드. 인스턴스 메소드는 객체화해서 호출이 가능함.
//			-상속관계에서 적용 가능.
//			-부모에서 선언된 인스턴스메소드를 자식에서 재정의해서 사용하는 것.
//			-다형성 : 자식을 객체화해서 부모타입으로 선언한 후 부모의 메소드를 호출시 자식의 오버라이딩된 메소드가 작동된다. 
//				    부모의 메소드 호출시 자식의 오버라이딩된 메소드가 작동.
		
		
//		1.객체 생성 : Animal
		Animal a1 = new Animal();
		
		
		//인스턴스 필드
		a1.name = "동물";
		a1.age = 10;
		
		//인스턴스 메소드
		a1.cry();
		
		 
		
		//정적 필드
		a1.color = "빨강";
		
		//정적메소드
		a1.eat();
		
		System.out.println("=====================");
//		2.객체 생성없이 클래스명으로 필드,메소드 호출  <= static이 붙어있는 필드와 메소드
		Animal.color = "노랑";
		Animal.eat();
		
		
		System.out.println("=====================================");
		Animal a2 = new Animal();
		a2.cry();

		
		System.out.println("==Dog를 객체화해서 Animal타입으로 지정 : =======================");
		//Dog를 객체화해서 Animal타입으로 지정 : a3는 Animal과 Dog타입을 내포하고 있다.
		Animal a3 = new Dog();
		a3.cry(); // Animal에 있는(필드와 메소드 중) cry()를 호출하지만, (' a3.cry() ')출력은 오버라이딩된 Dog의 cry()가 출력이 된다. <=다형성 
		
		
		System.out.println("==Eigle을 객체화해서 Animal타입으로 지정 =========");
		//Eigle을 객체화해서 Animal타입으로 지정
		Animal a4 = new Eigle(); //오버라이딩되어 있어서 Animal에 있는 cry() 호출시, Eigle의 cry()가 실행(작동)된다.
		a4.cry();

		
		System.out.println("==Lion을 객체화해서 Animal타입으로 지정 ==================");
		//Lion을 객체화해서 Animal타입으로 지정
		Animal a5 = new Lion();
		a5.cry(); // Animal의 cry()를 호출시 Lion의 cry()가 작동됨
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
