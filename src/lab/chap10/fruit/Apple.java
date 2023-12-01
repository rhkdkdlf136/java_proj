package lab.chap10.fruit;

public class Apple extends Fruit {
	
	//부모의 필드가 상속
	
	Apple() {} // 아래 매개변수 생성자가 있기때문에 헷갈리지않게 기본생성자도 만듦
	
	Apple(String name, int cnt, int price) {
//		super(); //얘가 없더라도 생략되어있다.
		super.name = name; // ' super. ' : 키워드
		super.cnt = cnt;
		super.price = price;
	}
	
	@Override
	void totalPrice() { 
		//코드 작성 : cnt개수 * price가격
		//출력 : " '000(변수);사과'의 전체가격은 : '000'입니다.
		System.out.println(super.name + " 의 전체가격은 : " + (super.cnt * super.price) + "입니다");
		//name,cnt,price는 상속이 되어있기때문에 super.(슈퍼키워드) 작성안해도 출력 가능하다.
	}
	
	
	//name,cnt,price는 상속이 되어있기 때문에 ' super.(슈퍼키워드) ' 작성 안해도 출력 가능하다.
//	@Override
//	void totalPrice() { 
//		//코드 작성 : cnt개수 * price가격
//		//출력 : " '000(변수);사과'의 전체가격은 : '000'입니다.
//		System.out.println( name + " 의 전체가격은 : " + (cnt * price) + "입니다");
//	}
	
	
	

}
