package Exception_Handling;

public class ExceptionDemo4 {
    public static void main(String[]args) {
        try {
            int[] A = new int[4];
            A[4] = 10;
            System.out.println("Result is:" + A);
        } catch (Exception E1)
        {
            System.out.println("Result is:"+E1);
        }

        System.out.println("I love my Country");
    }
}
