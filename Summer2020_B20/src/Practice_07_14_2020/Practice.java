package Practice_07_14_2020;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {"Aila", "Irene", "Rokkie"};

        for (int i = 0; i <= str.length - 1; i++) {
            if (!str[i].startsWith("A")) {
                continue;
            }

            System.out.println(str[i]);
            System.out.println("==================================");


        }
    }
}

