package work;

import java.math.BigInteger;

public class Biginteger2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger(Long.MAX_VALUE + "");
		a = a.add(BigInteger.ONE);
		for(int i=0;i<5;i++){
			System.out.println(a.nextProbablePrime());
			a = a.nextProbablePrime();
		}
	}

}
