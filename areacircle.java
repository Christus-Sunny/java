package javalab;
class mover{
	void area(double r) {
		System.out.println("area of circle is"+3.14*(r*r));
	}
	void area(int a,int b) {
		System.out.println("area of rectangle is"+a*b);
}
	void area(double b,double h) {
		System.out.println("area of triangle is"+0.5*(b*h));
	}
}
public class areacircle {
     public static void main(String[] args){
    	 mover ob=new mover();
    	 ob.area(3.5);
    	 ob.area(4,5);
    	 ob.area(3.5,4.8);
     }
    	 
     }
     

