package Interview;
/*sentence -> "Java is fun"
Print
fun
is
Java */
import java.util.Scanner;

public class ReverseString {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();

            String[] word=sentence.split("\\s");
            String output = "";
            for (int i = word.length-1; i >=0 ; i--) {
                output+=word[i]+"\n";
            }
            System.out.print(output);

        }
    }

