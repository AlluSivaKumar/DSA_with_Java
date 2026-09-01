package Stacks_And_Queues;

public class CustomQueue 
{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    CustomQueue()
    {
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size)
    {
        data = new int[size];
    }


    public boolean insert(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Queue is Full");
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        int item = data[0];

        //SHIFTING THE ELEEMENTS HERE TO LEFT FROM INDEX 1
        for(int i=1;i<data.length;i++)
        {
            data[i-1] = data[i];
        }
        end--;


        return item;
    }

    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }

        for(int i=0;i<end;i++)
        {
            System.out.print(data[i] + " <-> ");
        }
        System.out.print("End");
    }

    public boolean isFull()
    {
        return end == data.length;
    }

    public boolean isEmpty()
    {
        return end == 0;
    }

    public static void main(String[] args) throws Exception 
    {
        CustomQueue queue = new CustomQueue();
        queue.insert(56);
        queue.insert(45);
        queue.insert(5786);

        queue.display();
    }
}
