public class Inventory {
    //1. Pattern: Observer Pattern. Because Inventory will act as the main observer. Menu class will be the subject.
    // Factory extends from Inventory. So, the Inventory, as the observer, is updating the info of an item whether it's
    // in stock or not. Then the Menu class will be notified of that info and display only in stock item accordingly.
    // Also, the factory cannot ship something that's not even in stock.Then Menu will detach factory.
    // Factory only gets an info when an order is placed successfully. Then Menu will attach factory.
    //2.Checks whether a product is in stock or not using. So, it must have an interaction
    // with the interface/class containing buy and rent methods. If a product is out of stock,
    // customers won't be able to buy or rent.
    //Also, sends the data to the Menu class to display "out of stock" under the product(s).
}
