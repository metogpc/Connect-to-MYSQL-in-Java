import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

    static final String driver="com.mysql.cj.jdbc.Driver";
    static final String url="jdbc:mysql://localhost/databaseName";

    static final String user="root";
    static final String password="1234";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement= null;

        try {
            Class.forName(driver);
            System.out.println("Connection to Database......");
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();

            statement.execute("CREATE TABLE Accounts (Name VARCHAR(30))");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
