package chap17.ex02;

import java.util.List;

public class Method {

	
//	1.필드
    // 참조타입      변수
	List<Student> aList;
	int[]          arr;
	
//	2.기본 생성자 생략됨 ( ' Method() {} ' )
	
	
//	3.메소드 : 인풋 입력 받아 출력. 객체 생성 후 메소드 호출
	void arryListOut(List<Student> aList) {
		         //    List타입의    변수
	            //aList를(변수) 인풋 받아서 aList의 'List타입의<Student>객체'를 끄집어내서 모든 필드의 내용을 출력
	            //aList 안에 Student 객체가 들어있다
	
	//출력1
//		for (int i = 0; i < aList.size(); i++) {
//			System.out.println(aList.get(i));
//		}

		
	//출력2
		for (int i = 0; i < aList.size(); i++) {
	
			Student s = aList.get(i);
			System.out.println(s);
		}

	}
	
	
	void arrayOutPut(int[] arr1, int a) {
                //인풋값 (배열arr1, 정수a) 입력을 받아서~
	//출력 : 인풋 받은 배열(arr1)에서, 정수로 들어오는 값(i)이 배열안에서 동일한 값이 몇 개인지 출력
		
		int count = 0; // 들어오는 정수 개수를 카운트하는 변수
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == a) { //각 방의 값은 루프돌면서 a와 같을 때 카운트된다.
				count++;
				
			}
		}
		System.out.println("인풋 받은 정수는 : " + a + "이고, 배열에 " + count + " 개 있습니다.");
		
	}
	
	
	//List<Student>(;List타입의 Student 객체)객체를 받아서 각 객체의 '이름과 주소'를 출력하는 메소드
	void nameAddr(List<Student> aList) {
		for (int i = 0; i < aList.size(); i++) {
			Student s = aList.get(i);
			
			System.out.println("이름 : " + s.getName() + ", 주소 : " + s.getAddr());
		}
	}
	
	
	//List<Student> 객체를 받아 객체를 끄집어내서 메소드( ' hapAvg() ' ) 호출 
	void all(List<Student> aList) {
		for (int i = 0; i < aList.size(); i++) {
			Student s = aList.get(i);
			s.hapAvg(); //Student클래스의 kor, eng, math 점수를 합계와 평균을 구해서 출력하는 메소드
		}
	}
	
	
	void sMethod(Student s) { //Student객체의 s객체를 던져주면 그 객체안의 메소드 hapAvg() 호출
		s.hapAvg();
	}
	
	
	
	
	
	
	
}
