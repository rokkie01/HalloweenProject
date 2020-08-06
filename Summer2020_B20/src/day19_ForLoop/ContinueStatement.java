package day19_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;//jumps to the next iteration
            }
            System.out.print(i + " ");//1, 2, 4, 5
        }
        System.out.println();
        for (char ch = 'A'; ch <= 'F'; ch++) {
            if (ch == 'C' || ch == 'F') {//will skip C and F
                continue;
            }
            System.out.println(ch + " ");
        }
    }
}
