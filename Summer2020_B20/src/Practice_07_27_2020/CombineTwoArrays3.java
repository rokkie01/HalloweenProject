package Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays3 {
    public static void main(String[] args) {

        String[] a1 = {"Tetiana", "Hamit", "Irene"};
        String[] a2 = {"Aaloa", "Zaki", "Cristina", "Dawut"};

        String[] students = new String[a1.length+a2.length];

        for(int i=0; i<=a1.length-1; i++){
            students[i] = a1[i];
        }
        for(int i =0; i<=a2.length-1; i++){
            students[i+a1.length]=a2[i];
        }
        System.out.println(Arrays.toString(students));

    }
}
