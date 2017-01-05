package java12_23_16;

public class TaskThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b' ,100);
		Runnable print100 = new PrintNum(100);
		
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

class PrintChar implements Runnable{
	private char charToPrint;
	private int times;
	
	public PrintChar(char c , int t){
		charToPrint = c;
		times = t;
	}
	
	public void run(){
		for(int i =0; i<times;i++){
			System.out.print(charToPrint);
		}
	}
}
class PrintNum implements Runnable{
	private int lastNum;
	
	public PrintNum(int n){
		lastNum = n;
	}
	public void run(){
		for(int i=0;i<=lastNum;i++){
			System.out.print(" "+ i);
		}
	}
}