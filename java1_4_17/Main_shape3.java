package java1_4_17;


import java.util.Scanner;
import java.text.DecimalFormat;

interface IShape {
    double getArea();

    double getPerimeter();
}

class RHexagon implements IShape{
	private double a;
	
	
	public RHexagon(double a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (a * a* Math.sqrt(3)/2 /2 * 6);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (6 * a);
	}
	
}

public class Main_shape3 {

	public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        IShape r = new RHexagon (a);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}


