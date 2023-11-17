public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("куртка", 10);
        Product product2 = new Product("свитер", 5);

        User user1 = new User("Виктор");
        User user2 = new User("Алиса");

        product1.addObserver(user1);
        product1.addObserver(user1);
        product2.addObserver(user2);

        product1.setDiscount(50);
        product2.setDiscount(15);
    }
}