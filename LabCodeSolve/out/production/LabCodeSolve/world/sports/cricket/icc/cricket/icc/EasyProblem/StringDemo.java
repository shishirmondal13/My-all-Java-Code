package EasyProblem;




public class StringDemo {

    public static void main(String[]args)
    {
        String s1 = "Shishir";
        String s2 =" Mondal";
        String Fullname = s1.concat(s2);
        System.out.println("Full String is:"+Fullname);
        String UpparName = Fullname.toUpperCase();
        System.out.println("Uppar name is :"+UpparName);
        String LowerName = Fullname.toLowerCase();
        System.out.println("Lower case is:"+LowerName);
        boolean b = s1.startsWith("Shi");
        System.out.println("b="+b);
       boolean c = s1.endsWith("ir");
        System.out.println("c:"+c);

        String country = "    Bangladesh is my country    ";
        System.out.println(country);
        String s3 = country.trim();
        System.out.println(s3);
        int value = country.codePointAt(0);
        System.out.println("value:"+value);
        int pos = country.indexOf("n");
        System.out.println("position:"+pos);
        pos = country.lastIndexOf("n");
        System.out.println("Posi:"+pos);



    }
}
