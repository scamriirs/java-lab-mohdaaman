import student.Student;
import exam.Result;

class Marksheet {
    public static void main(String[] args) {

        Student s = new Student(101, "Aaman");
        Result r = new Result(40, 35, 45);

        System.out.println("----- Marksheet -----");
        System.out.println("Roll No: " + s.roll);
        System.out.println("Name: " + s.name);
        System.out.println("Total Marks: " + r.total());
    }
}
