package day0;

import java.util.Arrays;

class MethodCall{
    public static void main(String[] args) {
        int arr[]={-12,14,15,16,-1};
        printDisc(arr);

        int arr1[]= {-14,-15,-10};
        int arr2[]= {1,2,3};
        combine2arrays(arr1,arr2);
    }

    public static void printDisc(int arr[]){
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);

        }
    }


    public static void combine2arrays(int arr1[], int arr2[]) {
        int[] arr3= new int[arr1.length + arr2.length];
        int i = 0;
        for(int each: arr1){
            arr3[i] = each;
            i++;
        }
        for(int each: arr2){
            arr3[i]=each;
            i++;
        }
        System.out.print(Arrays.toString(arr3));

    }
}

