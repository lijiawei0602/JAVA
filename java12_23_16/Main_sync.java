package java12_23_16;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main_sync implements Runnable{
	public void run(){
		Sum.add();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(1000);
		for(int i=0;i<1000;i++){
			executorService.execute(new Main_sync());
		}
		executorService.shutdown();
	}

}
class Sum{
	private static int sum = 0;
	public synchronized static void add(){
		sum += 1;
		System.out.print("sum="+sum);
	}
}