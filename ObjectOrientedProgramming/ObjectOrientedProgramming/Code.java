package ObjectOrientedProgramming;

public class Code 
{
    public static void main(String[] args) 
    {
        //to store 5 roll numbers
        @SuppressWarnings("unused")
        int[] rno = new int[5];

        //to store 5 names
        @SuppressWarnings("unused")
        String[] names = new String[5];

        //Create a datatype that contain name roll no marks
        /* String[] Stdnames = new String[5];
        int[] Stdrno = new int[5];
        float[] StdMarks = new float[5]; */

        //instead of this create a new class and that contain group of information
        //Student[] students = new Student[5];
        /* System.out.println(Arrays.toString(students)); *///[null, null, null, null, null]

        Student name1 = new Student();

        Student siva = new Student(142,"Siva Kumar Allu",98.4f);
        System.out.println(siva.Rno);
        System.out.println(siva.Name);
        System.out.println(siva.Marks);
        

        name1.changeName("Harsha");

        //name1.Greeting();


        name1.Rno = 142;
        name1.Name = "Siva Kumar Allu";
        name1.Marks = 9.12f;



        System.out.println(name1.Rno);
        System.out.println(name1.Name);
        System.out.println(name1.Marks);

    }

    //creating a claas name Student
    static class Student
    {
        int Rno;
        String Name;
        float Marks = 9.0f;//if you give values here it will mark as default..


        //we need a way to add the values of the above proprties object by object.
        //we need one word to acess every object.

        void changeName(String Newname)
        {
            Name = Newname;
        }

        @SuppressWarnings("unused")
        void Greeting()
        {
            System.out.println("Hello My name is " + this.Name);
        }

        Student() //This is a constructor ,return type is class itself.
        {
            this.Rno = 141;
            this.Name = "Siva Allu";
            this.Marks = 9.12f;
        }

        public Student(int Rno, String Name,float Marks) {
            this.Rno = Rno;
            this.Name = Name;
            this.Marks = Marks;
        }

        

    }
}
