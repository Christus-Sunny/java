package javalab;
import java.util.Scanner;
class  Mover{
	void area(double base,double height ) {
		double triangleresult=(base*height)/2;
		
		System.out.println("area of triangle is"+triangleresult);
	}
	void area(int lenght,int breadth) {
		int rectangleresult=(length*breadth)/2;
		System.out.println("area of rectangle is"+rectangleresult);
	}
	void area(double radius) {
		double circleresult=(3.14*radius*radius);
		System.out.println("area of circle is"+circleresult);
	}
}
public class Methodoverload {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	mover p=new mover();
	System.out.println("enter base and height of triangle");
	double base=sc.nextDouble();
	double height=sc.nextDouble();
	p.area(base,height);
	System.out.println("enter length and breadth of rectangle");
	int lenght=sc.nextInt();
	int breadth=sc.nextInt();
	p.area(lenght,breadth);
	System.out.println("enter radius of circle");
	double radius=sc.nextDouble();
	p.area(radius);	
}
}
