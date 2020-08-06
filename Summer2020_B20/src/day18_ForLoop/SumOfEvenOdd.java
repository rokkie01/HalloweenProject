package day18_ForLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        //Task 3:
        //0 2 4 6 8 10
        int sumOfEven = 0;
        for (int i = 0; i <= 100; i += 2) {
            sumOfEven += i;//sum of all even numbers

            System.out.println(sumOfEven);
        }
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            }
        }
        System.out.println(sumOfEven);
        System.out.println("==================================");
        //task04:
        //1 3 5 7 9 .... 99
      /*  int sumOfOdd = 0;
        for (int i = 1; i <= 99; i += 2) {
            sumOfOdd += i;
        }
        System.out.println();
    } */

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
            }
        }
    }
}