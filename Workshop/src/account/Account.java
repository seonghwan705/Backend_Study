package account;

public class Account {

	String account;
	int balance;
	double interestRate;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		double benefit = balance * (interestRate / 100);
		return benefit;
	}

	public void deposit(int money) {
		this.balance = balance + money;

	}

	public void withdraw(int money) {
		if (balance > money) {
			this.balance = balance - money;
		} else {
			System.out.println("출금할 수 없습니다.");
		}

	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
