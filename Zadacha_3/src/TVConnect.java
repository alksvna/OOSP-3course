public class TVConnect extends Connection {
    public TVConnect(Device device) {
        super(device);
    }

    public void connect() {
        device.turnOn();
        System.out.println("Соединение установлено. Включаем видео.");
        device.turnOff();
    }
}
