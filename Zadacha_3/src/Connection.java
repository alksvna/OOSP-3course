public abstract class Connection {
    protected Device device;

    public Connection(Device device) {
        this.device = device;
    }

    public abstract void connect();
}
