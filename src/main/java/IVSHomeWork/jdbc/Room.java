package IVSHomeWork.jdbc;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public int id;
    public String RoomType;
    public double area;

    public Room(int id, String roomType, Double area) {
        this.id = id;
        this.RoomType = roomType;
        this.area = area;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return this.RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    List<Room> rooms = new ArrayList<Room>();
}
