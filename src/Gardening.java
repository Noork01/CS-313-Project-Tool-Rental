// An abstract class that implements the Product interface providing default functions like,
// choosing the right category and the price.
public abstract class Gardening implements ProductsBought {
    @Override
    public Category category() {
        return new Outdoors();
    }
    public abstract float thePrice();
}
