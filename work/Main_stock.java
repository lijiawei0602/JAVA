package work;

import java.text.DecimalFormat;

public class Main_stock {

	public static void main(String[] args) {
		Stock stock1 = new Stock();
		stock1.symbol = "java";
		stock1.name = "Sun Microsystem Inc";
		stock1.previousClosingPrice = 4.5;
		stock1.currentPrice = 4.35;
		System.out.print(stock1.getChangePercent());
	}

}

class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	DecimalFormat df = new DecimalFormat("#.00");
	
	String getChangePercent(){
		return (df.format((currentPrice-previousClosingPrice) / previousClosingPrice *100) + "%");
	}
}
