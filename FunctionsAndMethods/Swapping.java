package FunctionsAndMethods;

public class Swapping 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;

        swap(a,b);

    }

    static void swap(int num1, int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("a :" + num1);
        System.out.println("b :" + num2);

    }
    
}