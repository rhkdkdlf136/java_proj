package chap06.ex01;
//	클래스 밖 : 패키지, import, 외부클래스



             //클래스(=설계도(붕어빵 틀과 같은))이며 클래스(설계도)를 통해 객체(붕어빵) 생성.
public class Object_Definition { //	클래스 블록내 : 필드, 메소드, 생성자
//	클래스 블록내 : 필드, 메소드, 생성자
	
	
	// 필드(=멤버변수) : 'Heap공간'에 변수와 값이 저장. '클래스 블록에 선언된 변수를 필드라 호칭'
		//변수 : '메소드 블락내에서 선언된 것을 변수'라고한다. Stack에 변수명, 값. 
//				( 필드(멤버면수)(;클래스내에서) 와 변수(;메소드 블록내) 구분하기 ) 
	String name;
	int age;
	double weight;
	String add;
	
	
	//생성자 (1) : 클래스 이름과 동일하고 리턴타입이 없는 '메소드'. 객체 생성시 필드의 값을 초기화 할 때 사용.
	Object_Definition() {} //기본 생성자. 생략해도 됨. 객체 생성시 생성자 호출해서 필드의 값을 초기화.
	
	//생성자(인풋 값이 존재하는 생성자) (2)
	Object_Definition(String name, int age, double weight, String add) {
//		생성자 메소드   (  "이순신"     40          88.8         "부산"   )
		//this : 자기자신의 객체 필드(멤버변수)를 뜻한다. 인풋 변수 이름 = 받는 변수 이름 = 필드(멤버변수)이름이 동일 할 경우 'this'
		this.name = name;
//		필드 name =(대입) 매개변수 인풋값
		this.age = age;
		this.weight = weight;
		this.add = add;
	}
	
	
	//메소드(=함수) : 호출시 작동.
	  void     printName() { // { 실행시 호출 코드; }
//리턴타입(void) 메소드명(printName(입력매개변수))	
		  
		int a = 10; //변수 : 'Stack공간'에 변수명과 값이 들어있다
		
		System.out.println("필드에 입력된 이름 : " + name);
	}
	  
	  //리턴타입 메소드명() { 실행블록; } 
	  int printAge() {
//	리턴타입(int) 메소드명(printAge)
		  return age;
	  }
	  
	  void printAll() {
		  System.out.println("이름 : " + name + " , 나이 : " + age );
		  System.out.println("몸무게 : " + weight + " , 주소 : " + add );
	  }
	
	  
	
//	메소드(=함수) 블록     main메소드
	public static void main(String[] args) { //	메소드(=함수) 블록

//		※절차적 지향 프로그램(POP) : 시간의 순서에 따라서 프로그래밍. c언어
//			-성능이 우수하다. 유지보수하기 힘들다.
//			-규모 커지면 개발하기 어렵다. 반복된 코드가 계속 적용될 수 있다.
//			-람보르기니, 페라리 <= 고장시 해당 회사에서만 수리 가능하고 수리비도 많이 나온다
//			-한 회사에서 부품의 모든 것을 해당 차에 맞게 최적화애서 만든다
//		※객체 지향 프로그램(OOP) : 객체, 객체 프로그래밍. java, c++
//			-캡슐화(보안), 상속(코드 중복을 방지), 다형성(객체를 여러 형태로 찍어낼 수 있다)
//			-유지보수 하기가 쉽다.
//			-개발하기 쉽다
//			-코드가 굉장히 간결하다.
//			-반복된 코드를 줄일 수 있다 
//			-현대자동차 <= 자동차에 들어가는 많은 부품을 여러 협력사를 통해서 만든다(타이어,시트,엔진 등(자바에서 하나하나의 객체라고 생각))
		
//		※
//		클래스 : 객체를 생성하는 틀. 설계도(;붕어빵 틀 기계와 같은)
//		객체(=인스턴스) : 클래스를 기반으로 RAM에 로드. 건물,붕어빵(;그 자체)
//			-하나의 클래스로 여러개의 객체를 생성할 수 있다
		
		//메소드 블록 안에 있는 것을 '변수'라한다
		String abc;
		
		
		//1.객체 생성 : 클래스를 메모리(RAM)에 올린 것.
			//    클래스명  객체  = new 클래스명();  <= 기본 생성자 호출
		 	//	  타입	 변수명 = new 생성자호출;  
		Object_Definition hong = new Object_Definition();
		
		//2.객체의 필드의 값 등록
		hong.name = "홍길동";
		hong.age = 30;
		hong.weight = 77.5;
		hong.add = "서울";
		
		//3.객체에 메소드 호출. 객체의 메소드 호출.
		hong.printName();
		
		System.out.println( hong.printAge() );
		
		hong.printAll();

		
		
System.out.println("==================================");
		
		//1.객체 생성: 생성자에 매개변수의 값을 넣어서 객체 생성
		Object_Definition lee = new Object_Definition("이순신", 40, 88.8, "부산");
												//   (  매 개 변 수 )    
		
		//2.메소드 호출
		lee.printAll();

		
		
System.out.println("============================");
		
		//1.객체 생성 : 클래스(설계도;붕어빵틀) -----> 객체(건물;붕어빵)
		Object_Definition park = new Object_Definition("박문수", 60, 66.7, "대전");
							   //new 입력 후 'ctrl+스페이스바' 누르면 클래스 관련 메소드 확인 가능
				
		//2.객체의 메소드 호출
		park.printAll();
		
		
		
		//설계도대로 무한정 객체를 생성할 수 있다.
		System.out.println("============================");

		System.out.println( park.name ); //박문수
		System.out.println( park.age ); //60
		
		System.out.println("============================");
		System.out.println( hong.name ); //홍길동
		System.out.println( hong.age ); //30
		
		System.out.println("============================");
		System.out.println( lee.name ); //이순신
		System.out.println( lee.age );  //40
		
		
System.out.println("필드의 값을 수정 ============================");
		lee.name = "이길동";
		lee.age = 77;

		System.out.println( lee.name ); //이순신 => '이길동' 으로 수정
		System.out.println( lee.age );  //40 => '77' 으로 수정
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
