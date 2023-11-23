class ImageResource implements Resource {
    private String name;

    public ImageResource(String name) {
        this.name = name;
        System.out.println("Загрузка изображения: " + name);
    }

    @Override
    public void display() {
        System.out.println("Просмотр изображения " + name);
    }
}
