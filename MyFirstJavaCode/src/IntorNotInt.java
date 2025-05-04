import java.util.Scanner;

public class IntorNotInt {
    public static void main(String[]args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
