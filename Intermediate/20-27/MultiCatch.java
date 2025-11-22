class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("123A");  // NumberFormatException
            int b = 10 / 0;                   // ArithmeticException
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Number Format!");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error Occurred!");
        }
        catch (Exception e) {
            System.out.println("Some Other Exception Occurred.");
        }

        System.out.println("Program Ends Normally.");
    }
}
