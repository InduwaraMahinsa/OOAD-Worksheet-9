import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        Student student1 = new Student("IT12345","Induwara",3.00);
        Student student2 = new Student("IT98765","Mahinsa",3.10);
        Student student3 = new Student("IT78945","Ishan",3.20);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student student : students){
            System.out.println(student.getStudentId());
            System.out.println(student.getName());
            System.out.println(student.getGPA());
            System.out.println("---------------------------------");
        }

    }
}
