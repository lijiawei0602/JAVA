package work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner input = new Scanner(System.in);
		do{
			try{
				int x = input.nextInt();
				int y = input.nextInt();	
				a=1;
				System.out.println(x+y);
			}
			catch(InputMismatchException ex){
				System.out.println("please input two integers:");
				input.nextLine();
			}
		}while(a ==0 );
	}

}
