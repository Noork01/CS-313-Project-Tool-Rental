//A concrete class that implements the Category Interface to find out the category of a product
public class Kitchen implements Category{
    @Override
    public String menuCategory() {
        return "Kitchen";
    }
}
