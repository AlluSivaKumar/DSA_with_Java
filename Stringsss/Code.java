package Stringsss;

public class Code {
    public static void main(String[] args) {

        //string is a collection of characters.
        //String is a class
        //every string you create is an object of string class.

        //String name = "Siva Kumar Allu";

        String a  = "Kunal";
        String b = "Kunal";
        String c = new String("Kunal");//This is known as explictly mentioned

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        System.out.println(a == b);//check the adress or id
        System.out.println(a == c); //== checks the id or address of any variable and it value
        System.out.println(a.equals(c)); //.equals() auctually checks the value instaead of address 
    }
}