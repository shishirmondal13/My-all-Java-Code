import java.util.Scanner;

public class CWH_05_takingInout {
    public static void main(String[] args)
    {
        System.out.println("Taking Input From the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1:");
        int a = sc.nextInt();
        System.out.println("enter the number2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum is:");
        System.out.println(sum);

    }
}
