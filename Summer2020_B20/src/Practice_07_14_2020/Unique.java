package Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {

        String str = "ABABCdddeeefghir";
        String expectedResult = "";//"C"

        for (int j = 0; j < str.length(); j++) {//frequency of each character

            char ch = str.charAt(j); //"A"
            int count = 0;

            for (int i = 0; i < str.length(); i++) {//helps us to calculate frequency of each char
                char each = str.charAt(i);
                if (each == ch) {
                    count += 1;
                }
            }
            if (count == 1) {
                expectedResult += ch;
            }
        }
        System.out.println(expectedResult);
    }
}
