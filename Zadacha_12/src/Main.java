import java.util.List;
public class Main {

    public static void main(String[] args) {
        Subfolder subfolder=new Subfolder("�������");
        Folder folder=new Folder("����", "������������");
        Video video1 =new Video("������������ ���", "������������");
        Video video2 =new Video("������������ ����", "������������");
        Video video3 =new Video("������", "����");
        folder.addVideo(video1);
        folder.addVideo(video2);

        subfolder.addFolder(folder);
        subfolder.addVideo(video3);
        subfolder.look();
    }
}
