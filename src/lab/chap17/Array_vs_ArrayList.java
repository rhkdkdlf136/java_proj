package lab.chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mytest.integer;

public class Array_vs_ArrayList {

	public static void main(String[] args) {

//		배열: arr  : 100번 방 , 10의 배수만 저장 후 출력 <= for, Arrays.toString
//		컬렉션: aList : 20의 배수 100번방까지 저장, for문으로 출력
	
		
//		배열 : 참조자료형. 방의 개수 선언.
//			- ' 자료형[] 변수 = new 자료형[방개수]; '
		
//		컬렉션 : 자동으로 방크기가 늘어나고 줄어든다. 
//			   제너릭 타입으로 래퍼클래스로 선언<Integer>
//			   import해서 사용
//			   메소드를 사용해서 값을 넣고 삭제하고 출력한다
//			-ArrayList   : ' List<Integer> aList = new ArrayList<>(); '
//				aList.add(값)  <= 마지막방에 값을 추가
//				aList.add(index, 값)  <= 인덱스 방번호에 값을 넣음
//				aList.size()  <= 방의 개수
//				aList.remove(index)  <= 삭제 
//				aList.remove(값)
//				aList.get(index)  <= index에 해당하는 내용(값) 출력
		
		
		
	System.out.println("배열 ======================================");
//배열: arr  : 100번 방 , 10의 배수만 저장 후 출력 <= for, Arrays.toString
		int[] arr = new int[100];
		
		
		//배열 각 방에 값 넣기
		for (int i = 0, a = 1; i < arr.length; a++) { // arr.length;  <=배열 방의 개수
			if(a % 10 == 0) {
				arr[i] = a;
				i++;
			}
		}
		//for문 출력
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//향상된 for문 출력
		for (int k : arr) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		//Array.toString() 출력
		System.out.println( Arrays.toString(arr) );
		
		
		
	//방법2
//		for (int i = 0, a = 0; i < arr.length; i++) {
//			a += 10;
//			arr[i] = a;
//		}
//		//출력
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		
	System.out.println("컬렉션 ======================================");
		//
//컬렉션: aList : 20의 배수 100번방까지 저장, for문으로 출력
		List<Integer> aList = new ArrayList<>();
								// 구현제로 넣어줘야한다.
		ArrayList<Integer> aList2 = new ArrayList<>();
		
		
		for (int i = 0, b = 1; i < 100; b++) {
			if(b % 20 == 0) {
				aList.add(b); // ' add() '에서 ()에 i가 아닌 값인 'b'넣어줘야한다.
				i++;
					
			}
		}
		System.out.println("컬렉션의 방의 크기 : " + aList.size()); 
		
//		for (int i = 0; i < aList.size(); i++) {
//			System.out.println(i + " , " + aList.get(i) );
//		}
		
		for (int i = 0; i < aList.size(); i++) {
			System.out.print(aList.get(i) + " " );
		}
		
		System.out.println();
		System.out.println( aList ); // 값을 바로 찍어준다.
		
		
	//방법2
//		for (int i = 0, a = 0; i < 100; i++) {
//			a += 20;
//			aList.add(a);
//		}
//		System.out.println("컬렉션의 방의 크기 : " + aList.size()); 
//		
//		for (int i = 0; i < aList.size(); i++) {
//			System.out.println( aList.get(i) );
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
