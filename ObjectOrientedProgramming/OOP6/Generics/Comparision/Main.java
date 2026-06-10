package OOP6.Generics.Comparision;

public class Main 
{
    public static void main(String[] args) 
    {
        Student kunal = new Student(12 , 87.96f );
        Student rahul = new Student(5 , 99.52f );

        if(kunal.compareTo(rahul) < 0)
        {
            System.out.println("Rahul has more marks");
        }
    }
}  
