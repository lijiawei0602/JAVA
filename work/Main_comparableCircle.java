package work;

import java.util.Scanner;

public class Main_comparableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ComparableCircle comparableCircle = new ComparableCircle(5);
		ComparableCircle comparableCircle2 = new ComparableCircle(6);
		System.out.println(comparableCircle.compareTo(comparableCircle2));
	}

}
class Circle2{
	double r;
	public Circle2(double r){
		this.r = r;
	}
	public double getArea(){
		return Math.PI * r* r;
	}
}
class ComparableCircle extends Circle2 implements Comparable{
	public ComparableCircle(double r){
		super(r);
	}
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		if(getArea() > ((ComparableCircle)a).getArea())
			return 1;
		else if(getArea() < ((ComparableCircle)a).getArea())
			return -1;
		else
			return 0;
	}
	
}
