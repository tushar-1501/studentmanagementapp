package Student;

public class Student {
    private  int studentId;
    private  String studentname;
    private  String studentcity; 
    private  String studentphone;
    public Student(int studentId, String studentname, String studentcity, String studentphone) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.studentcity = studentcity;
        this.studentphone = studentphone;
    }
    public Student(String studentname, String studentcity, String studentphone) {
        this.studentname = studentname;
        this.studentcity = studentcity;
        this.studentphone = studentphone;
    }
    public Student() {
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public String getStudentcity() {
        return studentcity;
    }
    public void setStudentcity(String studentcity) {
        this.studentcity = studentcity;
    }
    public String getStudentphone() {
        return studentphone;
    }
    public void setStudentphone(String studentphone) {
        this.studentphone = studentphone;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentcity=" + studentcity
                + ", studentphone=" + studentphone + "]";
    }
    

}