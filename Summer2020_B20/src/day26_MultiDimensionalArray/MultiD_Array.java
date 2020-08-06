package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        char[]ch1 = {'A', 'B'};
        char[]ch2 = {'C', 'D', 'E'};
        char[]ch3 = {'F', 'G', 'H'};

        char[][] ch2D= {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
        // index number     0               1               2
        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(Arrays.toString(ch2D[2]));
        //H
        System.out.println(ch2D[2][2]);
        //C
        System.out.println(ch2D[1][0]);
        //G B
        System.out.println(ch2D[2][1] + " "+ch2D[0][1]);
        System.out.println("==============================");

    }
}
