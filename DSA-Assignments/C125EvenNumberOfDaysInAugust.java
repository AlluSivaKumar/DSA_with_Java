
import java.util.Scanner;

public class C125EvenNumberOfDaysInAugust 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        System.out.print("Enter 1 for January\nEnter 2 for february\nEnter 3 march\nEnter 4 for april\nEnter 5 for may\nEnter 6 for june\nEnter 7 for July\nEnter 8 for August\nEnter 9 for September\nEnter 10 for October\nEnter 11 for November\nEnter 12 for December\n :");
        int month = sc.nextInt();
        System.out.println("Days in "+ year + " and in month " + month + " is " +days(year, month));

        System.out.print("please when you start day1 or day 2 :");
        int Startday = sc.nextInt();

        int evenDaysnum;
        boolean evenDays = days(year, month)%2 ==0;
        if(evenDays)
        {
            evenDaysnum = days(year, month)/2;
        }
        else
        {
            if(Startday == 1)
            {
                evenDaysnum = days(year, month)/2 + 1;
            }
            else
            {
                evenDaysnum = days(year, month)/2;
            }
        }

        System.out.println("evenDays in "+ year + " and in month " + month + " is " + evenDaysnum);
        
    }



    static int days(int year,int month)
    {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return  31;
            }
            case 4, 6, 9, 11 -> {
                return  30;
            }
            default -> {
                if(leapYear(year))
                {
                    return  29;
                }
                else
                {
                    return  28;
                }
            }
        }
    }


    static boolean leapYear(int year)
    {
        if(year % 4 == 0) {
            if(year % 100 == 0) 
            {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
