package IVSHomeWork.jdbc;

import IVSHomeWork.Math.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectOrInsertRoom {
    static Room room = new Room(0, null, 0.0);
    static general general =  new general(null);
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        //System.out.println(Insert());
        //int id = general.inputInt("nhập mã số phòng : ");
        //SelectRoom(id);
        selectAllRoom();
    }
    public static int Insert() throws ClassNotFoundException, SQLException

    {
        Connection conn = ConnectionUtils.getSQLServerConnection();
        try{
        Statement statement = conn.createStatement();
        
            statement.executeUpdate("INSERT INTO Room " + "VALUES ('001','001','12')");
            statement.executeUpdate("INSERT INTO Room " + "VALUES ('002','001','23')");
            statement.executeUpdate("INSERT INTO Room " + "VALUES ('003','002','24')");
            statement.executeUpdate("INSERT INTO Room " + "VALUES ('004','002','22')");
            statement.executeUpdate("INSERT INTO Room " + "VALUES ('005','001','13')");
            return 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 1;
        }
    }
    public static void SelectRoom(int roomCode) throws ClassNotFoundException, SQLException
    {
        Connection conn = ConnectionUtils.getSQLServerConnection();
        try{
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Room WHERE id ="+roomCode+"");
        if(rs.equals(null))
        {
            System.out.println("don't find");
            return;
        }
        while (rs.next()) {
            String id = rs.getString("id");
            String RoomType = rs.getString("RoomType");
            Double area = rs.getDouble("area");
            System.out.println(id + "\n" +RoomType+"\n"+area);
          }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void selectAllRoom() throws ClassNotFoundException, SQLException
    {
        Connection conn = ConnectionUtils.getSQLServerConnection();
        try{
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM Room");
        if(rs.equals(null))
        {
            System.out.println("don't find");
            return;
        }
        while (rs.next()) {

            int id = rs.getInt("id");
            String RoomType = rs.getString("RoomType");
            Double area = rs.getDouble("area");
            room.rooms.add(new Room(id,RoomType,area));
        }
        for(Room item:room.rooms)
        {
            general.line(String.valueOf(item.id));
            System.out.println("id : "+item.id);
            System.out.println("room type : "+item.RoomType);
            System.out.println("area : "+item.area);
        }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
