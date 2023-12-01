package lab.chap10;

public class Dog extends Animal{ //Animal 자식

	String cry;
	
	Dog(String cry){
		this.cry = cry;
	}
	
	void shouting() {
		System.out.println("멍멍멍");
	}
}
