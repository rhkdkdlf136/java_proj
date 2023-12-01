package lab.chap10.fruit;

public class Fruit { //부모클래스
	
	
	String name; //과일 이름
	int cnt; //과일 개수
	int price;  //과일 가격
	
	
	
	//메소드 오버라이딩하기(중요)
	void totalPrice() {
		System.out.println("모든 과일의 합계는 : " + (cnt * price)  );
	}
	
	
	
	
	
	
	

}
