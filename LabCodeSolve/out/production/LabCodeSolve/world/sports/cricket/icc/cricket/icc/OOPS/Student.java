package OOPS;

public class Student {

    int studentId;
    String studentName;
    String studentCity;

    public void study()
    {
        System.out.println(studentName+" is studying");


    }
    public void showFullDetails()
    {
        System.out.println("My name is:"+studentName);
        System.out.println("My Id is :"+studentId);
        System.out.println("My City is:"+studentCity);
    }



}
