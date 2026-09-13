package StringBuffer;

public class Main {
    public static void main(String[] args) {

        //Constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("Siva");
        sb.append(" Kumar");
        sb.insert(0, "Allu ");
        sb.replace(5 , 9 , "Bargav");
        sb.delete(5,12);
        //String str = sb.toString();
        //System.out.println(str);

        //Constructor 2
        StringBuffer sb2 = new StringBuffer("Siva Kumar");
        System.out.println(sb2.capacity());

        //Constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        
    }
}
