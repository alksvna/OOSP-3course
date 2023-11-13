public class Projector implements Device {
    public void turnOn() {
        System.out.println("Идет соединение с проектором.");
    }

    public void turnOff() {
        System.out.println("Соединение прервано. Передача данных завершена.");
    }
}
