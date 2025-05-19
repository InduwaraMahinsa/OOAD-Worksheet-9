public class Student {
    private String studentId;
    private String name;
    private double GPA;

    public Student(String studentId, String name, double GPA) {
        this.studentId = studentId;
        this.name = name;
        this.GPA = GPA;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public double getGPA() {
        return GPA;
    }
}
