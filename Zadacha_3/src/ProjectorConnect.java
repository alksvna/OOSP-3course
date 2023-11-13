public class ProjectorConnect extends Connection {
    public ProjectorConnect(Device device) {
        super(device);
    }

    public void connect() {
        device.turnOn();
        System.out.println("Соединение установлено. Включаем видео.");
        device.turnOff();
    }
}
