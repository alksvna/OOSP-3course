public class Monitor implements Device {
    public void turnOn() {
        System.out.println("Идет соединение с монитором.");
    }

    public void turnOff() {
        System.out.println("Соединение прервано. Передача данных завершена.");
    }
}
