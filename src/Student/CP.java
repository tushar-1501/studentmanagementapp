package Student;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
 static  Connection con;
    public static Connection createc(){
     try {
        Class.forName("com.mysql.jdbc.Driver");
        String user="root";
        String password="tushar@012";
        String url="jdbc:mysql://localhost:3306/student_manage";
        con=DriverManager.getConnection(url, user, password);
     } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
     }
     return con;
    }
}
