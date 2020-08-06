package Interview;
import java.util.Scanner;
//Print out the number of times that the string "hi" appears anywhere in the given string.
public class CountOccuranceWordHi {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            int count = 0;
            for (int i = 0; i <= str.length()-1; i++) {
                if(str.contains("hi")){
                    count++;
                    str = str.replaceFirst("hi", "" );
                }
            }
            System.out.println(count);
        }
    }


