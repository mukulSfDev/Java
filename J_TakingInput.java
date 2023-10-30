//Importing Scanner class form java.util.Scanner
import java.util.Scanner;
public class J_TakingInput {

    public static void main(String[] args) {
    // Creating Object of scanner class 
    Scanner sc = new Scanner(System.in);
    // Creating instance of Scanner class sc
    System.out.println("Enter First number");
    int a = sc.nextInt();

    System.out.println("Enter Second number");

    int b = sc.nextInt();
    int sum = a + b ;

    System.out.println("Sum of both number is " +sum);

    }
}
