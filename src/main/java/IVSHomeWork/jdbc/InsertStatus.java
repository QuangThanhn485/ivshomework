package IVSHomeWork.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertStatus {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = ConnectionUtils.getSQLServerConnection();
        try{
        Statement statement = conn.createStatement();
        
            statement.executeUpdate("INSERT INTO Status " + "VALUES ('001','sẵn sàng')");
            statement.executeUpdate("INSERT INTO Status " + "VALUES ('002','đã đặt cọc')");
            statement.executeUpdate("INSERT INTO Status " + "VALUES ('003','đang thuê')");
            statement.executeUpdate("INSERT INTO Status " + "VALUES ('004','đang sửa chữa')");
            statement.executeUpdate("INSERT INTO Status " + "VALUES ('005','đã xóa')");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
