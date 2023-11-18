public class Main {
    public static void main(String[] args) {
        Room room = new Room.RoomBuilder()
                .setArea(28)
                .setWallColor("серый")
                .setFurniture("шкаф, кровать, стол")
                .build();
        System.out.println("Площадь комнаты: " + room.getArea() + "м кв.");
        System.out.println("Цвет стен: " + room.getWallColor());
        System.out.println("Мебель: " + room.getFurniture());
    }
}