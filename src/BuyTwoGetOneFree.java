public class BuyTwoGetOneFree implements Strategy{

	@Override
	public double couponType(double num1, double num2, double num3, int percent) {//removes the cost of the lowest value item
		   																		   //use (num1,num2,null,num3) only first 3 important
		double min = num3 < (num1<num2 ? num1:num2) ? num3:((num1<num2) ? num1:num2); 
		return -min;
	}
}