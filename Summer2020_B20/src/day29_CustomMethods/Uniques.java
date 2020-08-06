package day29_CustomMethods;
/* if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C */

public class Uniques {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};
        //String a = "A";//we need to check each character
        for(String a:arr){//gets each of the element
        int count = 0; //need to count how many times the element has occured.
                                    //checks every element
        for (String each : arr) {//need to compare with each variable in the array
            if (a.equals(each)) {//if it occured we need to increase the count by 1
                count++;
            }
        }
        if (count == 1) {
            System.out.println(a);//if frequency has passed 1, we will print one
        }
    }
}}
