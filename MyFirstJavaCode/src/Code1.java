import java.util.Scanner;

public class Code1 {
    public static void main(String[]args)
    {
        System.out.println("Taking input:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number1:");
        int a = sc.nextInt();
        System.out.println("Number2:");
        int b = sc.nextInt();
        System.out.println("number3");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Total sum is:");
        System.out.println(sum);


    }
}
