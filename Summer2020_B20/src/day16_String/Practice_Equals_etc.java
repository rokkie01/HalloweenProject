package day16_String;
import java.util.Scanner;
public class Practice_Equals_etc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employeed?");
        String answer = scan.next();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Not employed");
        }

        //CONTAINS: (contains) - checks if given str is contained in the string or not. returns boolean
        String str = "I like to learn java programmimg language";

        System.out.println(str.contains("language"));;//false.Does the sentence contain the word "python"
        System.out.println(!str.contains("python"));//true
        System.out.println("========================================");

        //Starts With: startsWith() - checks if the string is started with the given string.returns boolean
        String s1 = "Muhtar";
        System.out.println( s1.startsWith("M"));//true
        System.out.println(s1.startsWith("J"));//false

        System.out.println(s1.startsWith("Mu"));//true
        System.out.println(s1.toLowerCase().contains("mu"));

    }
}
