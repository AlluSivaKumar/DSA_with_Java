package OOP3.PolyMorphism;

//COMPILR TIME POLYMORPHISM
public class Numbers 
{
    double sum(double a , int b)
    {
        return a + b;
    }

    double sum(int a , double b)
    {
        return a + b;
    }

    //@OverLoading
    int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String[] args) 
    {
        Numbers obj = new Numbers();

        System.out.println(obj.sum(2.78, 03));
    }
}
