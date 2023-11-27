package lab.chap01;

public class ConsoleOutPut1 {

	public static void main(String[] args) {

		//변수 선언 : 소문자 시작. 여러단어가 이어질때는 첫자를 대문자로 변수명 할당(카멜케이스)
		String fatherName = "홍길동";
		String motherName = "홍길순";
		String myName = "홍당무";
		
		int age = 30;
		
		double weith1 = 70.5;
		double weith2 = 50.7;
		
		//출력 내용: 우리 아버님 이름은 '홍길동', 우리 어머님 이름은 '홍길순' 입니다.
		//		  나의 이름은 '홍당무'이고, 나이는 '30'살이고, 몸무게는 '70.5' 킬로입니다.
		
		//println(); 출력
		System.out.println("우리 아버님 이름은 " + fatherName + ", 우리 어머님 이름은 " + motherName + "입니다.");
		System.out.println("나의 이름은 " + myName + ", 나이는 " + age + ", 몸무게는 " + weith1 + "킬로입니다.\n");
		
		//printf(); 출력
		System.out.printf("우리 아버님 이름은 %s, 우리 어머님 이름은 %s 입니다.\n", fatherName, motherName);
		System.out.printf("나의 이름은 %s, 나이는 %d, 몸무게는 %4.1f 킬로입니다",  myName, age, weith1);
		
		
	}
}
