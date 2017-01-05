package work;

import java.util.Scanner;



public class Main_illegalArguments {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Main_illegalArguments(){
		this(2.5,1,1000);
	}
	public Main_illegalArguments(double annualInterestRate , int numberOfYears ,double loanAmount){
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double m,n;
		int x;
	
		try{
			m = input.nextDouble();
			n = input.nextDouble();
			x = input.nextInt();
			Main_illegalArguments a = new Main_illegalArguments(m ,x ,n);
			if(a.annualInterestRate <=0 && a.loanAmount <= 0 && a.numberOfYears <=0){
				System.out.println("IllegalArgumentException");
			}
			else{
				System.out.println(a.annualInterestRate);
				System.out.println(a.numberOfYears);
				System.out.println(a.loanAmount);
			}
		}
		catch(IllegalArgumentException ex){
			System.out.println("IllegalArgumentException");
		}
	}

}
