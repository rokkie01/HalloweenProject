package day14_Recap;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
scan.close();
        String result = " ";

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                result = "Excellent";
            } else if (score >= 80){
            result = "Great";
        } else if (score >= 70){
        result = "Good";
    }else if (score>=60) {
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid Entry";
        }
        System.out.println(result);
    }
}
