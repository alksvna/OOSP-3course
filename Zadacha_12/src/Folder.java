import java.util.ArrayList;
import java.util.List;

public class Folder implements ComponentVideo {
    private String name;
    private String way;
    private List<ComponentVideo> videoList;

    public Folder(String name, String way) {
        this.name = name;
        this.videoList = new ArrayList<ComponentVideo>();
        this.way = way;
    }

    public String getName() {
        return name;
    }
    public void addVideo(ComponentVideo componentVideo){
        videoList.add(componentVideo);
    }

    public List<ComponentVideo> getVideoList() {
        return videoList;
    }


    @Override
    public void look() {
        System.out.println();
        System.out.println("просмотреть в " + way + "видео "+ name);
        PrintAll.printAll(videoList);

        System.out.println();

    }
}
