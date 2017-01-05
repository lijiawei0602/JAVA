package work;

import java.util.Scanner;

public class equation {

	public static void main(String[] args) {
		System.out.print("Enter a,b,c:");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
		double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
		
		if((Math.pow(b, 2)-4*a*c) > 0){
			System.out.print("The roots are "+ r1 +" and "+ r2);
		}
		if((Math.pow(b, 2)-4*a*c) ==0){
			System.out.print("The root is "+ r1);
		}
		if(Math.pow(b, 2)-4*a*c < 0){
			System.out.print("The equation has no real roots");
		}
		input.close();
	}

}
