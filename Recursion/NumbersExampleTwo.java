package Recursion;

public class NumbersExampleTwo {
    public static void main(String[] args) {
        num(5);
    }

    static void num(int n) {
        if(n == 0)
        {
            return;
        }
        num(n-1);
        System.out.print(n+" ");
    }
}
