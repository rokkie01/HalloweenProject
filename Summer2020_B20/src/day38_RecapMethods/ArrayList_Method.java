package day38_RecapMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Method {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList <>();
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Infinity", "Tesla", "WV", "Lamborghini", "Lexus"));

        //cars.remove(3);
        //cars.remove("Tesla");
        //cars.removeAll(Arrays.asList("Tesla"));

        cars.removeIf(p ->p.toLowerCase().contains("m"));
        System.out.println(cars);

        System.out.println("=====================================");

        ArrayList <String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Paper Towel", "Paper"));

        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);

        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs", "Orange", "Milk"));
        System.out.println(r2);

        System.out.println("Total Number os Items: "+ groceryList.size());

        groceryList.set(groceryList.size()-1, "Apple");
        groceryList.set(groceryList.indexOf("Paper"), "Dish Washer");
        System.out.println(groceryList);
    }
}
