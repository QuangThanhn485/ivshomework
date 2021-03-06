package IVSHomeWork.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    // Kết nối vào SQLServer.
    // (Sử dụng thư viện điều khiển JTDS)
    public static Connection getSQLServerConnection()
            throws SQLException, ClassNotFoundException {
        String hostName = "DESKTOP-RDB3EOL";
        String sqlInstanceName = "MSSQLSERVER";
        String database = "Motel_Room";
        String userName = "sa";
        String password = "quangthanh123";

        return getSQLServerConnection(hostName, sqlInstanceName, database,
                userName, password);
    }

    // Trường hợp sử dụng SQLServer.
    // Và thư viện JTDS.
    public static Connection getSQLServerConnection(String hostName,
            String sqlInstanceName, String database, String userName,
            String password) throws ClassNotFoundException, SQLException {
        // Khai báo class Driver cho DB SQLServer
        // Việc này cần thiết với Java 5
        // Java6 tự động tìm kiếm Driver thích hợp.
        // Nếu bạn dùng Java6, thì ko cần dòng này cũng được.
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        // Cấu trúc URL Connection dành cho SQLServer
        // Ví dụ:
        // jdbc:jtds:sqlserver://localhost:1433/simplehr;instance=SQLEXPRESS
        String connectionURL = "jdbc:sqlserver://" + hostName + ":1433;databaseName="
                + database + ";instance=" + sqlInstanceName;

        Connection conn = DriverManager.getConnection(connectionURL, userName,password);
        if (conn != null) {
            DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());
        }
        return conn;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionUtils.getSQLServerConnection();
    }
}
