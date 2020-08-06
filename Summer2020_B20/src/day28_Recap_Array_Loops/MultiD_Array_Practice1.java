package day28_Recap_Array_Loops;

import java.util.Arrays;

public class MultiD_Array_Practice1 {
    public static void main(String[] args) {
        String[] group33 = {"Davut","Dilara","Nurmamet","Nurbiye","Pavlo","Julaiti","Virginia","Zain","Ali","Etnick","Aigul","Mike","Veola"};
        String[] group22 = {"Aiperi","Aalia","Rumiya","Viorel", "Samir"};
        String[] group2 = { "Ali", "Anton", "Elif", "Filip", "Guljannat" };
        String [] group21 = {"Violeta","Alla", "Adam", "Lilia"};
        String [] group17 =  {"Elvira", "Zeliha", "Paban","Asylkan", "Dilyar", "Roza","Kamil", "Sedge"};

        String [][] Batch20 = {group33,group22,group2,group21,group17};
                            //      0       1       2       3       4
        for(int i=0; i<= Batch20.length-1; i++){//outer loop gets each array
            String[] eachGroup = Batch20[i];
           // System.out.println(Arrays.toString(eachGroup));
            for(int j=0; j<=eachGroup.length-1; j++) {//inner loop to get each student
                String eachStudent = eachGroup[j];
                if (eachStudent.toLowerCase().contains("m")) {
                    System.out.println(eachStudent + " ");
                }
            }
            System.out.println();
        }

    }
}
