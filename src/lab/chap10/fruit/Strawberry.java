package lab.chap10.fruit;

public class Strawberry extends Fruit { //딸기

	Strawberry(){}
	
	Strawberry(String name, int cnt, int price) {
//		super(); //얘가 없더라도 생략되어있다.
		super.name = name; // ' super. ' : 키워드
		super.cnt = cnt;
		super.price = price;
	}
	
	@Override
	void totalPrice() {
		System.out.println(super.name + " 의 전체가격은 : " + (super.cnt * super.price) + "입니다");
	}
	
	
	
	
	
}
