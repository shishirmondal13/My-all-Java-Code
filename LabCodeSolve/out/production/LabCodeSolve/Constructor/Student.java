package Constructor;


public class Student {

    String Name,Gender,City;
    int Age;

    Student(String Na,String Ge,String Ci,int Ag)
    {
        Name = Na;
        Gender = Ge;
        City = Ci;
        Age = Ag;
    }
    void DisplayFullData()
    {
        System.out.println("Name is:"+Name);
        System.out.println("Gender is:"+Gender);
        System.out.println("City is: "+City);
        System.out.println("Age is:"+Age);

    }
}
