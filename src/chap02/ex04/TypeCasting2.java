package chap02.ex04;

public class TypeCasting2 {

	public static void main(String[] args) {
		
		
		int kor = 77; // 국어점수
		int eng = 88; // 영어점수
		int math = 98; // 수학점수
		
		//합계: kor + eng + math
		System.out.println("합계 : " + (kor + eng + math));
		
		//평균: (kro + eng + math) / 3
		System.out.println("캐스팅하지 않은 평균 : " + (kor + eng + math) / 3 ); //int타입으로 출력(소수점x)
		System.out.println("평균 : " + ((double)(kor + eng + math)) / 3 ); // double형으로 출력(소수점o)
		
		System.out.println("===============================");
		
		int hap = kor + eng + math;
		double avg = ((double)hap) / 3; // hap(int) -> 업캐스팅(double) 후 3으로 나눔
		double avg1 = hap / 3; //87.0  		( 정수/정수=정수값 )을 double형 변수 대입.
		double avg2 = hap / 3.0; //87.66666666666667		정수/더블=더블
	
		
		System.out.println("합계 : " + hap);
		System.out.println("평균 : " + avg ); // double형으로 출력(소수점o)

		System.out.println("=============================");
		System.out.println("avg1 평균 : " + avg1); // (hap/3)의 값(int형)을 double형 avg1으로
		System.out.println("avg2 평균 : " + avg2); // (hap/3.0)의 값(double로 업캐스팅된)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
