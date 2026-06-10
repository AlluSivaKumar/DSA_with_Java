package OOP7;

public class EnumExample 
{
    enum Day 
    {
        Monday,Tuesday,Wednsday,Thursday,Friday,Saturday;

        Day() 
        {
            System.out.println("this is " + this);
        }
    }


    public static void main(String[] args) 
    {
        Day week = Day.Monday;
        System.out.println(week);

        for(Day roju : Day.values())
        {
            System.out.println(roju);
        }
    }
}
