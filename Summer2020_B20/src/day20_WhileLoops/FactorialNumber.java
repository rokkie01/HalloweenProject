package day20_WhileLoops;
//find out factorial number of any give number
// input 5; output = 120; because: 5! = 5*4*3**2*1
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 1;//5*4*3*2*1

        for(int i = 5; i>=1; i -=1){
            result *= i;
            System.out.println(result);
        }

    }
}
