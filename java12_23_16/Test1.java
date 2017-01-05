package java12_23_16;

public class Test1 implements Runnable{
	public void run(){
		System.out.println("test");
	}
	public Test1(){
		Thread t = new Thread(this);
		t.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1();
	}

}
