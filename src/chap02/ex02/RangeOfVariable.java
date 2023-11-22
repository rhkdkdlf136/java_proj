package chap02.ex02;

public class RangeOfVariable {
	public static void main(String[] args) {
//		main 메소드 : 코드 작성
//			메소드 : 객체지향언어에서 함수를 메소드라고 호칭함.  메소드==함수
		
//		변수의 사용 범위 : 전역 변수, 지역 변수
		
//		전역 변수 : 선언된 곳에서만 유효
		int a = 10;
		
		{	//if, swich, for, while, do~while .. <= 제어문, 반복문
//			지역 변수(블록내에서) : 그 블록내에서만 사용됨. 
			int b = 20; 
			
			System.out.println("a(전역변수) 변수의 값을 출력(내부 블록에서) : " + a); //내부에서
			System.out.println("b(지역변수) 변수의 값을 출력(내부 블록에서) : " + b); //내부에서
			
			{
				int c = 30;
				System.out.println("==============================");
				System.out.println("블록의 블록에서 a : " + a);
				System.out.println("블록의 블록에서 b : " + b);
				System.out.println("블록의 블록에서 c : " + c);
				System.out.println("==============================");

			}
//			System.out.println("블록의 블록에서 c : " + c);

		
		}
		System.out.println("a(전역변수) 변수의 값을 출력(외부 블록에서) : " + a); //외부에서
//		System.out.println("b(지역변수) 변수의 값을 출력(외부 블록에서) : " + b); //외부에서 => 오류뜬다.

		
		
		
		
		
		
		
		
		
	}
}
