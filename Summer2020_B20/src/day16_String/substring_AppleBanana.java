package day16_String;
import java.util.Scanner;
public class substring_AppleBanana {
    public static void main(String[] args) {
        //extra task:
        String str = "I like to drink Pepsi";
        //counting needs start from 012345678910
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10, 15);
        System.out.println(action);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String str1 = scan.next();//Apple

        System.out.println("Enter your second word");
        String str2 = scan.next();//Banana

        //wanted result ppleanana

      //  One solution: String result = str1.substring(1).concat(    str2.substring(1)   );
        String result = str1.substring(1)+str2.substring(1);

        System.out.println(result);

    }
}
