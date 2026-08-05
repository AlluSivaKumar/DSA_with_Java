package Exception_Handling;

public class Main 
{
    public static class idDrink extends Exception
    {
        int age = 15;
        
        public void drink() throws Exception
        {
            if(age >= 18)
            {
                System.out.println("Drink");
            }
            else
            {
                throw new Exception("You are Minor");
            }
        }
    }

    public static void main(String[] args)
    {
        idDrink siva =  new idDrink();
        try
        {
            siva.drink();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        /* int[] arr ={1,2,3};
        int a = 0;
        try
        {
            System.out.println(arr[4]);
            System.out.println(5/a);
        }

        //Catches the Exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }  

        //MULTIPLE cATCH
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        //This block will always Executes
        finally
        {
            System.out.println("END");
        }       */

    }
}


