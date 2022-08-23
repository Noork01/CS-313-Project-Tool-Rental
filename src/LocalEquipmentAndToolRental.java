public class LocalEquipmentAndToolRental {

    //1. Main method contains an overview of what customers have bought/rented
    // and sellers have sold, Shopping Carts, Promotion, Discounted Prices, Products being in stock or not.
    //2. Customer and Seller, should they be separate classes or interfaces? Or methods
  public static void main (String[] args){
      //Factory Pattern Code
      UserActivityFactory userActivityFactory = new UserActivityFactory();
      UserActivity activity1 = userActivityFactory.getUserActivity("BUY");
      activity1.activity();
      UserActivity activity2 = userActivityFactory.getUserActivity("SELL");
      activity2.activity();
      UserActivity activity3 = userActivityFactory.getUserActivity("RENT");
      activity3.activity();
      /*
      Customer customerInfo = new Customer("lawn-mower", "outdoors");
      Customer customerNames;
      customerNames = new Customer(new ArrayList<>());
      customerNames.getCustomerList().add("Jack");
      customerNames.getCustomerList().add("Bo");
      customerNames.getCustomerList().add("Jane");
      Seller sellerInfo = new Seller("Wardrobe", "Furniture");
      Seller sellerNames;
      sellerNames = new Seller(new ArrayList<>());
      sellerNames.getSellerList().add("JJ");
      sellerNames.getSellerList().add("Diana");
      sellerNames.getSellerList().add("Jaya");
      System.out.println(customerNames); //issue: not printing the names. Printing a hex code instead.
      System.out.println(sellerNames); //issue: not printing the names. Printing a hex code instead.
      //String[] cName = {"Jack", "Bob", "Bo", "Diana", "Priyanka"};
      //customerNames.add(cName); //I want to get an array of names.
      System.out.println(customerInfo.getItems("lawn-mower"));
      System.out.println(customerInfo.getCategory("outdoors"));
      System.out.println(sellerInfo.getItems("Wardrobe"));
      System.out.println(sellerInfo.getCategory("Furniture"));
      */
      //Builder Pattern Code
      ShoppingCart shoppingCart = new ShoppingCart();
      ShoppingCartBuilder shoppingCartOne = shoppingCart.showShoppingCartOne();
      System.out.println("Shopping Cart 1 has the following: ");
      shoppingCartOne.showProducts();
      System.out.println("The Subtotal is: " +shoppingCartOne.getPrice());
      ShoppingCartBuilder shoppingCartTwo = shoppingCart.showShoppingCartTwo();
      System.out.println("Shopping Cart 2 has the following: ");
      shoppingCartTwo.showProducts();
      System.out.println("The Subtotal is: " +shoppingCartTwo.getPrice());
      ShoppingCartBuilder shoppingCartThree = shoppingCart.showShoppingCartThree();
      System.out.println("Shopping Cart 3 has the following: ");
      shoppingCartThree.showProducts();
      System.out.println("The Subtotal is: " +shoppingCartThree.getPrice());
  }
}