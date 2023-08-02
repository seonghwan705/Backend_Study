package account;
public class TestAccount {

	public static void main(String[] args) {
		Account s1 = new Account("441-0290-1203", 500000, 7.3);
		System.out.println("계좌정보: "+ s1.getAccount()+" 현재잔액: "+s1.getBalance());
		s1.withdraw(600000);
		s1.deposit(20000);
		System.out.println("계좌정보: "+ s1.getAccount()+" 현재잔액: "+s1.getBalance());
		System.out.println("이자: "+s1.calculateInterest());
	}



}
