package work;

import java.math.BigInteger;

public class Biginteger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = Long.MAX_VALUE + "";
		BigInteger a = new BigInteger(s);
//		System.out.println(a);
		int n=0;
		for(int i=0;i<100;i++){
			if( a.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || a.remainder(new BigInteger("6")).equals(BigInteger.ZERO) ){
				System.out.println(a);
				n++;
			}
			a = a.add(BigInteger.ONE);
			if(n == 10)
				break;
		}
	}
}
