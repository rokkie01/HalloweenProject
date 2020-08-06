package Practice;

public class Unique {
    public static void main(String[] args) {

        String[] arr = {"E", "K", "I", "K", "I"};
        for (String a : arr) {//get each element of the array
            int count = 0;
            for (String each : arr) {//need to compare each variable
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a);//if frequency has passed 1, we will print the unique value console
            }
        }
    }
}
