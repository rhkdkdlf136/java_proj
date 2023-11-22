package chap02.ex03;

public class TypeCasting {

	public static void main(String[] args) {
		/* 	TypeCasting : 자료형의 형식을 변환
			
			기본 자료형 8가지 :  ( RAM : Stack 공간 변수명과 값 저장 )
			byte < short/char < int < long < float < double
		  
		  	참조 자료형, 무한대로 생성(객체) : Stack 공간엔 변수명(값이 위치한 참조 주소). Heap 공간엔 값
		  		객체,배열,인터페이스
		  	
		  	-- 자동으로 캐스팅 : 업캐스팅(낮은 자료형에서 높은 자료형으로 자동으로 일어남)
		  	-- 수동으로 캐스팅 : 다운캐스팅(높은 자료형 -> 낮은 자료형으로 변경). ' (int) '처럼 명시해야한다.
		  	
		  	연산을 할 때 Type이 정확해야한다.
		  		
		 */		  
		
//		1. 자동 캐스팅(업캐스팅)
		int a = 10;
		double b = 20.55;
		
		System.out.println(a + b);  // ' a(int) + b(double) ' <= int가 자동으로 double타입으로 업캐스팅. 
		
//		2. 수동으로 다운 캐스팅
		System.out.println( (int)(a + b) );  // ' (a+b) '의 double 값을 강제로 ' (int) ' 타입으로 변환.
		
//		변수의 값을 할당할 때 
		double c = 100; // 정수(100)가 자동으로 업캐스팅되어 double형 변수에 할당됨(100.0).
		int d = (int)200.5; // d는 int형인데 200.5는 double형. 실수를 다운캐스팅(int형으로)하여 정수 변수에 할당해야함.
		
		System.out.println(c); // 실수 100.0 
		System.out.println(d); // 정수 200 
		
		
		
		
		
	}

}
