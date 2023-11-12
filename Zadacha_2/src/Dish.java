public class Dish {
    String name;
    String cuisine;

    void prepare() {
        System.out.println("Вы выбрали " + cuisine + " кухню.");
    }

    void serve() {
        System.out.println("Ваше блюдо " + name + " готово. Приятного аппетита.");
    }

    public String getName(){
        return name;
    }
}
