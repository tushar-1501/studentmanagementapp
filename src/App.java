import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import Student.Student;
import Student.StudentDao;

public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("student mangement app");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
        System.out.println("press 1 to add student");
        System.out.println("press 2 to delete student");
        System.out.println("press 3 to display student");
        System.out.println("press 4 to exit");
        int c=Integer.parseInt(br.readLine());
        if(c==1){
            // insert 
        System.out.println("enter user name :");
        String name=br.readLine();
        System.out.println("enter user phone :");
        String phone=br.readLine();
        System.out.println("enter user city :");
        String city=br.readLine();
        Student st=new Student(name, city, phone);
        boolean ans=StudentDao.insertStudentToDb(st);
        if(ans){
            System.out.println("student is successfully added");
        }else{
            System.out.println("something wrong");
        }
        System.out.println(st);
        }else if(c==2){
            //delete
            System.out.println("enter id to be deleted");
            int userId =Integer.parseInt(br.readLine());
           boolean f= StudentDao.deleteStudent(userId);
           if(f){
            System.out.println("deleted");
           }else{
            System.out.println("something wrong");
           }
        }else if(c==3){
            //display
            StudentDao.displayAll();

        }else if(c==4){
            break;
        }else{
            System.out.println("exit from the app");
        }

        }
          
    }
}
