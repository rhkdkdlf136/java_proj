package chap17.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// ctrl + shift + o : 자동 import

public class ArrayList01 {

	public static void main(String[] args) {

//		※배열 : 
//			-하나의 변수에 많은 값을 저장. 방번호가 있다(index 0번부터 ~~). 방 크기 선언한다.
//			-동일한 타입의 자료를 저장 할 수 있다. 기본자료형, 참조자료형
//				int[] arr1 = new int[50];  <=기본자료형
//				Student[] arr2 = new Student[50];  <=참조자료형 (Student 클래스 타입 자료형의 객체를 arr2변수에..)
//			-단점: 배열의 중간에 값을 삭제할 경우 자동으로 당겨지거나 늘어나지 않는다
//				  배열의 방의 크기가 지정되면 수정이 불가능.
//				  새로운 배열의 방크기를 지정하고 기존 배열의 값을 저장
		
//		※컬렉션(프레임워크) : 배열의 단점을 보완해서 만든 클래스
//				메소드 선언        메소드 구현
//			- List (인터페이스) : ArrayList, LinkedList, Vector 
//			- Set (인터페이스) : hashSet, LinkedHashSet, TreeSet <=중복된 값을 넣지 못하도록 만듬.
//			- Map (인터페이스) : HashMap.. 
//			-하나의 변수에 많은 값을 저장.
//			-장점 : 값을 넣으면 무한히 저장할 수 있다. 방 크기를 선언하지 않는다. 
//				   중간에 값을 삭제하면 자동으로 당겨진다. 중간에 값을 넣었을 경우 자동을 이동된다.
//				   제너릭 타입으로(' <> ') 타입을 지정함. 
		
		
		System.out.println("§배열 ==============================");
//		§배열
		String[] arr1 = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println(arr1.length);
//		배열에서 특정방의 값을 삭제 <= 자동으로 줄어들지 않는다. 방크기도 줄어들지 않는다.
		arr1[2] = null; // 스트링이기 때문에 null을 넣어서 방값을 초기화
		arr1[3] = null;
		System.out.println( Arrays.toString(arr1) );
		System.out.println(arr1.length); //중간에 삭제해도 크기는 줄어들지 않는다
		
		
		
		System.out.println("§컬렉션 : ArrayList =========================");
//		§컬렉션 : ArrayList
//			List : 인터페이스 <= 메소드를 선언
//			ArrayList : List 인터페이스를 구현한 구현체 <= 선언만된 메소드를 구현한 구현체
//			improt 가 필요함
		
		
		List<String> aList = new ArrayList<String>();
//   (부모타입)List의 구현체                        선언
//		   ' <String> ' 타입지정(래퍼클래스인 객체형타입으로 지정)
		List<String> aList2 = new ArrayList<>();
//						                ' <> '에서 String 생략
		ArrayList<String> aList3 = new ArrayList<>();
		
		//ArrayList : 메소드를 사용해서 값을 넣고 삭제하고 등
		//' aList.size(); ' <= 방의 개수를 출력
		//' aList.add("가"); ' , ' aList.add("나"); '  <= 값을 넣을 때 'add'메소드
		//' aList.remove("나"); '  '나'라는 글자를 삭제  <= 값을 삭제할 때
		//' aList.get(index); ' 특정 방의 내용 출력 ( index = 방번호 )
		
		//방의 크기를 출력
		System.out.println("방의 개수 : " + aList.size() ); //방의 개수 : 0
		
		//값을 입력
		aList.add("가"); // 방의 마지막방에 추가
		System.out.println("방의 개수 : " + aList.size() ); // 1
		
		//방의 값을 출력
		System.out.println( aList ); //( 원래는 객체 찍으면 원래 메모리 주소가 떠야하는데 , ) 컬렉션은 'toString메소드'가 '오버라이딩' 되어있어서 '값'이 출력된다 
		
		//값을 더 입력
		aList.add("나"); aList.add("다"); aList.add("라");
		aList.add("마");	 aList.add("바"); aList.add("사");
		
		//출력 : 객체 자체를 출력
		System.out.println( aList );
		System.out.println("방의 개수 : " + aList.size() );
		
		//중간에 값을 추가
		aList.add( 3, "안녕"); // index 3번방에 "안녕"이라는 문자(값)를 넣으면 방의 크기를 자동으로 늘려진다.
		    // ( 3번방에 "안녕" 추가 )
		System.out.println( aList );
		System.out.println("3번 방의 추가 후 개수 : " + aList.size() );
		
		//중간에 값 삭제하기
		aList.remove(3); // index 3번방의 "안녕"(값) 삭제하기. 자동으로 최적화됨
		System.out.println( aList );
		System.out.println("3번 방 삭제 후 개수 : " + aList.size() );
		
		aList.remove("라"); // 특정문자(값) "라" 삭제하기
		System.out.println( aList );
		System.out.println("'라' 삭제 후 방 개수 : " + aList.size() );
		
		
		System.out.println("특정 방의 내용을 출력 : ' aList.get(index); ' ( index=방번호 ) ====");
		//특정 방의 내용을 출력 : ' aList.get(index); ' ( index=방번호 )
		
		
		//for문 출력
		for (int i = 0; i < aList.size(); i++) {
			System.out.print(  aList.get(i)  + " "); 
		}
		System.out.println();
		
		
		//배열에서 모든 값 출력 : Arrays.toString(arr) <= arr배열 안에 있는 객체 안의 모든 값을 나열
		//'컬렉션'은 '객체 자체를 출력' ( toString()메소드가 재정의됨 )
		System.out.println( aList ); // ' Arrays.toString(arr) ' 를 쓰는게 아니다(배열에서 쓴다)
		
		
		System.out.println("===================");
		
//		※래퍼 클래스 : 기본자료형을 '객체형'으로 만들어놓은 '클래스'
//		boolean	=> Boolean
//		byte 	=> Byte
//		short	=> Short
//		'int'		=> ' Integer '
//		long	=> Long
//		double	=> Double
//		'char'	=> ' Character '
		
		List<Integer> aList4 = new ArrayList<>();
		//객체 타입 자료형인 <Integer>  ( int : 기본자료형 )
		
		//10의 배수 컬렉션배열 입력 저장
		for (int i = 0, a = 0; i < 100; i++) {
			a += 10;
			aList4.add(a);
		}
		
		//출력
		for (int i = 0; i < aList4.size(); i++) {
			System.out.println(aList4.get(i));
		}
		
		System.out.println("=========================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
