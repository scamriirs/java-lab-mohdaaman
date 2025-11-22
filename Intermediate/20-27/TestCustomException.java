class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class TestCustomException {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age is less than 18. Not Allowed!");
        else
            System.out.println("Access Granted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
