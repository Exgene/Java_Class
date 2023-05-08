import java.util.Scanner;

class BankAcc {
	int acno;
	String name;
	String type;
	int bal;
	BankAcc()
	{
		System.out.println("default constructor is called");
	}
	BankAcc(int a,String b,String c,int d)
	{
		acno=a;
		name=b;
		type=c;
		bal=d;
	}
	void Deposit(int a)
	{
		System.out.println("Balance before deposit is"+bal);
		bal=bal+a;
		System.out.println("Balance after deposit is"+bal);
	}
	void Withdraw(int a)
	{
		System.out.println("Balance before withdrawal is"+bal);
		bal=bal-a;
		if(bal<0)
		{
			System.out.println("cannot withdraw");
			bal=bal+a;
		}
		else
			System.out.println("Balance after withdrawal is"+bal);
	}
	void Display()
	{
		System.out.println("Name is "+name);
		System.out.println("Balance is "+bal);
	}
}

public class Bank_ALt
{
	public static void main(String args[])
	{
		BankAcc b=new BankAcc();			  	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter acno,name,type,bal");
		BankAcc ba=new BankAcc(s.nextInt(),s.next(),s.next(),s.nextInt());
		System.out.println("enter the amount to deposit");
		ba.Deposit(s.nextInt());
		System.out.println("enter the amount to withdraw");
		ba.Withdraw(s.nextInt());
		ba.Display();
	}
}