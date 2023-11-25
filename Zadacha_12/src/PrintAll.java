import java.util.List;

public class PrintAll {
    public static <T extends ComponentVideo> void printAll(List<T> list) {
        for (T t : list) {
            t.look();
        }
    }
}