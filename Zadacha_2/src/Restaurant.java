public class Restaurant {
    public static void main(String[] args) {

        CuisineFactory italianCuisineFactory = new ItalianCuisineFactory();
        Dish pizza = italianCuisineFactory.createDish();
        pizza.prepare();
        pizza.serve();

        CuisineFactory chineseCuisineFactory = new ChineseCuisineFactory();
        Dish pekingDuck = chineseCuisineFactory.createDish();
        pekingDuck.prepare();
        pekingDuck.serve();

        CuisineFactory mexicanCuisineFactory = new MexicanCuisineFactory();
        Dish burrito = mexicanCuisineFactory.createDish();
        burrito.prepare();
        burrito.serve();
    }
}