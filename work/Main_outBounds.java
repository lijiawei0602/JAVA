package work;

import java.util.Scanner;

public class Main_outBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub0
		Scanner input = new Scanner(System.in);
		int i;
		int[] array = new int[100];
		for(i = 0; i<array.length; i++){
			array[i] = (int) ((Math.random()) * 100);
		}
		int a = input.nextInt();
		try{
			
				System.out.println(array[a]);
			
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of Bounds");
		}
	}

}
