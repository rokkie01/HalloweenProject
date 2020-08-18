package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice1 {
    public static void main(String[] args) {

    ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,2,2,23,3,3,3,3,6,7,8,9));
        nums.removeIf(p-> Collections.frequency(nums, p)!=1); //for the elements that are not unique
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println("==================================");

        ArrayList<String> str = new ArrayList<>();
        str.addAll(Arrays.asList("red", "red","white","blue"));
        int frequency = Collections.frequency(str, "red");

        System.out.println(frequency);
}
}
