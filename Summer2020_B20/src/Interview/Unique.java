package Interview;

public class Unique {
    public static void main(String[] args) {

       /* String[] arr = {"Irene", "Irene", "Ibrahim"};

        for (String a : arr) {
            int count = 0;

            for (String each : arr) {
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a);
            }
            System.out.println("============================");

            int[] arr1 = {1, 1, 2, 2, 4, 5, 6, 7};

            for (int a1 : arr1) {
                int count1 = 0;

                for (int each1 : arr1) {
                    if (a1 == each1) {
                        count1++;
                    }
                }
                if (count1 == 1) {
                    System.out.println(a1);
                } */
                System.out.println("==================================");

                String arr3 = ("ABBBBCCCKKK");
                String[] s1 = arr3.split("");
                String Unique = "";

                for (int initial=0; initial<s1.length;initial++) {
                   int count3 =0;
                 for(int j=0; j<s1.length; j++){
                     if(s1[initial].equals(s1[j])){
                         count3++;
                     }
                 }
if(count3==1){
    Unique+=s1[initial];
    System.out.print(Unique);
}
                }
            }
        }