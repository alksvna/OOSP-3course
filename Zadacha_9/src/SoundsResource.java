public class SoundsResource implements Resource {
    private String name;

    public SoundsResource(String name) {
        this.name = name;
        System.out.println("Загрузка звука: " + name);
    }

    @Override
    public void display() {
        System.out.println("Включение звука: " + name);
    }
}
