public class MexicanFoodFactory extends FoodFactory {
    public Food createFood(String name) {
        return new MexicanFood(name);
    }
}
