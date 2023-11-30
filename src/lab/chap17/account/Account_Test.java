package lab.chap17.account;

import java.util.Scanner;

public class Account_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		List<Account> aList = new ArrayList<>();
		Account a = new Account();
		
		int select;
		String name;
		int account;
		int money;
		
		
		
	out:	do {
			System.out.println("==========================================");
			System.out.println("0. 계좌이름과 계좌번호 등록");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			System.out.println("==========================================");
			System.out.println("위 내용의 정수를 입력하세요.>>>>>>>>>>>>>>>>>>>>");
			select = sc.nextInt();
			
			
			switch (select) {
			case 0: //계좌이름과 계좌번호 등록
				//기존의 계좌가 존재하면 메세지를 출력 후 break;
				if (a.name != null || a.account != 0) {
					System.out.println("당신은 계좌를 만들었습니다.!!!");
					System.out.println("입금 또는 출금을 하세요");
					break;
				}
				
				System.out.println("0. 계좌이름과 계좌번호 등록항목입니다.");
				System.out.println("계좌의 이름을 입력하세요.>>>");
				name = sc.next();
				System.out.println("계좌의 번호를 정수로 입력하세요.");
				account = sc.nextInt();
				
				a.setName(name);
				a.setAccount(account);
				
				System.out.println("계좌가 잘 등록되었습니다.");
				break;
				
				
//				System.out.println("계좌이름을 입력하세요");
//				name = sc.next();
//				a.accountName(name);
//				System.out.println("계좌이름은 " + a.getName() + " 입니다.\n");
//				
//				
//				System.out.println("계좌번호를 입력하세요");
//				account = sc.nextInt();
//				a.accountNum(account);
//				System.out.println("계좌번호는 " + a.getAccount() + " 입니다.\n");
				
				
			case 1: //입금 deposit
				if (a.name == null || a.account == 0) {
					System.out.println("계좌를 먼저 등록해주세요.");
					break;
				}
				//입금
				System.out.println("1. 입금을 선택했습니다. 입금할 금액을 입력해주세요.>>");
				money = sc.nextInt();
				a.deposit(money);
				break;
				
				
//				System.out.println("입금할 금액을 입력해주세요");
//				int de = sc.nextInt();
//				a.deposit(de);
				
				
			case 2: //출금 withdraw
				if (a.name == null || a.account == 0) {
					System.out.println("계좌를 먼저 등록해주세요.");
					break;
				}
				//출금
				System.out.println("2. 출금을 선택했습니다. 출금액을 입력하세요.>>>>");
				money = sc.nextInt();
				a.withdraw(money);
				break;
				
				
//				System.out.println("출금할 금액을 입력해주세요");
//				int wi = sc.nextInt();
//				a.withdraw(wi);
				
				
			case 3: //종료
				break out; //'out;'라벨을 넣어서 특정이름(out:)으로 점프하도록..
			}
			
		} while(true);
		
	
		System.out.println("프로그램 종료"); 
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
