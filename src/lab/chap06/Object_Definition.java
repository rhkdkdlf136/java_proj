package lab.chap06;

class Animal {
	//1.필드
	String aName;
	String aColor;
	int aLeg;	//팔다리 개수
	int aSpeed;
	String aCry;
	
	Animal() {}
	//생성자: 필드의 기본 값을 입력하는 생성자
	Animal(String aName, String aColor, int aLeg, int aSpeed, String aCry){
		this.aName = aName;
		this.aColor = aColor;
		this.aLeg = aLeg;
		this.aSpeed = aSpeed;
		this.aCry = aCry;
	}
	
	//메소드 : 필드 모든 값을 출력해주는 메소드
	void printAll() {
		System.out.println("Name : " + aName);
		System.out.println("Color : " + aColor);
		System.out.println("Leg : " + aLeg);
		System.out.println("Speed : " + aSpeed);
		System.out.println("Cry : " + aCry);
	}
	
	//메소드 : int abc() { return aLeg+aSpeed; }
	int abc(int aLeg, int aSpeed) {
		return aLeg + aSpeed;
	}
	
}



public class Object_Definition {

	public static void main(String[] args) {

		//객체 생성 및 테스트
		//호랑이, 독수리, 사자, 개
		
		
		System.out.println("호랑이 =======================================");
//		Animal a1 = new Animal();
//		a1.printAll();
		
		Animal a1 = new Animal("호랑이", "노랑색", 4, 100, "어흥");
		
		a1.printAll();
		System.out.println("합계 : " + a1.abc(4, 100));
		
		
		
		System.out.println("독수리 =======================================");
//		Animal a2 = new Animal();
//		a2.printAll();
		
		Animal a2 = new Animal("독수리", "갈색", 2, 200, "까악");
		
		a2.printAll();
		System.out.println("합계 : " + a2.abc(2, 200));
		
		
		
		System.out.println("사자 =======================================");
//		Animal a3 = new Animal();
//		a3.printAll();
		
		Animal a3 = new Animal("사자", "백색", 4, 110, "어흥어흥");
		
		a3.printAll();
		System.out.println("합계 : " + a3.abc(4, 110));
		
		
		
		System.out.println("개 =======================================");
//		Animal a4 = new Animal();
//		a4.printAll();
		
		Animal a4 = new Animal("강아지", "검은색", 4, 50, "멍멍멍");
		
		a4.printAll();
		System.out.println("합계 : " + a4.abc(4, 50));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
