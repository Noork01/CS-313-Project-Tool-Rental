
public class PercentOffCondition implements Strategy{

	@Override
	public double couponType(double num1, double num2, double num3, int percent) {//removes a percentage of the price you input if minimum price met
																				   //use (num1,num2,null,int percent) only first,second and last important
		   																		   //num1 is total and num 2 is minimum price
		double priceOff = (((double)percent)/100  * num1);
		return num1 > num2 ? -priceOff:0;
	}
}