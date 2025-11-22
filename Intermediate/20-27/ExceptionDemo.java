class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by Zero!");
        }

        System.out.println("Program continues...");
    }
}
