package OOP4.AccessModifiers;

public class Main 
{
    public static void main(String[] args) 
    {
        A obj = new A(10, "siva");

        //NEED TO DO SOME THINGS
        //1.ACCESS THE DATA MEMBERS
        //2.MODIFY THE DATA MEMBERS

        obj.setNum(67);
        System.out.println(obj.getNum());
        System.out.println(obj.name);
    }
}
