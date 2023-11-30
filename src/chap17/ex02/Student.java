package chap17.ex02;

public class Student { //클래스이면서 타입이 Student

//  ※클래스 : 객체를 만들기위한 틀(설계도). 
//		-객체(인스턴스) : 클래스를 기반으로 메모리에 로드된 것
//	1.필드 : 속성
	String name;
	String addr;
	int num;
	
	int kor, eng, math;
//	int kro; int eng; int math;
	
	
//	2.생성자 : 클래스기반으로 객체 생성시 생성자 호출 ( 인풋값 = 입력값 = 매개변수 )
//		1)기본 생성자 : 다른 생성자가 없을 때는 생략되어 외부에서 호출이 가능
	Student () {}
//		2)인풋값(매개변수)이 1개인 생성자
	Student(String name) {
		this.name = name;
	}
	Student (int num) { this.num = num; }
//		3)인풋값이 2개인 생성자
	Student(String name, String addr){
			this.name = name; this.addr = addr;
		}
//		4)인풋값이 3개인 생성자
	Student(String name, String addr, int num){
		this.name = name; this.addr = addr; this.num = num;
	}
	
	
	Student(String name, int kor, int eng, int math){ 
	//kor, eng, math 점수를 합계와 평균을 구해서 출력하는 메소드 출력을 위한
		this.name=name; this.kor=kor; this.eng=eng; this.math=math;
	}
	
	//생성자 오버로딩
//	§ 메소드 오버로딩(Overloading) : 메소드 이름이 동일하고 시그니쳐(식별자)에 따라 해당 메소드 호출. 
//		식별자(시그니쳐) : 인풋(입력) 개수. 인풋 자료형.
//	§ 메소드 오버라이딩(Overriding) : 상속 관계에서 부모클래스의 메소드를 새롭게 재정의해서 사용하는 것.
//		-상속 : 중복된 코드를 방지할 수 있다
//		-다형성 : 하나의 메소드를 여러 형태로 출력
	
	
//	3.메소드 : kor, eng, math 점수를 합계와 평균을 구해서 출력하는 메소드
	public void hapAvg() {
		int hap = 0;
		hap = kor + eng + math;
		double avg = hap / 3.0; // hap은 int형이기 때문에 double형 타입 맟춰주기 위해서 '3.0'실수로 씀
		
		System.out.println( name + " 님의 점수의 합계는 " + hap + " 이고, 평균은 : " + avg); 
						//필드의 name 이며 필드 혹은 변수 입력시 입력된 필드 혹은 변수의 색깔 확인하기. 
	}
	
	
	//getter,setter  ( 마우스 오른쪽 클릭 source->Generate getters and setters 클릭하여 자동생성 ) 
	public String getName() { // getName()호출해서 리턴값 name을 String형으로 돌려준다.
		return name;
	}
	public void setName(String name) { // set은 인풋값 넣어서 받은 값을 필드에 저장(void).
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
		
	
	//toString메소드 : Object클래스에 있는 메소드. 객체 자체를 출력시 힙의 주소가 출력되지않고 '필드의 값' 출력.
		// ( 마우스 오른쪽 클릭 source-> Generate toString... 클릭하여 자동생성)
	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", num=" + num + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	
		
	
	
	
	
	
//	3.메소드 : 기능. 입력을 넣어주면 출력(내용실행) 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
