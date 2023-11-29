package lab.chap06;

public class Product_Test {

	public static void main(String[] args) {

//		1.Product 객체 4개 생성
//		2.setter를 사용해서 객체의 필드의 값을 주입
//		3.배열 arr , 방크기는 10개(0~9) 생성. 각 방에 4개의 객체를 배열방에 넣음.
//		4.배열의 값을 끄집어내서 Product의 변수'p'에 담고 출력(for문)
		
		
		//1.Product 객체 4개 생성
		Product prod1 = new Product();
		Product prod2 = new Product();
		Product prod3 = new Product();
		Product prod4 = new Product();
		
		
		//2.setter를 사용해서 객체의 필드의 값을 주입
		prod1.setIdx(1);
		prod1.setProName("화장품");
		prod1.setQty(100);
		prod1.setYear(2000);
		prod1.setProColor("초록");
		
		prod2.setIdx(2);
		prod2.setProName("사과");
		prod2.setQty(500);
		prod2.setYear(2023);
		prod2.setProColor("빨강");
		
		prod3.setIdx(3);
		prod3.setProName("컴퓨터");
		prod3.setQty(50);
		prod3.setYear(2022);
		prod3.setProColor("검은색");
		
		prod4.setIdx(4);
		prod4.setProName("모니터");
		prod4.setQty(70);
		prod4.setYear(2020);
		prod4.setProColor("흰색");
		
//		System.out.println( prod1 );
//		System.out.println( prod2 );
//		System.out.println( prod3 );
//		System.out.println( prod4 );
		
		
		//3.배열 arr , 방크기는 10개(0~9) 생성. 각 방에 4개의 객체를 배열방에 넣음.
		Product[] arr = new Product[10];
		
		arr[0] = prod1;
		arr[1] = prod2;
		arr[2] = prod3;
		arr[3] = prod4;
		
		//4.배열의 값을 끄집어내서 Product의 변수'p'에 담고 출력(for문)
//		for (int i = 0; i < arr.length; i++) {
//			Product p = arr[i];
//			if (arr[i]==null) continue; //null 감추기
//			System.out.println(p);
//		}
		System.out.println("==========================================");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				Product p = arr[i];
				System.out.println(p);
			}
		}
		
		
		
	}

}
