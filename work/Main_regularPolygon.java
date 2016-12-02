package work;

public class Main_regularPolygon {

	public static void main(String[] args) {
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println(regularPolygon1.getPerimeter());
		System.out.println(regularPolygon1.getArea());
		System.out.println(regularPolygon2.getPerimeter());
		System.out.println(regularPolygon2.getArea());
		System.out.println(regularPolygon3.getPerimeter());
		System.out.println(regularPolygon3.getArea());
	}

}

class RegularPolygon{
	private int n = 3;
	private double side = 1;
	private	double x = 0;
	private	double y =0;
	
	RegularPolygon() {
		
	}
	RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	RegularPolygon(int n, double side, double d, double e){
		this.n = n;
		this.side = side;
		this.x = d;
		this.y = e;
	}
	
	public int getData_n(){
		return this.n;
	}
	public int setData_n(int n){
		return this.n = n;
	}
	
	public double getData_side(){
		return this.side;
	}
	public double setData_side(double side){
		return this.side = side;
	}
	
	public double getData_x(){
		return this.x;
	}
	public double setData_x(double x){
		return this.x = x;
	}
	
	public double getData_y(){
		return this.y;
	}
	public double getData_y(double y){
		return this.y = y;
	}
	
	double getPerimeter(){
		return n * side;
	}
	double getArea(){
		return n * side *side /(4 * Math.tan(getPerimeter()/n));
	}
}
