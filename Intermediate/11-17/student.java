class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student obj = new Student(101, "Aaman");
        obj.display();
    }
}