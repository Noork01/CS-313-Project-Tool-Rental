
public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public double executeStrategy(double num1, double num2, double num3, int percent){
      return strategy.couponType(num1, num2, num3, percent);
   }
}