package java12_23_16;

public class Test implements Runnable{
	public void run(){
		System.out.println("test");
	}
	public Test(){
//		Test task = new Test();
		new Thread(this).start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}

}
