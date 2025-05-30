package Exception_Handling;

public class ExceptionDemo {

    public static void main(String[]args)
    {
        try
        {
            int a=10;
            int b=0;
            int result = a/b;
            System.out.println("Result is:"+result);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception:"+e);

        }

        System.out.println("I love Math");
    }
}
