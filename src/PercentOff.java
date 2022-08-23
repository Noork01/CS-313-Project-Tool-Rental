
public class PercentOff implements Strategy{

	@Override
	public double couponType(double num1, double num2, double num3, int percent) {//removes a percentage of the price you input
																				   //use (num1,null,null,int percent) only first and last important
		double priceOff = (((double)percent)/100  * num1);
		return -priceOff;
	}
}