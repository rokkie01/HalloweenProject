package day14_Recap;
import java.util.Scanner;
public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address: ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();

        scan.nextLine();

        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        /* Ship to: Jimmy Joe
        7925 Jones branch Drive
        McLean, VA 22102
         */
        System.out.println("\nShip to: " + fullName+"\n"+buildingNumber+ " "+
                streetAddress+"\n"+cityName+", "+zipCode);
    }
}
