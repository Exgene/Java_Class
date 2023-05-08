import java.util.Scanner;

public class Bank_Account {
	int acno;
	String name;
	String type;
	int bal;

	Bank_Account() {
		System.out.println("Default Constructor is called");
	}

	Bank_Account(int a, String b, String c, int d) {
		acno = a;
		name = b;
		type = c;
		bal = d;
	}

	void deposit(int a) {
		System.out.println("Balance before deposit=" + bal);
		bal = bal + a;
		System.out.println("Balance after deposit=" + bal);
	}

	void withdraw(int a) {
		System.out.println("Balance before withdrawl= " + bal);
		if (bal - a < 0) {
			System.out.println("Insufficient Balance");
			return;
		}
		bal = bal - a;
		System.out.println("Successful! Remaining Balance=" + bal);
	}

	void display() {
		System.out.println("The name of the account holder:"+name);
		System.out.println("The total balance is = " + bal);
	}

	public static void main(String[] args) {
		System.out.println("Enter the acno,name,acctype,bal");
		Bank_Account b1 = new Bank_Account();
		Scanner input = new Scanner(System.in);
		Bank_Account main = new Bank_Account(input.nextInt(),input.next(),input.next(),input.nextInt());
		System.out.println("Enter the Amount to be deposited:");
		int dep = input.nextInt();
		main.deposit(dep);
		System.out.println("Enter the Amount to be witdrawn");
		dep = input.nextInt();
		main.withdraw(dep);
		main.display();
	}

}
