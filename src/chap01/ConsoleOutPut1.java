package chap01;
//패키지 : 클래스를 관리하는 폴더

public class ConsoleOutPut1 {//클래스 블록
	public static void main(String[] args) {//메인 메소드 블록: 클래스 블록 내부
	//메인 메소드 내부에서 코드를 작성 <= 객체를 다루기 전까지
		
	//1. System.out.println();  <= 콘솔에 출력 후 라인을 개행   
		// 문자열 출력 : " 출력할 문자열 "
		System.out.println("안녕하세요");
		
		// 문자열을 연결해서 출력 : ' + ' : 정수, 실수 일때는 덧셈. 문자열일때는 연결을 뜻 함.				
		System.out.println("안녕하세요" + " 반갑습니다");
		System.out.println(2 + 3);  //정수를 덧셈
		System.out.println("2" + " 3"); //문자열을 연결
		System.out.println(10.5 + 20.11); // 실수 덧셈
		System.out.println("10.5 " + 20.11);// 문자열(10.5) + 실수(20.11) 연결
		
		
		System.out.println("========================");
		// " 문자열 " , 정수 , 실수
		System.out.println("안녕 " + 123 + 456.7);//전부 문자열 취급(문자열이 앞에 오면 뒤에 오는 것도 문자열로 변환
		System.out.println("안녕 " + ( 123 + 456.7 ) );// 괄호 먼저 처리 후 문자열 취급
		// 정수 , 실수, "문자열"
		System.out.println(123 + 456.7 + " 안녕 ");
		
		
		 
			
		System.out.println("========================");
		/*변수에 값을 할당 후 출력.  
		변수: 메모리에서 변화하는 값을 담을 수 있다.
		변수 선언: ' 자료형 변수명 = 값; ' */
		
		//  =  <= 같다라는 의미가 아님. 왼쪽의 변수에 오른쪽의 값을 할당하라. ' 변수명 = 값; '
		//  ==  <= 같다. 왼쪽값과 오른쪽값이 같으면 'true' 다르면 'false'값을 돌려준다(리턴). 
		
		//문자열을 담는 변수. 문자열엔 더블쿼테이션(" ")을 넣는다.
		String str = "안녕";
		
		//정수를 담는 변수
		int a = 10;
		int b = 20;
		
		//변수를 출력시 " " 를 넣으면 문자열 취급하니 변수 출력시엔 "" 없이 작성한다.
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("========================");
		//문자열과 변수를 연결해서 출력
		System.out.println("str 변수에 담긴 값: " + str);
		System.out.println("a + b = " + ( a + b ));
	
		
		System.out.println("========================");
		//2. System.out.print();  <= 콘솔에 출력 후 라인을 개행하지 않는다. 출력만 한다. \n : 라인을 개행해라. , \t : 탭  
		 System.out.println("오늘");
		 System.out.println("날씨");
		 System.out.println("맑음");
		 System.out.println();

		 
		 System.out.println("==== print(); 출력 ===="); // \n : 개행
		 System.out.print("오늘");
		 System.out.print("날씨");
		 System.out.print("맑음");
		 System.out.println();
		 
		 System.out.println("==== print(); 출력. \\n : 개행 ===="); //  ' \\ ' 역슬래시 두번 입력하면 ' \ ' 가 출력.
		 System.out.print("오늘\n");
		 System.out.print("날씨\n");
		 System.out.print("맑음\n");
		 System.out.println();

		 
		 System.out.println("==== print(); 출력.  \\t : 탭 ===="); 
		 System.out.print("오늘\t");
		 System.out.print("날씨\t");
		 System.out.print("맑음\t");
		 System.out.println("\n========================");
		 
		/*
		 3. System.out.printf();  <= 콘솔에 출력. 출력 문자열 라인의 변수값을 불러오도록 함. 
		 
		 %s : 문자열을 불러들임. , 
		 %d : 정수를 불러들임. 
		 %4.2f : 실수의 값을 불러들임. 전체 4자리 소수점 이하 2자리 출력
		 */
		 
		 str = "맑음"; //이미 선언된 변수의 값을 재할당
		 a = 50;
		 
		 //실수를 넣을 수 있는 자료형
		 double c = 123.4567;  // c 변수에는 실수값을 넣을 수 있음 
		
		 // printf(); 를 사용하서 출력
		 System.out.printf("오늘의 날씨는 \" %s \" 입니다.", str);  // %s : 문자열 변수의 값을 불러들인다.
		 // println(); 을 사용해서 출력
		 System.out.println("\n오늘의 날씨는 \" " + str + " \" 입니다");
		 System.out.println("\n========================");

		 // printf(); 를 사용해서 출력.  <= 문자열과 변수를 출력시 간결하게 출력
		 System.out.printf("오늘 날씨 : %s \n변수 a + b : %d \n실수 c 의 값: %4.2f" , str, (a+b), c);
		 
		 // println(); 을 사용해서 출력  <= 문자열과 변수를 출력시 코드가 길어짐
		 System.out.println("\n\n오늘 날씨: " + str + "\n변수 a+b : " + (a+b) + "\n실수 c의 값: " + c);
		 
		 
		 System.out.println("\n========================");
		 //변수 선언
		 String str1 = "오늘 ";
		 String str2 = "날씨는 ";
		 String str3 = "맑습니다.";
		 int d = 100;
		 
		 //printf();를 출력
		 System.out.printf("%s %s %s 정수의 값은: %d\n", str1, str2, str3, d);
		 //println();을 출력
		 System.out.println(str1 + str2 +str3 + "정수의 값은: " +d);
		 
		 
		 
		 
		 
		 
		 
	}
	//System.out.println("Hello world");  <=메인메소드 밖 오류 발생
}
