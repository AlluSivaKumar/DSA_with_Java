package FileHandlingInJava;

import java.io.*;

public class Main 
{
    public static void main(String[] args) 
    {





        //INPUT STREAM READER
        /* try(InputStreamReader isr = new InputStreamReader(System.in)) //Here System.in takes data in bytes
        {
            System.out.print("Enter some letters : ");
            int letters = isr.read();

            while (isr.ready())
            {
                System.out.println((char) letters);
                letters = isr.read();
            }

            //OPTIONAL 
            isr.close();

            System.out.println();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        } */




        


        /* try(FileReader fr = new FileReader("FileHandlingInJava/file.txt"))
        {
            //int letters = fr.read();
            int letters;

            // while(fr.ready()) 
            // {
            //     System.out.println((char) letters);
            //     letters = fr.read();
            // } 
           while ((letters = fr.read()) != -1) 
           {
                System.out.println((char) letters);
           }
            System.out.println();
        }
        catch(IOException e)
        {
            System.out.print(e.getMessage());
        } */
        
    }
}