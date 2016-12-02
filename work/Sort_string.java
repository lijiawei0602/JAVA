package work;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char[] array = s.toCharArray();
		Arrays.sort(array);
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]);
		}
	}

}
