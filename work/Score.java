package work;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;
		for(int i =0; i<args.length;i++){
			if(i%2 != 0){
				total += Double.parseDouble(args[i]);
			}
		}
		double average = total / (args.length/2);
		System.out.println("总分：" + total);
		System.out.println("平均分:" + average);
	}

}
