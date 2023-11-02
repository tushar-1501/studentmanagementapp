package Student;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.PreparedStatement;


public class StudentDao {
    public static boolean insertStudentToDb(Student st){
        boolean f=false;
          try {
            Connection con=CP.createc();
            String q="insert into students(sname,sphone,scity) values(?,?,?)";
           PreparedStatement pstmt= con.prepareStatement(q);
           pstmt.setString(1, st.getStudentname());
           pstmt.setString(2, st.getStudentphone());
           pstmt.setString(3, st.getStudentcity());
           pstmt.executeUpdate();
           f=true;
          } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
          }
          return f;
    }
    public static boolean deleteStudent( int userId){
         boolean f=false;
          try {
            Connection con=CP.createc();
            String q="delete from students where id=?";
           PreparedStatement pstmt= con.prepareStatement(q);
           pstmt.setInt(1, userId);
           pstmt.executeUpdate();
           f=true;
          } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
          }
          return f;
    }
    public static void displayAll(){
        boolean f=false;
          try {
            Connection con=CP.createc();
            String q="select * from students;";
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(q);
           while(set.next()){
            int id =set.getInt(1);
            String name=set.getString(1);
            String phone =set.getString(2);
            String city=set.getString("scity");
            System.out.println("ID:"+id);
            System.out.println("NAME:"+name);
            System.out.println("PHONE"+phone);
            System.out.println("CITY"+city);
           }
          } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
          }
        
    }
    
}
