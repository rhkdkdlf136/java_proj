package lab.chap17.account;

public class Account {
	
	String name;	//이름
	int account;	//계좌번호
	int money = 10000;	//입금된 자기 돈
	
	
//	Account(){}
//	
//	void accountName (String name){
//		this.name = name;
//	}
//	
//	
//	void accountNum (int account) {
//		this.account = account;
//	}
	
	
	void deposit(int money) { 
	//입금액과 입금 후에는 남은 잔액 출력 : 00원 입급되었습니다. 계좌의 총급액은 00원 입니다.
		this.money = this.money + money;
		System.out.println(money + "원 입급되었습니다");
		System.out.println(name + "님 계좌의 총액은 " + this.money + "원 입니다.");
		
		
//		hap = money + m;
//		System.out.println(m + " 원이 입급되었습니다.");
//		System.out.println("계좌의 총금액은 " + hap + " 원 입니다.");
//		System.out.println();
	}
	
	
	void withdraw(int money) { 
	// 출금 : 00원 출금했습니다. 잔고는 00원 있습니다.
		this.money = this.money - money;
		System.out.println(money + "원 출금되었습니다.");
		System.out.println(name + "님 계좌의 잔고는 " + this.money + "원 입니다.");
		
		
//		int total;
//		total = hap - m;
//		System.out.println(m + " 원이 출금되었습니다.");
//		System.out.println("계좌의 잔고는 " + total + " 원 입니다.");
//		System.out.println();
		
	}



	
	// setter : name, account
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAccount(int account) {
		this.account = account;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
