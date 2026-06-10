package Stacks_And_Queues;

public class CircularQueue 
{
    protected int[] data;
    private static int DEFAULT_SIZE = 10;

    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size)
    {
        data = new int[size];
    }

    protected int end = 0;
    protected int start = 0;

    public int size = 0;

    public boolean isFull()
    {
        return size == data.length;
    }

    public boolean isEmpty()
    {
        return size == 0; 
    }


    public boolean insert(int item)
    {
        if(isFull())
        {
            return false; 
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }

        int removed = data[start++];
        start = start % data.length;
        size--;
        return removed;
    }

}