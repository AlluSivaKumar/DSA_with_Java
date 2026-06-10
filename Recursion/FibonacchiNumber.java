package Recursion;

public class FibonacchiNumber {
    public static void main(String[] args) 
    {
        //fibo(5);
        System.out.println(fibo(5));
        
        
    }
    static int fibo(int n)
    {
        //base condition
        if(n<=1)
        {
            return n;
        }
        
        //recursive call and body of function
        return fibo(n-1)+fibo(n-2);
    }
}
