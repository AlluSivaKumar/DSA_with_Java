package Exception_Handling;

public class Important_Methods 
{
    public static void main(String[] args) 
    {
        try
        {
            int a = 10 / 0;
        }
        catch(Exception e)
        {
            e.printStackTrace();    
        }
    }
}
