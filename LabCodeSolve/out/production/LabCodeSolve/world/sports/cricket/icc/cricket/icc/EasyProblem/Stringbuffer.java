package EasyProblem;

import java.util.Scanner;

public class Stringbuffer {

    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String S1= input.nextLine();
        StringBuffer S2 = new StringBuffer(S1);
        System.out.println(S2);
        S2.append("Mondal");
        S2.append(13);
        S2.append("@");
        System.out.println(S2);
        S2.setLength(3);
        System.out.println(S2);



    }
}
