package lab.chap10;

public class Animal {

	String name;
	String color;
	
	Animal(){}
	
	Animal(String name, String color){
		this.name = name; 
		this.color = color;
		System.out.println("나의 이름은 : " + name + " 이고, 색깔은 : " + color + "입니다");
	}
	
	void eat() {
		System.out.println("모든 동물은 먹는다");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잔다");
	}
	
	
	
}
