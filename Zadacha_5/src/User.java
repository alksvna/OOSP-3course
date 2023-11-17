public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String product, double discount) {
        System.out.println(name + ", получено уведомление: на товар " + product + " действует скидка " + discount + "%");
    }

}
