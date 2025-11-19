import java.util.*;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        String binary = "";

        int temp = num;

        if (num == 0) binary = "0";

        while (temp > 0) {
            int rem = temp % 2;
            binary = rem + binary;  
            temp = temp / 2;
        }

        System.out.println("Binary of " + num + " is: " + binary);
    }
}
