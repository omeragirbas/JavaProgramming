package day39_Recap.cydeoTask;

public class Student extends Person{
    private int studentId;
    private String fileOfStudy;

    public Student(String name, int age, char gender, int studentId, String fileOfStudy) {
        super(name, age, gender);
       // this.studentId = studentId;
       // this.fileOfStudy = fileOfStudy;
        setStudentId(studentId);
        setFileOfStudy(fileOfStudy);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFileOfStudy() {
        return fileOfStudy;
    }

    public void setFileOfStudy(String fileOfStudy) {
        this.fileOfStudy = fileOfStudy;
    }

public void study(){
    System.out.println(getName()+" is studying");
}


    public String toString() {
        return "Student{" +
                "name=" + getName() +
                "age=" + getAge() +
                "gender=" + getGender() +
                "studentId=" + studentId +
                ", fileOfStudy='" + fileOfStudy + '\'' +
                '}';
    }
}
