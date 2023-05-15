
/*	To create an abstract class named shape that contains two integers and an empty method named printArea. 
 * Provide three classes named Rectangle, Triangle and Circle subclass that each one of the classes extends the Class Shape. 
 * Each one of the classes contains only the method printArea() that prints the area of Shape.*/

abstract class shape{
	int x,y;
	public abstract void printArea();
}

class Rectangle extends shape{
	public void printArea() {
		System.out.println("Area of Rectangle is " + x*y);
	}
}

class Triangle extends shape{
	public void printArea() {
		System.out.println("Area of Triangle is " + .5*x*y);
	}
}

class Circle extends shape{
	public void printArea() {
		System.out.println("Area of Triangle is " + 3.14*x*x);
	}
}

public class Abstract_Interface_Exceptions {
	public static void main(String[] args){
		Rectangle R = new Rectangle();
		R.x = 10;
		R.y = 10;
		R.printArea();
		
		Triangle T = new Triangle();
		T.x = 10;
		T.y = 10;
		T.printArea();
		
		Circle C = new Circle();
		C.x = 10;
		C.printArea();	}
}
