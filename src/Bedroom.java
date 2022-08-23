// An abstract class that implements the Product interface providing default functions like,
// choosing the right category and the price.
public abstract class Bedroom implements ProductsBought {
    @Override
    public Category category() {
        return new Furniture();
    }
    public abstract float thePrice();
}
