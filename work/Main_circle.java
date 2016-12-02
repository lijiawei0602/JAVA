package work;

public class Main_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(5);
		Circle circle2 = new Circle(6);
		System.out.println(circle.equals(circle2));
	}

}
class GeometricObject1{
	double r;
	public GeometricObject1(double r){
		this.r = r;
	}
}
class Circle extends GeometricObject1 implements Comparable{
	double r;
	public Circle(double r){
		super(r);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean equals(Object o){
		if(r == ((Circle)o).r)
			return true;
		return false;
	}
}