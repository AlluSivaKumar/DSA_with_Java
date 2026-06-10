package Stacks_And_Queues;

//CLASS TO IMPLEMENT STACK USING ARRAY WITH FIXED SIZE
public class CustomStack 
{
    protected int[] data;//ARRAY TO STORE STACK ELEMENTS
    private static int DEFAULT_SIZE = 10;//DEFAULT SIZE OF THE STACK
    
    //CONSTRUCTORS
    CustomStack()
    {
        this(DEFAULT_SIZE);
    }

    //CONSTRUCTOR WITH SIZE
    CustomStack(int size)
    {
        this.data = new int[size];
    }

    int ptr = -1;

    //ADDS AN ITEM TO THE TOP OF THE STACK
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr]= item;
        return true;
    }

    //REMOVE AND RETURN THE TOP ELEMENT OF THE STACK
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("cannot pop from an Empty stack");
        }
        return data[ptr--];
    }

    //RETURN THE TOP ELEMENT OF THE STACK
    public int peek() throws Exception
    {
        if(isEmpty()) 
        {
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

    //CHECK IF STACK IS FULL
    public boolean isFull()
    {
        return ptr == data.length-1;
    }


    //CHECK IF STACK IS EMPTY
    public boolean isEmpty()
    {
        return ptr == -1;
    }


    public static void main(String[] args) throws Exception 
    {
        CustomStack stack = new CustomStack(5);
        stack.push(78);
        stack.push(45);
        stack.push(47);
        stack.push(42);
        stack.push(05);
        stack.push(44);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
