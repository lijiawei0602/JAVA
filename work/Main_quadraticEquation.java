package work;

import java.util.Scanner;

public class Main_quadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ÊäÈëa,b,c£º");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
		
		if(quadraticEquation.getDiscriminant() > 0)
			System.out.println(quadraticEquation.getRoot1() +"," + quadraticEquation.getRoot2());
		else if(quadraticEquation.getDiscriminant() == 0)
			System.out.println(quadraticEquation.getRoot1());
		else
			System.out.println("The equation has no roots");
	}

}

class QuadraticEquation{
	private double a,b,c;
	public double getData_a(){
		return this.a;
	}
	public double getdata_b(){
		return this.b;
	}
	public double getdata_c(){
		return this.c;
	}
	QuadraticEquation(double a,double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	double getDiscriminant(){
		return b*b-4*a*c;
	}
	double getRoot1(){
			return (-b - Math.sqrt(getDiscriminant())) / (2*a);
	}
	double getRoot2(){
			return (-b + Math.sqrt(getDiscriminant())) / (2*a);
	}
}