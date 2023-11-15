public class Main {
    public static void main(String[] args) {
        Equipment adapter = new Adapter(new Printer(), new Scanner());
        adapter.connectToDevice();
    }
}