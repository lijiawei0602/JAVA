package java1_4_17;
import java.util.Scanner;
import java.text.DecimalFormat;

abstract class shape1 {// 抽象类

    /* 抽象方法 求面积 */
    public abstract double getArea();

    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}

class RPentagon extends shape1{
	double side;
	public RPentagon(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (1.0/4)*Math.pow(side, 2)*Math.sqrt(25+10*Math.sqrt(5));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (5*side);
	}
	
}
public class Main_shape2 {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
	        double side = input.nextDouble();
	       
	        shape1 rp = new RPentagon(side);

	        System.out.println(d.format(rp.getArea()));
	        System.out.println(d.format(rp.getPerimeter()));
	        input.close();
	    } 
}
