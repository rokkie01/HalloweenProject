package day23_Arrays;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 + num2;
            System.out.println(result);
            System.out.println("Do you want to continue");
            String a = input.next().toLowerCase();

            while (!(a.equals("yes")|| a.equals("no"))) {
                System.out.println("Invalid answer, please answer yes or no");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }
                if(a.equals("no")){
                break;

            }
        }

    }
}
