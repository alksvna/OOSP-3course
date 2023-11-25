public class Video implements ComponentVideo{
    @Override
    public void look() {
        System.out.println("просмотр " + name);
    }

    private String name;
    private String way;

    public Video(String name, String way) {
        this.name = name;
        this.way = way;
    }

    public String getName() {
        return name;
    }
    public String getWay() {
        return way;
    }
}
