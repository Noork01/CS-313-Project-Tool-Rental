//A concrete class extending from an abstract class
public class Wardrobe extends Bedroom{
    @Override
    public float thePrice() {
        return 475.75f;
    }
    @Override
    public String productName(){
        return "Elegant Wardrobe with 5 shelves";
    }
}
