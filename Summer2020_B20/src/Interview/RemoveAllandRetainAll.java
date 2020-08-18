package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllandRetainAll {
    public static void main(String[] args) {
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList("Irene", "Robert", "Jeanette","Sandra"));
        arr2.retainAll(Arrays.asList("Irene"));//removeAll
        System.out.println(arr2);

    }
}
