package day29_CustomMethods;

public class UniqueElements {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};
        uniques(arr);
        String[] arr2 = {"D","D","E","F","F"};
        uniques(arr2);
    }
    public static void uniques(String[] arr) {

        for (String a : arr) {
            int count = 0;
            for (String each : arr) {//need to compare with each variable in the array
                if (a.equals(each)) {//if it occured we need to increase the count by 1
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a);//if frequency has passed 1, we will print one
            }
        }
        System.out.println();
    }
}
