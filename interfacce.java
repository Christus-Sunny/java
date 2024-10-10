package javalab;
import java.util.Scanner;
interface human1{
	final int jobid=234;
	void learn();
	void work();
}
interface recruitment1{
	void screening();
}
class programmer1 implements human1,recruitment1{
	public void learn (String trainarea) {
System.out.println("Trained area"+trainarea);
}
public void screening(int score) {
	System.out.println("test score"+score);
}
public void work() { 
	System.out.println("Selected to role development");
	System.out.println("my job id="+jobid);
}
}
public class interfacce{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score;
		String trainarea;
		System.out.println("enter trained area");
		trainarea=sc.next();
		System.out.println("enter test score");
		score=sc.nextInt();
		System.out.println("PLACEMENT DETAILS");
		programmer1 p=new programmer1();
		p.learn(trainarea);
		p.screening(score);
		p.work();
	}
}

