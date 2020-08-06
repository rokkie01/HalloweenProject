package Practice_07_08_2020;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 21456789;

        for(int i =0; i<5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n<min){
                min = n;
            }
            System.out.println(min);
        }


    }
}
