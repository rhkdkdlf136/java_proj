package chap10.ex03;

public class Dog extends Animal {

//	부모의 모든 필드와 메소드 상속
	
	@Override    // 자식(Dog)이 부모(Animal)에 있는 cry()를 덮어쓴다.
	void cry() { //자식에서, 부모에서 선언된(인스턴스) 메소드를 자식에서 새롭게 정의해서 쓴다
//		super.cry();
		System.out.println("개는 멍멍하고 짖습니다.");
	
	}
	
	
	
	
	
	
	
}
