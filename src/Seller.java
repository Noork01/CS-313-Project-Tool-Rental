import java.util.ArrayList;
import java.util.List;

public class Seller {
    //Sellers here only sell
    String sellerNames[] = {"Bob", "Bo","Jack"};
    String items;
    String category;

    public Seller(String[] sellerName, String i, String c) {
        //wanted to give this constructor items and category so that I have everything in one constructor.
        // It is causing problems with the Sell class and the main method.
        sellerNames=sellerName;
        items=i;
        category=c;
    }

    public Seller(){

    }
    //return an array list to prevent private state from being modified as Array lists are mutable.
    //public ArrayList <String> getSellerList() {
      //  return new String sellerNames;
    //}

    public String getItems(String items) {
        return items;
    }

    public String getCategory(String category) {
        return category;
    }
}
