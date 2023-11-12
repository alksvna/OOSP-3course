public class ChineseFoodFactory extends FoodFactory {
    public Food createFood(String name) {
        return new ChineseFood(name);
    }
}
