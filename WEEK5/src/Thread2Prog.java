import java.util.Random;
class T1 extends Thread
{
	int val;
	T1(int n)
	{
		val = n;
	}
	public void run() 
	{
		try 
		{
			for (int i = 1; i <= 3; i++) 
			{
				System.out.println((val + i) + ": " + Math.pow((val + i), 2));
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class T2 extends Thread
{
	int val;
	T2(int n)
	{
		val = n;
	}
	public void run() 
	{
		try 
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println((val+i)+": "+Math.pow((val+i),3));
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class Thread2Prog
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int x = rand.nextInt(11);
		System.out.println(x+"\n");
		T1 thread1 = new T1(x);
		thread1.start();
		T2 thread2 = new T2(x);
		thread2.start();
	}
}

