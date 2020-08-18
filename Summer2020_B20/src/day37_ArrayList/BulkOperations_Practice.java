package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList <String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Dawud");

        boolean r1 = students.containsAll(Arrays.asList("Ulku", "Usra"));

        System.out.println(r1);
        System.out.println("===========================================");

        ArrayList <String> group1 = new ArrayList<>();

        group1.addAll(Arrays.asList("Muhtar", "Nadir", "Asiya", "Saim"));
        System.out.println(group1);


    }
}
