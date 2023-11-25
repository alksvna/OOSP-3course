import java.util.List;
public class Main {

    public static void main(String[] args) {
        Subfolder subfolder=new Subfolder("Свадьба");
        Folder folder=new Folder("ЗАГС", "Поздравления");
        Video video1 =new Video("Поздравление Аня", "Поздравления");
        Video video2 =new Video("Поздравление Дима", "Поздравления");
        Video video3 =new Video("Кольца", "ЗАГС");
        folder.addVideo(video1);
        folder.addVideo(video2);

        subfolder.addFolder(folder);
        subfolder.addVideo(video3);
        subfolder.look();
    }
}
