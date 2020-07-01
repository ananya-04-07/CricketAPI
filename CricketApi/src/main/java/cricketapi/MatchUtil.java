package cricketapi;

import java.sql.Connection;
import java.sql.DriverManager;

public class MatchUtil {
    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }

    public static void connectionJDBC()
    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Cricket?", System.getenv("USER_NAME"), System.getenv("PASS_WORD"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
