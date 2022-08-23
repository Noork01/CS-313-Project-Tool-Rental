import java.util.ArrayList;
import java.util.List;
public class ShoppingCartBuilder {
    //1. Builder design pattern -> Because we have various items belonging to various categories. So, we need a design pattern
    // that builds a complex object [shopping cart builder] using Product objects [product name, category, price] with a step-by-step approach.
    // [Completed]

     private List<ProductsBought> productsBought = new ArrayList<ProductsBought>();
     public void addProduct(ProductsBought p){
         productsBought.add(p);
     }
     public float getPrice(){
         float price = 0.0f;
         for(ProductsBought p : productsBought){
             price +=p.thePrice();
         }
         return price;
     }
     public void showProducts(){
         for(ProductsBought p : productsBought){
             System.out.println("Product bought: " +p.productName());
             System.out.println("Category is: " +p.category().menuCategory());
             System.out.println("Price: " +p.thePrice());
         }
     }
}
