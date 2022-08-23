//A concrete class that implements the Category Interface to find out the category of a product
public class Furniture implements Category{
    @Override
    public String menuCategory(){
        return "Furniture";
    }
}
