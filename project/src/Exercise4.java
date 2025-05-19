import java.util.HashMap;

public class Exercise4 {
    public static void main(String[] args) {
        Student student1 = new Student("IT12345","Induwara",3.00);
        Student student2 = new Student("IT98765","Mahinsa",3.10);
        Student student3 = new Student("IT78945","Ishan",3.20);

        HashMap<String,Student> hashmap = new HashMap<>();
        hashmap.put(student1.getStudentId(),student1);
        hashmap.put(student2.getStudentId(),student2);
        hashmap.put(student3.getStudentId(),student3);

        System.out.println(hashmap.get("IT78945").getName());
    }
}
