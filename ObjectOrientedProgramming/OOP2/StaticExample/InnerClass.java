package OOP2.StaticExample;

//outside classess cannot be static
public class InnerClass 
{
    //inner classess can be static
    static class Test
    {
        String name;

        public Test(String name)
        {
            this.name = name;
        }
    }

    public static void main(String[] args) 
    {
        Test a = new Test("kunal");  //IF INNER CLASS IS NOT STAIC IT WILL SHOW ERROR
        Test b = new Test("rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
