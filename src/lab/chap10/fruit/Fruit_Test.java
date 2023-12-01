package lab.chap10.fruit;

import java.util.ArrayList;
import java.util.List;

public class Fruit_Test {

	public static void main(String[] args) {

//		상속을 통한 '다형성'
//		다형성 : 상속. 부모의 메소드를 출력시 자식의 오버라이딩된 메소드를 출력
		
		
		
//		1.자식 객체를 생성 후 
//		Apple("사과", 30, 5000) 객체를 만들면서 Fruit타입으로 지정 (; Fruit apple = new Apple(~
//		Banana("바나나", 44, 6000) Fruit타입으로
//		Strawberry("딸기", 55, 7000) Fruit타입으로
		
//		2.ArrayList 객체 3개를 저장
//		3.for문으로 ArrayList의 객체를 끄집어내서 'totalPrice()' 메소드 호출시 (오버라이딩 된)출력문 출력하기
//		4. 출력 : " '000(변수);사과,바나나,딸기'의 전체가격은 : '000'입니다.
		
//		자식객체를 생성하면서 부모타입으로 지정하면, 배열이나 컬렉션에 동일한 타입으로 저장할 수 있다. 끄집어내서 다운캐스팅해서 연산도 할 수 있다
		
		
		//1.자식 객체를 생성하면서 부모 타입으로 저장. <= 배열, 컬렉션에 동일한 타입으로 저장할 수 있다.
		Fruit apple = new Apple("사과", 30, 5000); //apple객체 : Fruit,Apple타입이 있다
		//Fruit타입으로 자식객체(Apple) 생성
		Fruit banana = new Banana("바나나", 44, 6000); //banana객체 : Fruit,Banana타입이 있다
		
	
		Fruit strawberry = new Strawberry("딸기", 55, 7000); //strawberry객체 : Fruit,Strawberry 타입이 있다
	//참고!	
		Apple a1 =new Apple();
		//a1은 Apple타입을 가지고 있어서 ArrayList에 자동으로 Fruit타이으로 업캐스팅되어 들어간다
		
		
//		apple.totalPrice();
//		banana.totalPrice();
//		strawberry.totalPrice();
		
		
		System.out.println("=========================");
		//2.ArrayList 객체 3개를 저장
		List<Fruit> aList = new ArrayList<>(); //import 시켜주기.
		
		aList.add(apple); // 0번 방에 Fruit타입의 apple객체를 담는다.
		aList.add(banana); //1번방
		aList.add(strawberry); //2번방에
	//참고!
		aList.add(a1);
		
		
		//3.for문으로 ArrayList의 객체를 끄집어내서 'totalPrice()' 메소드 호출시 (오버라이딩 된)출력문 출력하기
		//4. 출력
		for (int i = 0; i < aList.size(); i++) { //aList의 각 방에 저장된 객체를 끄집어내서 출력
			aList.get(i).totalPrice();
			//오버라이딩된 totalPrice메소드 안에 출력문을 활용하여 출력하기
		}
		//aList.get(i).totalPrice();
//		' aList.get(i) ' 여기까지가 끄집어낸 객체이고
//		aList.get(i)' .totalPrice(); ' 하여 출력
		
		
		
		System.out.println("==========================================");
//		※자료형에서 자동으로 업캐스팅
//		int aa = 3.5; //오류발생
		int aa = (int)3.5; //큰타입을 작은타입으로 넣을떄는 명시( ' (int) ' )해줘야한다
		
		double bb = 30; // double bb = (double)30; <= 여기선 명시해도 상관없다.
		         //정수30이 자동으로 업캐스팅되어 double형으로 바뀐다(명시를 안해도, 생략해도 된다)
		
//		int cc = 3 + 5.5; //오류발생. 정수 3이 자동으로 업캐스팅되어(더블형으로) 5.5와 계산된 8.5 '더블타입'으로 된다. 
						//대입연산자는 우선순위가 낮다.
		int cc = (int)(3 + 5.5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
