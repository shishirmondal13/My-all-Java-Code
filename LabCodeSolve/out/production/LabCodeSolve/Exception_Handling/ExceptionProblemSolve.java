package Exception_Handling;

import java.util.Scanner;

public class ExceptionProblemSolve {
    // Please enter num1: 100
    // Please enter num2: 7
    // Result: 100/7 = 14

    // Please enter num1: 100
    // Please enter num2: hello

    // Exception: java.util.InputMismatchException
    // You must enter integer. Please try again
    // Please enter an num1:

    // Please enter num1: 100
    // Please enter num2: 0

    // Exception: java.lang.ArithmeticException: / by zero
    // You must enter integer. Please try again
    // Please enter a num1:
    public static void main(String[]args)

    {
        int count =1;
        do {
            try {
                int num1, num2;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter number 1:");
                num1 = input.nextInt();
                System.out.println("Enter number 2:");
                num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result is:" + result);

            } catch (Exception E) {
                System.out.println("Exception:" + E);
                System.out.println("You must enter integer. Please try again");
            }
        }while(count==1);


    }
}
