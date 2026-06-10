package OOP6.Generics.Comparision;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
             arr.add(i);
        }
        arr.forEach((item) -> System.out.println(item*2));

        @SuppressWarnings("unused")
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        //arr.forEach(fun);
        @SuppressWarnings("unused")
        Operation sum = (a,b) -> a+b;  
    }

    

    int sum (int a, int b)
    {
        return a+b;
    }
}

interface Operation {
    int peration(int a,int b);
}
