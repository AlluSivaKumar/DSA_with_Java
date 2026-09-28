package OOP2.StaticBlock;

public class StaticBlockExample {
    static int a = 4;
    static int b;

    //STATIC BLOCK
    static 
    {
        System.out.println("I'm in static block");
        b = a * 5;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        StaticBlockExample obj = new StaticBlockExample();
        System.out.println(obj.a + " " + obj.b);

        a += 5;
        b += 3;

        StaticBlockExample obj2 = new StaticBlockExample();
        System.out.println(obj2.a + " " + obj2.b);  //HERE VALUE OF A CHANGED BUT B IS NOT CHANGED TO NORMAL BECAUSE STATIC BLOCK RUN ONLY ONCE
    }
}
