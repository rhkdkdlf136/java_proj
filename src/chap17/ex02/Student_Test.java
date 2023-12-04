package chap17.ex02;

import java.util.ArrayList;
import java.util.List;

//<<Student클래스와 연계>>

public class Student_Test {

	public static void main(String[] args) {

//		1.Student 객체 생성
		Student s1 = new Student(); //기본 생성자 호출
		Student s2 = new Student("홍길동");
		Student s3 = new Student(1111);
		Student s4 = new Student("김길동", "서울");
		Student s5 = new Student("최길동", "서울", 1111);
		
//		System.out.println(s1); //[name=null, addr=null, num=0, kor=0, eng=0, math=0]
//		System.out.println(s2); //[name=홍길동, addr=null, num=0, kor=0, eng=0, math=0]
//		System.out.println(s3); //[name=null, addr=null, num=1111, kor=0, eng=0, math=0]
//		System.out.println(s4); //[name=김길동, addr=서울, num=0, kor=0, eng=0, math=0]
//		System.out.println(s5); //[name=최길동, addr=서울, num=1111, kor=0, eng=0, math=0]
		
		
//		2.객체를 ArraysList<Student> 에 저장 <= 배열보다는 '컬렉션' 활용하기(;컬렉션이 더 많이 쓰인다)
		List<Student> aList = new ArrayList<>();
			//<데이터타입> : 제너릭타입은 '객체형 타입'이 적용되어야함. (기본자료형인 int 등은 안된다)
					//래퍼클래스 : Boolean, Byte, Short, 'Integer', Long, Float, Double, 'Character'
		
		//aList 에 Student객체 저장
		aList.add(s1);
		aList.add(s2);
		aList.add(s3);
		aList.add(s4);
		aList.add(s5);
		
		//출력
		for (int i = 0; i < aList.size(); i++) {
			System.out.println( aList.get(i) );
		}
		
		//리스트만 넣게 되면 오버라이딩 된 toString() 메소드에 의해 리스트에 존재하는 모든 데이터들이 한줄로 출력
		
		
System.out.println("Method자바파일과 연계 =============================================");
//<'Student클래스'와 'Method클래스' 연계>
		
		int[] arr = new int[] {1, 2, 1, 3, 3, 3, 4, 5, 5};
		
//		1.Method (클래스, 타입) => 객체 생성
		Method m = new Method();
		
		
		//인풋 입력 받아 출력. 객체 생성 후 메소드 호출
		m.arryListOut(aList);
		
		
		System.out.println("====================================");
		//인풋 받은 배열(arr1)에서, 정수로 들어오는 값(i)이 배열안에서 동일한 값이 몇 개인지 출력
		m.arrayOutPut(arr, 1); //arr 배열에서 '1'이 몇 개인지
	  //' m. ' 입력하면 실행할 수 있는 메소드 목록이 팝업된다
		
		
		System.out.println("====================================");
		//List<Student>(;List타입의 Student 객체)객체를 받아서 각 객체의 '이름과 주소'를 출력하는 메소드
		m.nameAddr(aList);
		
		
System.out.println("====================================");
		aList.add(new Student("이순신", 55, 66, 77));
		//이미 aList에 5개가 들어 있는데, 'new Student()'입력하여 값을 추가한다.
		aList.add(new Student("김순신", 54, 64, 74));
		aList.add(new Student("홍순신", 53, 63, 73));
		
		m.all(aList); // Method클래스 All() 메소드 호출
		
		System.out.println("====================================");
		m.sMethod(new Student("박순신", 77, 55, 90));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
