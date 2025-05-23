package OOPS;

public class Demo {
    public static void main(String[]args) {
        Student st1;
        st1 = new Student();
        st1.studentName = "shishir";
        st1.studentId = 52;
        st1.studentCity = "Dhaka";
        st1.study();
        st1.showFullDetails();


        Student st2;
        st2 = new Student();
        st2.studentName = "Rahim";
        st2.studentId = 22;
        st2.studentCity = "khulna";
        st2.study();
        st2.showFullDetails();
    }

}
