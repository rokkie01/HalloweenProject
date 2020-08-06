package day21_Loops;

import java.util.Scanner;

public class MinimalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i =1; i <=5; i++){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            int min = 9999999;

                if(num<min){
                    min=num;
                }
            }
        }
    }

