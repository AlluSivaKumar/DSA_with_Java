package OOP6.ExceptionHandling;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
            int c = a / b;
        }
        catch(Exception e) {
            //System.out.println(e);//java.lang.ArithmeticException: / by zero
            System.out.println(e.getMessage());// / by zero
        }
        finally {
            System.out.println("This will always execute.");
        }
    }
}
