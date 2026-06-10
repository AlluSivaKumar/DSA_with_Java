package OOP6.Cloning;

public class CloneExample 
{
    int rollno;
    String name;
    int[] arr;

    public CloneExample(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.arr = new int[rollno];
    }

    public CloneExample(CloneExample old)
    {
        this.rollno = old.rollno;
        this.name = old.name;
        this.arr = new int[rollno];
    }

    //Shallow Copying
    /* public Object clone() throws CloneNotSupportedException
    {
        return super.clone();   
    } */

    //Deep Copying
    public Object clone() throws CloneNotSupportedException
    {
        CloneExample twin = (CloneExample)super.clone();   

        twin.arr =  new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++)
        {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    } 
}
