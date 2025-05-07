import java.util.Scanner;

public class Dowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;

        do {
            System.out.println("Enter day (or type EXIT to stop): ");
            day = sc.nextLine().toUpperCase();

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
                case "EXIT":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Day not recognized");
            }

        } while (!day.equals("EXIT"));

        sc.close();
    }
}
