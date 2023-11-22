package lab.chap02;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		//스캐너로 각 변수의 값을 인풋 받아서
		Scanner sc = new Scanner(System.in);
		
		String stu1; //학생1
		
		int kor; //국어점수
		int eng; //영어점수
		int math; //수학점수
		
		int hap; //점수의 합계
		double avg; //평균
		
		System.out.println("=====첫번째 학생=====");
		System.out.print("학생1의 [ 이름, 국어점수, 영어점수, 수학점수 ]를 입력하세요. >>>>> ");
		stu1 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap/3.0;
		
		System.out.println(stu1 + "의 모든 점수의 합계는 '" + hap + "'점이고 평균은 '" + avg + "'점입니다\n");
		
		
		System.out.println("=====두번째 학생=====");
		String stu2;
		System.out.println("학생2의 이름과 국어점수, 영어점수, 수학점수를 입력하세요. >>>>> ");		
		stu2 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap/3.0;
		
		System.out.println(stu2 + "의 모든 점수의 합계는 '" + hap + "'점이고 평균은 '" + avg + "'점입니다\n");
		
		
		System.out.println("=====세번째 학생=====");
		String stu3;
		System.out.println("학생3의 이름과 국어점수, 영어점수, 수학점수를 입력하세요. >>>>> ");		
		stu3 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap/3.0;
		
		System.out.println(stu3 + "의 모든 점수의 합계는 '" + hap + "'점이고 평균은 '" + avg + "'점입니다\n");
		
//		System.out.println("홍길동의 모든 점수의 합계는 333점이고 평균은 88.99점입니다."); //출력 결과
		
		
		
		
		
	}

}
