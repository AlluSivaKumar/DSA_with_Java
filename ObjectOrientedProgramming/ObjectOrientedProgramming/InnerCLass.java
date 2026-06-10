package ObjectOrientedProgramming;

public class InnerCLass 
{
    static class Test 
    {
        static String name;
        @SuppressWarnings("static-access")
        Test(String name)
        {
            this.name = name;
        }
    }

    public static void main(String[] args) 
    {

        Test a = new Test("Siva");
        Test b = new Test("Kumar");
        System.out.println(a);
        System.out.println(b);

        //System.out.println(a.name);
        //System.out.println(b.name);
    }
}