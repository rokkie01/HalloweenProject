package Practice;

import java.util.Scanner;

public class PracticeToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*String name = "Irene";
        name=name.replaceFirst("I", "V");
        System.out.println(name);*/
        System.out.println("=============================");

        String name2 = "Erik is great";
        int i1 = name2.lastIndexOf("g");
        System.out.println(i1);
        System.out.println("=============================");

        String s4 = "I love Java";
        s4 = s4.replace("I love", "adore");
        System.out.println(s4);
        System.out.println("=============================");

        String s5 = "Java is cool";
        int s7 = s5.lastIndexOf("cool") + 1;
        System.out.println(s7);
        System.out.println("=============================");

        int a = 25;
        int b = 10;
        int count = 0;
        while (a > b) {
            a -= b;
            count++;
        }
        System.out.println(count + " remaider of " + a);
        System.out.println("=============================");

        /*int max = -2146789;
        for(int i = 10; i<=50; i+=10){
            System.out.println("enter max number");
            int num = scan.nextInt();
            if(num>max){
                max=num;
            }
            System.out.println("max number "+max);*/

        /*int min = 2145678989;
        for (int r = 10; r < 50; r -= 10) {
            System.out.println("enter a number");
            int num1 = scan.nextInt();

            if (num1 < min) {
                min = num1;
            }
            System.out.println("minimum number is " + min);*/
        System.out.println("Enter a name");
        String p1 = scan.next();
        String p2 = " ";

        for (int p3 = p2.length() - 1; p3>=0; p3 -= 1){
            p1+= p2.charAt(p3);
        }
        System.out.println(p2);
    }
}
