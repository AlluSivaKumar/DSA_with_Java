package OOP6.Generics.Comparision;
 
public class Student implements Comparable<Student>//which to compare
{
    int rollno;
    float marks;


    public Student(int rollno , float marks ) 
    {
        this.rollno = rollno;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) 
    {
        int diff = (int) (this.marks-o.marks);
        //if diff = 0 , equal amrks
        //if diff > 0 , kunal have high marks
        //if diff < 0 , rahul have high marks
        return diff;
    }

}
