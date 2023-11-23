public class Main {

    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.getInstance();

        Resource image1 = resourceManager.getResource("пейзаж.png");
        Resource font1 = resourceManager.getResource("шрифт1.ttf");
        Resource image2 = resourceManager.getResource("картинка2.png");
        Resource sound1 = resourceManager.getResource("аудио.mp3");

        image1.display();
        font1.display();
        image2.display();
        sound1.display();
    }
}
