package day29_CustomMethods;

public class Eligibility {
    /*
    task: Eligibility to vote: age, citizen,name
    task: Eligibility to buy alcohol
     */
    public static void eligibleToBuyAlcohol(boolean hasID, int age) {
        if (hasID && age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible");
        }
    }

    public static void main(String[] arg) {
        vote("John", 28, true, "Biden");
        vote("Daniel", 17, true, "Kanye");
        eligibleToBuyAlcohol(true, 19);
        calculator(100, '/', 20);
    }

    public static void vote(String name, int age, boolean citizen, String presidentName) {
        boolean eligibleToVote = citizen == true && age >= 18;
        if (eligibleToVote) {
            System.out.println(name + " is eligible to vote for " + presidentName);
        } else {
            System.out.println(name + " is not eligible to vote");
        }


    }

    public static void calculator(double num1, char operator, double num2) {
        //+,-,*,?,%
        switch (operator) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Substraction: " + (num1 + num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;

            case '%':
                System.out.println("Remainder " + num1 % num2);

            default:
                System.out.println("Invalid");

        }
        }
        }

