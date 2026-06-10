package ObjectOrientedProgramming;

public class WrapperClass 
{
    public static void main(String[] args) 
    {
        //int a = 10;

        //Integer num = new Integer(45);

        Integer num2 = 55;//it contain many methods because num of object type.
        System.out.println(num2);
        System.out.println(num2.byteValue());

        //Swap function is not working here also  bcz Integer if Final Keyword

        //you always intialize final while declaraing it
        @SuppressWarnings("unused")
        final int a = 10;
        //a = 7; will give error.
    }
}
