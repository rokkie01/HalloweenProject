package day14_Recap;
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your country name: ");
        String countryName = input.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        


    }
}
