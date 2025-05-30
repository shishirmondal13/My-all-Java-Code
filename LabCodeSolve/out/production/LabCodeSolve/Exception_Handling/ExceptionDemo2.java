package Exception_Handling;

public class ExceptionDemo2 {
    public static void main(String[]args) {
        try {
            int a = 20;
            int b = 0;
            int result = a/b;
            System.out.println("Result is:" + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception:" + e);
        }
        finally {
            System.out.println("I love Error");
        }
    }

}
