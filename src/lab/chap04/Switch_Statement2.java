package lab.chap04;

import java.util.Scanner;

public class Switch_Statement2 {

	public static void main(String[] args) {
//		switch ~ case문으로 프로그램 작성
//		'월' 을 입력해서 해당 월은 '00일' 입니다.
		
//		31일을 출력되는 월: 1, 3, 5, 7, 8, 10 ,12
//		30일이 출력되는 달: 4, 6, 9, 11
//		28일이 출력되는 달: 2
//		스캐너로 '월'만 입력 받고, 해달 월에 대한 '일'을 출력함
//		출력 내용 : " 해당 월은 '00'월이고, '00'일까지 존재합니다.
		
		int month;  // 스캐너로 월을 인풋 받는다
		int day =30; // 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(1월 ~ 12월)을 정수로 입력하세요.>>>>>");
		month = sc.nextInt();
		
//		switch (month) {
//		case 1: case 3: case 5 : case 7: case 8: case 10: case 12:
//			System.out.println("해당 월은 \"" + month + "월\" 이고, \"" + (day+1) + "일\"까지 존재합니다.");
//			break;
//		case 4: case 6: case 9: case 11:
//			System.out.println("해당 월은 \"" + month + "월\" 이고, \"" + (day) + "일\"까지 존재합니다.");
//			break;
//		case 2:
//			System.out.println("해당 월은 \"" + month + "월\" 이고, \"" + (day-2) + "일\"까지 존재합니다.");
//			break;
//		}
				
		
		
		switch (month) {
		case 1: case 3: case 5 : case 7: case 8: case 10: case 12:
			day += 1;	//day = day +1;
			System.out.printf("해당 월은 \"%d월\" 이고, \"%d일\"까지 존재합니다.\n\n", month, day);
			break;
		case 2:
			day -= 2;
			System.out.printf("해당 월은 \"%d월\" 이고, \"%d일\"까지 존재합니다.\n\n", month, day);
			break;
		default :  //4, 6, 9, 11월
			System.out.printf("해당 월은 \"%d월\" 이고, \"%d일\"까지 존재합니다.\n\n", month, day);
		}
		
		
		
		
		
		
		
		
		
	}

}
