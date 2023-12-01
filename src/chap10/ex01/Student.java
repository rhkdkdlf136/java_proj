package chap10.ex01;


	       //자식클래스        부모클래스
public class Student extends Human { //자식클래스
	
//	Human클래스의 필드와 메소드가 Student클래스로 상속
	
	
//	필드 : 
	String stuName;
	int studentID;
	
	
	
//	(현재 기본생성자 생략되어 있다)
	Student(){
		super(); // 부모클래스의 super() 생성자를 호출  
				// 얘(부모클래스의 기본생성자) 자체가 생략되어 있다(상속관계에 있을때). 
	}
	
	Student(int studentID){
//		super(); //원래는 첫 라인의 ' super() '(부모클래스의 생성자) 가 항상 생략되어있다.(아래는 super생성자 예시)
		super("김똘똘", 20); // 부모클래스의 인풋이 2개인 생성자 호출. Human(String name, int age)
		
		this.studentID = studentID;
		this.stuName = super.name;
	  //자기자신(this)   부모필드(super)
		super.eat(); //부모에 있는 메소드
	}
	
	
	
//	메소드
	void goToSchool() {
		System.out.println("모든 학생은 학교를 갑니다");
		
	}
	
	void stuInfo() {
		System.out.println("학생이름은 " + name + " 이고, 나이는 " + age + "입니다."); 
							//Student엔 'name,age필드'가 없기 때문에 부모클래스에서 'name,age'를 가져온다
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
