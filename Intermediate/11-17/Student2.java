interface Marks {
    int totalMarks();
}

class Student2 implements Marks {

    int roll;
    String name;
    int m1, m2, m3;

    Student2(int r, String n, int a, int b, int c) {
        roll = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    // Implementing interface method
    public int totalMarks() {
        return m1 + m2 + m3;
    }

    void displayResult() {
        int total = totalMarks();
        double percentage = total / 3.0;

        System.out.println("----- Result Sheet -----");
        System.out.println("Roll No: " + roll);
        System.out.println("Name   : " + name);
        System.out.println("Total  : " + total);
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 40)
            System.out.println("Result : PASS");
        else
            System.out.println("Result : FAIL");
    }

    public static void main(String[] args) {
        Student2 s = new Student2(101, "Aaman", 45, 35, 40);
        s.displayResult();
    }
}