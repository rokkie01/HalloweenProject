package Interview;

import java.util.Scanner;

public class Split_The_Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
        for(String each : words){
            System.out.println(each);
            }
        }
}
