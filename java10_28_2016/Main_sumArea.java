package java10_28_2016;

public class Main_sumArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometricobject[] geometricobjects = new Geometricobject[4];
		geometricobjects[0] = new Circle(2);
		geometricobjects[1] = new Circle(3);
		geometricobjects[2] = new Rectangel(2, 3);
		geometricobjects[3] = new Rectangel(4, 5);
		double sum =0;
		for(int i=0;i<geometricobjects.length;i++){
			sum += geometricobjects[i].getArea();
		}
		System.out.println(sum);
	}

}
class Geometricobject{
	public double getArea(){
		return 0;
	}
}
class Circle extends Geometricobject{
	double r;
	public Circle(double r){
		this.r = r;
	}
	public double getArea(){
		return Math.PI *r *r;
	}
}
class Rectangel extends Geometricobject{
	double x,y;
	public Rectangel(double x , double y){
		this.x = x;
		this.y = y;
	}
	public double getArea(){
		return x*y;
	}
}