package test;

import java.util.Scanner;

public class Main_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width = input.nextDouble();
		double height = input.nextDouble();
		
		Rectangle rectangle = new Rectangle(width,height);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
	}

}
class Rectangle{
	double width,height;
	public Rectangle(){
		this.width = 1;
		this.height = 1;
	}
	public Rectangle(double x, double y){
		this.width = x;
		this.height = y;
	}
	public double getArea(){
		return this.width * this.height;
	}
	public double getPerimeter(){
		return 2*(this.width + this.height);
	}
}