import java.util.ArrayList;
import java.util.List;


public class Customer {
    //Customers here rent and buy
    List<String> customerList = new ArrayList<String>();

    public Customer(List<String> customerName) {
        //wanted to give this constructor items and category so that I have everything in one constructor.
        // It is causing problems with the Buy class and the main method.
        //default constructor
        customerList=customerName;
    }
    String items;
    String category;

    public Customer( String i, String c){
        items=i;
        category=c;
    }
    //return an array list to prevent private state from being modified as Array lists are mutable.
    public ArrayList <String> getCustomerList() {
        return new ArrayList<String>(customerList);
    }

    public String getItems(String items) {
        return items;
    }

    public String getCategory(String category) {
        return category;
    }

}
