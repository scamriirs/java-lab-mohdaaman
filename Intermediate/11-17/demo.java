class Demo {
    int x;
    static int count = 0;

    Demo(int x) {
        this.x = x;      // using this
        count++;         // using static variable
    }

    void display() {
        System.out.println("Value of x: " + x);
        System.out.println("Total Objects: " + count);
    }

    public static void main(String[] args) {
        Demo d1 = new Demo(10);
        Demo d2 = new Demo(20);

        d1.display();
        d2.display();
    }
}
