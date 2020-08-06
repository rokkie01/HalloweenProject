package day19_ForLoop;

public class OddEven {
    //1 3 5 7 9 11........99
    public static void main(String[] args) {

        for (int i = 1; i <= 99; i += 2) {//1,3,5,7,9,11
            if (i % 5 == 0 && i % 3 == 0) {//15,45,75: divisible for 3 and 5
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {//pre: i must be odd number
                if (i % 5 == 0 && i % 3 == 0) { //sub: must be divisible by 3&5
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("===========================================");

        //Task 2
        //1: 0 2 4 6.........100
        for (int i = 0; i <= 100; i += 2) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {// pre: for even number. mist be even
                if (i % 3 == 0 && i % 5 == 0) {//the number must be divisible by 3 & 5
                    System.out.println(i + " ");
                }
            }
        }
    }
}