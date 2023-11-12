public class MexicanFood extends Food {
    public MexicanFood(String name) {
        this.name = name;
        this.cuisine = "Mexican";
    }

    public void prepare() {
        System.out.println("Preparing Mexican food: " + name);
    }
}
