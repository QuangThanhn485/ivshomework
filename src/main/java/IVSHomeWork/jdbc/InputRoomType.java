package IVSHomeWork.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InputRoomType {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = ConnectionUtils.getSQLServerConnection();
        try{
        Statement statement = conn.createStatement();
        
            //statement.executeUpdate("INSERT INTO RoomTypes " + "VALUES ('001','phòng thường')");
            statement.executeUpdate("INSERT INTO RoomTypes " + "VALUES ('002','phòng Vip')");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
