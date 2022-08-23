
public class BuyOneGetOne implements Strategy{

	@Override
	public double couponType(double num1, double num2, double num3, int percent) {//removes the cost of the lower value item
		   																		   //use (num1,num2,null,null) only first 2 important
		double min = num1<num2 ? num1:num2;
		return -min;
	}
}