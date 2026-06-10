package OOP6.ExceptionHandling;

public class ExceptionByThrow 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 0;
        try 
        {
            divide(a, b);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    static int divide(int a,int b) throws ArithmeticException
    {
        if(b == 0)
        {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}


