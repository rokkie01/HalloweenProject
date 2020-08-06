package Office_Hours.Practice_07_15_2020;

import java.util.Scanner;

public class FrequencyOfWords2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =scan.nextLine().toLowerCase();
        int count=0;

        while(str.contains("java")){
            count++;
            str=str.replaceFirst("java", "");

        }
        System.out.println(count);

    }
}
