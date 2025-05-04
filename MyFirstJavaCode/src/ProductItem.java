import java.util.Scanner;

public class ProductItem {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
                int id;
           String title,Price,Description,Category;
           System.out.println("Enter id:");
           id = sc.nextInt();
           System.out.println("Enter title:");
           title = sc.nextLine();
           System.out.println("enter Price :");
           Price = sc.nextLine();
           System.out.println("enter Description: ");
           Description = sc.nextLine();
           System.out.println("Enter Category:");
           Category = sc.nextLine();
        System.out.println(" id:"+id);
        System.out.println(" title:"+title);
        System.out.println(" Price :"+Price);
        System.out.println(" Description: "+Description);
        System.out.println(" Category:"+Category);












    }
}
