package FunctionsAndMethods;

public class Main 
{
    public static void main(String[] args) 
    {
        Main obj1 = new Main();
        System.out.println(obj1.add(2, 4));
    }

    //Without using static
    public int add(int a , int b)
    {
        return a + b;
    }
}
