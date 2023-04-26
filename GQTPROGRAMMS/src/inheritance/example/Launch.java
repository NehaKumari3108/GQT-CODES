package inheritance.example;

import java.util.Scanner;
abstract class Shapes{
	double area;
	abstract void collectData();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}

class Square extends Shapes{
	private double side;
	//@override
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side:");
		side =sc.nextDouble();
		
	}
	//@override
	void calculate() {
		area = side * side;
	}
}
class  Circle extends Shapes{
	private double radius;
	//@override
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :");
		radius=sc.nextDouble();
	}
	//@override
	void calculate() {
		area=pi * radius * radius;
	}
}
class Rectangle extends Shapes{
	private double l,b;
	final double pi = 3.147;
	//@override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		l=sc.nextDouble();
		System.out.println("Enter the breadth");
		b=sc.nextDouble();
	}
	//@override
	void calculate() {
		area=l * b;
	}
}
class Geometry{
	void shapeOps(Shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}
	
public class Launch {

	public static void main(String[] args) {
		Circle c =new Circle();
		Square s=new Square();
		Rectangle r=new Rectangle();
		
		Geometry g=new Geometry();
		g.shapeOps(s);
		g.shapeOps(c);
		g.shapeOps(r);
	}
}



