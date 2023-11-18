public class Room {
    private int area;
    private String wallColor;
    private String furniture;

    public static class RoomBuilder {
    private int area;
    private String wallColor;
    private String furniture;

    public RoomBuilder setArea(int area) {
        this.area = area;
        return this;
    }

    public RoomBuilder setWallColor(String wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public RoomBuilder setFurniture(String furniture) {
        this.furniture = furniture;
        return this;
    }

    public Room build() {
        return new Room(this);
    }
}

    private Room(RoomBuilder builder) {
        this.area = builder.area;
        this.wallColor = builder.wallColor;
        this.furniture = builder.furniture;
    }

    public int getArea() {
        return area;
    }

    public String getWallColor() {
        return wallColor;
    }

    public String getFurniture() {
        return furniture;
    }
}
