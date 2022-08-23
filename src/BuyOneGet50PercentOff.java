
public class BuyOneGet50PercentOff implements Strategy{

	@Override
	public double couponType(double num1, double num2, double num3, int percent) {// removes 50% of the price of item
																				   // can't actually check if you have 2 items
																				   // use (num1,null,null,null) only first important
		
		return -num1/2;
	}
}