import java.util.Scanner;
import java.math.BigInteger;

public class factorial_n_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int number = sc.nextInt();
        int item = 1;
        while(item <= number){
            BigInteger fact = BigInteger.ONE;
            for(int i = 1; i <= item; i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial of "+item+" is: "+fact);
            item ++;
        }
        sc.close();
    }
}