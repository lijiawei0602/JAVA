package java1_4_17;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		BigInteger n = new BigInteger(input.nextInt()+"");
		BigInteger a = fac(n);
		System.out.println(a);
	}
	
	public static BigInteger fac(BigInteger n) {
		if(n.equals(BigInteger.ONE))
			return n;
		return n.multiply(fac(n.subtract(BigInteger.ONE)));
	}

}
