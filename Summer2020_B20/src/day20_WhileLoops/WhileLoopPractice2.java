package day20_WhileLoops;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        int num = 10;//11
        while (num < 15) {
            System.out.print("Irene Varol ");//1,
            num++;
        }
        System.out.println(num);
        System.out.println("==================================");

        String str = "Cybertek School";
        //         01234567

        String result = "";
        int index = str.length() - 1;
        while (index >= 0) {
        result +=str.charAt(index);
            index--;
        }
        System.out.println();
    }
}
