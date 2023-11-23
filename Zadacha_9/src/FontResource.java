class FontResource implements Resource {
    private String name;

    public FontResource(String name) {
        this.name = name;
        System.out.println("Загрузка шрифта: " + name);
    }

    @Override
    public void display() {
        System.out.println("Просмотр шрифта: " + name);
    }
}