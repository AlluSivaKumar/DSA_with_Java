package OOP4;

public class Code 
{
    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(0);
        System.out.println(obj.hashCode());

        System.out.println(obj instanceof ObjectDemo);
    }
}
