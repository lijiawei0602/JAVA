package work;

import java.math.BigDecimal;

import java.math.RoundingMode;

public class Bigdecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal e = new BigDecimal(0);
		for(int x=100;x<=1000;x++){
			e = BigDecimal.ZERO;
			if(x%100==0){
				for(int i=0;i<=x;i++){
					e= e.add(new BigDecimal(1).divide(fac(i), 4500 ,RoundingMode.HALF_UP));
				}
				System.out.println(e);
			}
		}
	}
	public static BigDecimal fac(int n){
		if(n == 0)
			return new BigDecimal(1);
		return fac(n-1).multiply(new BigDecimal(n));
	}

}
