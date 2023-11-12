public class Main {
    public static void main(String[] args) {
        FoodFactory italianFoodFactory = new ItalianFoodFactory();
        FoodFactory chineseFoodFactory = new ChineseFoodFactory();
        FoodFactory mexicanFoodFactory = new MexicanFoodFactory();

        Order order1 = new Order(italianFoodFactory);
        order1.addFoodItem("Lasagna");
        order1.addFoodItem("Pizza");
        order1.prepareFood();

        Order order2 = new Order(chineseFoodFactory);
        order2.addFoodItem("Peking Duck");
        order2.addFoodItem("Turtle soup");
        order2.prepareFood();

        Order order3 = new Order(mexicanFoodFactory);
        order3.addFoodItem("Burrito");
        order3.addFoodItem("Guacamole");
        order3.prepareFood();
    }
}