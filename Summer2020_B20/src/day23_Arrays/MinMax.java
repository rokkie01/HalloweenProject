package day23_Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {5,5,4,3,4,1};
        int max = arr[0];//6
        int min = arr[0];

        for(int i=1; i<=arr.length-1; i++){//i:1,2,3,4,5

            if(arr[i]>max) {//compares the array elements, and assign the max number to variable max
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min number is: "+ min);
        System.out.println(("max number is: "+max));
    }
}
