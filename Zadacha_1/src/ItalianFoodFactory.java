public class ItalianFoodFactory extends FoodFactory {
    public Food createFood(String name) {
        return new ItalianFood(name);
    }
}
