package T1_ConditionalStatements;

public class T3_IfElseStatement {
    public static void main(String[] args) {
        
        int age  = 12;

        if(age > 40)
        {
            System.out.println("Adult");
        }
        else if(age > 18 && age < 40)
        {
            System.out.println("Major");
        }
        else
        {
            System.out.println("Minor");
        }
    }

}
