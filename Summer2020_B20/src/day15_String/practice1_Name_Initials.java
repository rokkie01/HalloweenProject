package day15_String;

import java.util.Scanner;

public class practice1_Name_Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();//Cybertek
        char ch1 = firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName = input.next();//School
        char ch2 = lastName.charAt(0);

        System.out.println("Enter your last name: "+ch1+ch2);

        //length() ==>
        String name = "Cybertek School";
        int l = name.length();
        System.out.println(l);

        // last index: length of String -1
        int lastIndexNumber = name.length()-1;
        System.out.println(lastIndexNumber);


    }
}
