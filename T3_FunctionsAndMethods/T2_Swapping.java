package T3_FunctionsAndMethods;

public class T2_Swapping 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;

        swap(a,b); // a = 20 , b = 10 This is called scoping(Where we can access variables)

        System.out.println("a :" + a); //10
        System.out.println("b :" + b); //20

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