public class ItalianFood extends Food {
    public ItalianFood(String name) {
        this.name = name;
        this.cuisine = "Italian";
    }

    public void prepare() {
        System.out.println("Preparing Italian food: " + name);
    }
}
