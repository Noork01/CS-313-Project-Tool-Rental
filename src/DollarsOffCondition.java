
public class DollarsOffCondition implements Strategy{

	@Override
	public double couponType(double num1, double num2, double num3, int percent) {//removes the amount you input if it reaches minimum price
																				   //use (num1,num2,null,null) only first 2 important
																				   //num1 is total and num 2 is minimum price
		
		return num1 > num2 ? -num1:0;
	}
}