import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[]args)
    {
        System.out.println("Give user input");
        Scanner sc = new Scanner(System.in);
        System.out.println("1st sub:");
        int a = sc.nextInt();
        System.out.println("2nd sub:");
        int b = sc.nextInt();
        System.out.println("3rd sub:");
        int c = sc.nextInt();
        System.out.println("4th sub:");
        int d = sc.nextInt();
        System.out.println("5th sub");
        int e = sc.nextInt();

        double sum = a + b + c + d + e ;
        double p = sum/500;
        double result = p*100;
        System.out.println("percentage is:");
        System.out.println(result);
        System.out.println("Marks in math = "+a);
        System.out.println("Marks in physics = "+b);
        System.out.println("Marks in chemistry = "+b);
        System.out.println("Marks in biology = "+c);
        System.out.println("Marks in english = "+d);

        System.out.println("Your percentage is "+result+"%");

    }

}
