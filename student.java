import java.util.Scanner;

class student1{
	String name;
	int rollno;
	student1(String name,int rno){
		this.name = name;
		rollno = rno;
	}
	void show() {
		System.out.println("Name:" + name + "\nRollNo: "+ rollno);
	}
}

class test extends student1{
	int sub1,sub2,sub3;
	test(int sub1,int sub2, int sub3,String name,int rno){
		super(name,rno);
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	void show_marks() {
		super.show();
		System.out.println("Subject 1:" + sub1 + "\nSubject 2:" + sub1 + "\nSubject 3:" + sub3);
		}
}

interface sports{
	final int sport_mark = 40;
	void show_sportswt();
}

class result extends test implements sports{
	int total = sub1+sub2+sub3+sport_mark;
	public void show_sportswt() {
		System.out.println("Sports marks: " + sport_mark);
	}
	result(String name,int rollno,int sub1,int sub2,int sub3){
		super(sub1,sub2,sub3,name,rollno);
	}
	void display() {
		super.show_marks();
		System.out.println("Total Marks: " + total);
		}
}

public class student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name, roll number and marks in 3 sucjects");
		String name = s.nextLine();
		int rno = s.nextInt();
		int sub1 = s.nextInt();
		int sub2 = s.nextInt();
		int sub3 = s.nextInt();
		result res = new result(name,rno,sub1,sub2,sub3);
		res.display();
		res.show_sportswt();
	}

}
