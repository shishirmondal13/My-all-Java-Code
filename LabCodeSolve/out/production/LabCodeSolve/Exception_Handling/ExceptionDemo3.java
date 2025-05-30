package Exception_Handling;

public class ExceptionDemo3 {
    public static void main(String[]args) {
        try {
            int[] A = new int[4];
            A[4] = 10;
            System.out.println("Result is:" + A);
        } catch (ArrayIndexOutOfBoundsException E1)
        {
            System.out.println("Result is:"+E1);
        }
        catch (ArithmeticException E2)
        {
            System.out.println("Result is:"+E2);
        }
        System.out.println("I love my Country");
    }
}
