package T3_FunctionsAndMethods;

public class T6_Method_Overloading 
{
    public static void main(String[] args) 
    {
        T6_Method_Overloading obj = new T6_Method_Overloading();
        System.out.println(obj.add(23,50));
        System.out.println(obj.add(23,50 , 60));

    }

    //Without using static
    public int add(int a , int b)
    {
        return a + b;
    }

    public int add(int a , int b , int c)
    {
        return  a + b + c;
    }
}
