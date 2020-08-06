package day19_ForLoop;
/* print odd numbers between 1 to 50
print even number between 1 to 50
 */
public class OddEven2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {//in order to print odd, we can shose skip even number
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        for (int i = 1; i <= 50; i++) {//in order to print odd, we can shose skip even number
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
