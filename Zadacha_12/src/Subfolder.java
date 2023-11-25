import java.util.*;
public class Subfolder implements ComponentVideo{private String name;
    private List<ComponentVideo> componentVideo;
    private List<Folder> folderList=new ArrayList<Folder>();

    public Subfolder(String name) {
        this.name = name;
        this.componentVideo = new ArrayList<ComponentVideo>();



    }
    public void addFolder(Folder folder){
        folderList.add(folder);
    }
    public void addVideo(ComponentVideo video){
        componentVideo.add(video);
    }

    @Override
    public void look() {
        System.out.println("просмотр подпапки "+ name);
        PrintAll.printAll(folderList);
        PrintAll.printAll(componentVideo);
    }
}
