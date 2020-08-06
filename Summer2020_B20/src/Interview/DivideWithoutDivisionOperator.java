package Interview;

public class DivideWithoutDivisionOperator {
    public static void main(String[] args) {

    int num1 = 25;
    int num2 = 4;

            if (num2 == 0) {
                System.out.println("Invalid Number");
            }
            int count = 0;
            while (num1 >= num2) {
                num1 -= num2;
                count++;
            }
            System.out.println(count + " and remainder is " + num1);
        }
    }
