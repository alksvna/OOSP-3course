public class Main {
    public static void main(String[] args) {
        Device monitor = new Monitor();
        Device tv = new TV();
        Device projector = new Projector();

        Connection monitorConnect = new MonitorConnect(monitor);
        Connection tvConnect = new TVConnect(tv);
        Connection projectorConnect = new ProjectorConnect(projector);

        monitorConnect.connect();
        System.out.println();
        tvConnect.connect();
        System.out.println();
        projectorConnect.connect();
    }
}