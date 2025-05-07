import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter day: ");
                String day = sc.nextLine();

        switch (day) {
            case "MON":
                System.out.println("It is Monday");
                break;
            case "TUES":
                System.out.println("It is Tuesday");
                break;
            case "WED":
                System.out.println("It is Wednesday");
                break;
            case "THURS":
                System.out.println("It is Thursday");
                break;
            case "FRI":
                System.out.println("It is Friday");
                break;
            case "SAT":
                System.out.println("It is Saturday");
                break;
            case "SUN":
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Day not recognized");
        }
    }
}
