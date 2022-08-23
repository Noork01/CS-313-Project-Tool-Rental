public class UserActivityFactory {
    //1. Factory Pattern -> Because we are creating objects like Buy, Sell, Rent without exposing the creation logic.
    // We are also implementing an interface through those objects.
    //uses getUserActivity to get object of type activity type
    public UserActivity getUserActivity(String userActivityType){
        if(userActivityType == null){
            return null;
        }
        if(userActivityType.equalsIgnoreCase("BUY")){
            return new Buy();
        }
        else if(userActivityType.equalsIgnoreCase("RENT")){
            return new Rent();
        }
        else if(userActivityType.equalsIgnoreCase("Sell")){
            return new Sell();
        }
        return null;
    }
}
