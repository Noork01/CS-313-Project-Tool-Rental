
public class DollarsOff implements Strategy{

	@Override
	public double couponType(double num1, double num2, double num3, int percent) {//removes the amount you input
																				   //use (num1,null,null,null) only first num important
		
		return -num1;
	}
}