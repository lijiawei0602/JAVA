package work;
import java.util.Date;

public class Main_account {

	public static void main(String[] args) {
		Account account = new Account(1122,20000);
		account.annualInterestRate = 0.045;
		account.withDraw(2500);
		account.deposit(3000);
		
		System.out.println(account.balance);
		System.out.println(account.annualInterestRate);
		System.out.println(account.dateCreated);
	}

}

class Account{
	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated;
	
	double withDraw(double x){
		balance -= x;
		return balance;
	}
	double deposit(double x){
		balance += x;
		return balance;
	}
	String getMonthlyInterestRate(){
		return balance * annualInterestRate + "%";
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int id,double balance) {
		// TODO Auto-generated constructor stub
		Date date = new Date();
		this.dateCreated = Date.from(date.toInstant());
		this.id = id;
		this.balance = balance;
	}
}
