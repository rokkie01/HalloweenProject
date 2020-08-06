package day15_String;
import java.util.Scanner;
public class Practice3_ConcatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = "Input your first name";
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();
        firstName.concat(lastName);

        String fullName = firstName.concat(lastName);

        System.out.println("Your full name is: ".concat(fullName));

        System.out.println("==========================");
        String schoolName = "Cybertek";
        schoolName=schoolName.concat(" School");
        System.out.println(schoolName);

        String r1 = "Cybertek"+123+'A'+true;
        System.out.println(r1);
        String r2 = "Cybertek".concat("123");
    }
}
