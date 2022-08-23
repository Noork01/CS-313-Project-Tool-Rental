//A concrete class extending from an abstract class
public class CutlerySet extends Utensil{
    @Override
    public float thePrice() {
        return 50.99f;
    }
    @Override
    public String productName(){
        return "Amazing, Shiny Cutlery Set";
    }
}
