public class MonitorConnect extends Connection{
    public MonitorConnect(Device device) {
        super(device);
    }

    public void connect() {
        device.turnOn();
        System.out.println("Соединение установлено. Включаем видео.");
        device.turnOff();
    }
}
