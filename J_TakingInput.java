//Importing Scanner class form java.util.Scanner
import java.util.Scanner;
public class J_TakingInput {

    public static void main(String[] args) {
    J_TakingInput.createContactUsForm();
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

    public static void createContactUsForm(){
        System.out.println("Welcome to our website");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your State");
        String state = sc.nextLine();
        System.out.println("Enter your e-mail Id");
        String email = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your Phone Number");
        long phoneNo = sc.nextLong();
        System.out.println("Details Entered by you are as follows");
        System.out.println("Name = " + name);
        System.out.println("State = " + state);
        System.out.println("E-mail Id = " + email);
        System.out.println("Age = " + age);
        System.out.println("Phone Number = " + phoneNo);
    }
}
