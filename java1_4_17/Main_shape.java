package java1_4_17;

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class shape {// 抽象类

    /* 抽象方法 求面积 */
    public abstract double getArea();

    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}


public class Main_shape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        int n=input.nextInt();
        double side = input.nextDouble();

        shape rp = new  RegularPolygon(n,side);

        System.out.println(d.format(rp.getArea()));
        System.out.println(d.format(rp.getPerimeter()));
        input.close();
    }
}

 class RegularPolygon extends shape{
	private int n;
	private double side;
	public RegularPolygon(int n , double side){
		this.n = n;
		this.side = side;
	}
	public  double getArea(){
		return (n * side * side / (Math.tan(Math.toRadians(180/n))*4));
	}
	public  double getPerimeter(){
		return n*side;
	}

}
