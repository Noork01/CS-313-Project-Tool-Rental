public class ShoppingCart {
    //1. Can we merge this to the Menu Class? I am unable to find a suitable design pattern.
    //2.Shopping cart contains an array list/linked list of products that customers are buying or renting.
    //3. Once the input is received, a success message pops up.
    //4. Sends data to the Factory class for shipping.
    public ShoppingCartBuilder showShoppingCartOne(){
        ShoppingCartBuilder cart = new ShoppingCartBuilder();
        cart.addProduct(new LawnMower());
        cart.addProduct(new Wardrobe());
        return cart;
    }
    public ShoppingCartBuilder showShoppingCartTwo(){
        ShoppingCartBuilder cart = new ShoppingCartBuilder();
        cart.addProduct(new CutlerySet());
        cart.addProduct(new Wardrobe());
        return cart;
    }
    public ShoppingCartBuilder showShoppingCartThree(){
        ShoppingCartBuilder cart = new ShoppingCartBuilder();
        cart.addProduct(new CutlerySet());
        return cart;
    }

}
