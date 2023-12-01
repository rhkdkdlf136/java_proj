package lab.chap10.car;

import java.util.ArrayList;
import java.util.List;

public class Car_Test {

	public static void main(String[] args) {

//		자식객체를 생성하면서 부모타입으로 지정 후 부모의 메소드 호출시 오버라이딩된 자식의 메소드가 작동된다.
//		car.run();  <= 다형성
		
		Car car1 = new Car();
		car1.name = "자동차 클래스";
		
		car1.run();

		
		System.out.println("==H_Car========================");
		Car c1 = new H_Car();
		//부모의 run() 메소드를 호출시 자식의 오버라이딩 된 메소드 작동됨
		c1.run();
		
		
		System.out.println("==S_Car========================");
		Car c2 = new S_Car();
		//부모의 run() 메소드를 호출시 자식의 오버라이딩 된 메소드 작동됨
		c2.run();
		
		System.out.println("==K_Car========================");
		Car c3 = new K_Car();
		//부모의 run() 메소드를 호출시 자식의 오버라이딩 된 메소드 작동됨
		c3.run();
		
		
		System.out.println("==static ========================");
		Car.move();
		
		System.out.println();
		System.out.println("==ArrayList<Car> ======================================================");
		
//		자식객체를 생성하면서 부모타입으로 지정하면, 배열이나 클래스에 동일한 타입으로 저장할 수 있다. 끄집어내서 다운캐스팅해서 연산도 할 수 있다
		
//		ArrayList<Car>
		//선언
		List<Car> aList = new ArrayList<>();
		
		aList.add(c1);
		aList.add(c2);
		aList.add(c3);
		
		//for문 출력
		for (int i = 0; i < aList.size(); i++) {
//★★★★★복습			
			aList.get(i).run();
			// get(i)해서 방을 끄집어내고 c1객체(c2,c3)를 ' .run(); ' 한 것이다
        //오버라이딩하여 작성한 run()메소드 자체가 'println'있으니, 이런식으로 코딩하여 출력 가능하다.
			

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
