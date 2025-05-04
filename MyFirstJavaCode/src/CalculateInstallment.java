import java.util.Scanner;

public class CalculateInstallment {

    public static void main(String[]args)
    {
        int phonePrice = 1800;
        int numberOfInstallment,installmentPerMonth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  per month Installment:");
        installmentPerMonth = sc.nextInt();
        numberOfInstallment = 1800/installmentPerMonth;
        System.out.println("Amount  is:"+numberOfInstallment+"Euro");






    }
}
