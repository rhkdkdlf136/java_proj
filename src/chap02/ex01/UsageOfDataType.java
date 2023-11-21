package chap02.ex01;
//패키지 : 폴더

public class UsageOfDataType { //클래스 영역
	public static void main(String[] args) {//메인 메소드
		
//		변수 : 한 번 선언 후 변수의 값을 다른 값을 할달할 수 있다. 소문자로 시작해서 카멜케이스 이름 작성 
//		상수 : 변수 선언 앞에 final 키가 등록됨. 상수명은 대문자로만 지정. 한 번 값을 할당하면 수정할 수 없다.
		
		/*자료형 : 변수/상수를 정의할 떄 반드시 자료형이 와야한다. <<교재 60p>>
			-기본 자료형(8개) : 메모리의 Stack 공간에 변수와 값을 할당
				boolean(true나 false만 저장 가능), 정수(byte, short, int, long), 실수( float, double), 문자( char)
			-참조 자료형(무한대 생성 가능) : 메모리의 Stack 공간에는 변수명, 값은 Heap 에 저장된다.
				첫자는 대문자
				객체/ 배열/ 인터페이스
				String : 참조자료형, 문자열을 담는다.
	*/
		
//		변수 선언 방법(2가지)
//		1.변수 선언 후 값은 나중에 할당
		int a; //변수 선언 후
		int b;
		
		a = 1; //변수의 값은 나중에 할당
		
		System.out.println(a);
//		System.out.println(b);	// 오류 발생 원인 : 변수 선언 후 값이 할당이 안 되어있다.
		
//		2.변수 선언과 동시에 값을 할당
		int c = 10;	
		int d = 20;
		System.out.println(c); //10
		System.out.println(d); //20
		
//		리터럴 : 변수, 상수에 들어가는 값
		
//		변수에 새로운 값을 재할당할 수 있다
		c = 55;
		d = 66;
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
//		상수 : 한번 값이 할당되면 다른 값을 넣을 수 없다. final 키를 넣어서 상수 선언
//			-상수명은 대문자로 할당
		final int ABC = 200;
		final double PI = 3.14;
//		ABC = 300; 상수는 새로운 값을 넣으면 오류 발생
		
		System.out.println(ABC);
		
		
		System.out.println("\n8가지 자료형=================");
//		기본 자료형 8가지
//		1.boolean
		boolean abc; // boolean은 true, false 값만 넣을 수 있다.
		abc = true;
		
		System.out.println(abc);
		
//		2.정수값을 넣을 수 있는 자료형(byte : 1byte, short : 2byte, int : 4byte, long : 8byte )
//		byte : 1byte (8bit) : -128 ~ 127
		byte aa;
		byte bb;
		aa = -128;
		bb = 127;
		
		System.out.println(aa);
		System.out.println(bb);
		
//		short : 2byte (16bit) : -32,768 ~ 32,767
		short cc;
		short dd;
		cc = -32768;
		dd= 32767;
		
		System.out.println(cc);
		System.out.println(dd);
		
		
//		int : 4byte (32bit) : -2,147,483,648 ~ 2,147,483,647
		int ee;
		int ff;
//		콤마(,)없이 언더바( _ ) 를 넣어도 (실행)된다. ' _ '는 구분자로 생략 가능
		ee = -2_147_483_648;
		ff = 2_147_483_647;
		
//		long : 8byte (64bit) : -2^63 ~ 2^63-1
//		64 bit : 처음 비트( MSB, 부호를 처리하는 비트)
//		리터럴 l, L 을 맨 뒤에 명시 해야한다
//		정수의 범위를 벗어난 값을 넣을 때 : L

		long gg;
		long hh;
		gg = -9_223_372_036_854_775_808L; // 리터럴에 ' L '을 적용
		hh = 9_223_372_036_854_775_807L;
		
		System.out.println(gg);
		System.out.println(hh);
		
		long ii;
		ii = 5000; //int 범위내의 값을 얹을 때 L을 명시하지 않아도 된다.
		
		System.out.println("\n실수 : float, double (double이 기본)");
//		실수 : float, double (double이 기본)
//		float : 4byte (32bit) , 소수점 7자리까지 정밀도가 유지됨. 리터럴 뒤에 ' f, F ' 를 넣어준다 
		float jj;
		jj = 3.14888888888888888888F; // 값 뒤에 ' F '를 넣어줘야한다. 소수점 7자리까지 그 뒤는 처리가 안된다.
		System.out.println(jj);
		
//		double : 8byte (64bit) , 소수점 15자리까지 정밀도가 유지됨.  
		double kk;
		kk = 1488888888888888888888888888888888888D;
		System.out.println(kk);
		
		
		System.out.println("\nchar : 1개 문자를 넣을 수 있음. 영문, 한글, 일본어, 중국어 등.  (문자열(2글자 이상) : String)");
//		char : 1개 문자를 넣을 수 있음. 영문, 한글, 일본어, 중국어 등.  (문자열(2글자 이상) : String)
		/*
			- char 의 값을 넣을때는 ' '
			- 1개 문자
			- 문자, 아스키코드 값(10진수), 유니코드(16진수) 값 할당할 수 있다
			
			-아스키코드 : 7bit, 영어대(소)문자, 숫자, 특수문자 등
			-유니코드 : 2byte~3byte. 한글, 일본어, 중국어 등
		 */
		
		char ll;
		ll = 'A';
		char mm;
		mm = '가';
		System.out.println(ll);
		System.out.println(mm);
		
//		문자로 값넣기 : a
		char nn = 'a';
		System.out.println(nn);
		
//		10진수 아스키코드 값으로 값 넣기 : a
		char oo = 97; //아스키코드 숫자' 97 '은 문자로 ' a ' 이다
		char o = 0x61; //아스키코드 16진수 표현법
		System.out.println(oo);
		System.out.println(o);
		
//		16진수 유니코드 값으로 값 넣기 : a
		char pp = '\u0061'; //유니코드
		System.out.println(pp);
		
		
		char firstName1 = '\uad11';
		char firstName2 = '\uc77c';
		char lastName = '\ubc15'; //성
		
		
//		출력내용 :  나의 이름은 박광일 입니다
//		println(); 출력
		System.out.println("나의 이름은 \"" + lastName + firstName1 + firstName2 + "\" 입니다.");
//		printf(); 출력. %c : char변수의 값을 불러옴. %b : boolean 변수의 값을 불러옴
		System.out.printf("나의 이름은 \"%c%c%c\" 입니다." , lastName, firstName1, firstName2);
		
		
		
		
		
		
		
		
	
	}
}
