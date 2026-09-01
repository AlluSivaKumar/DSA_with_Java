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

        //SINCE WE ARE USING CIRCULAR QUEUE WE DONT NEED TO SHIFT THE ELEEMNTS

        int removed = data[start++];

        start = start % data.length;

        size--;

        return removed;
    }

    public int front() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        return data[start];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        int i = start;
        do {
            System.out.print(data[i] + " -> " );
            i++;
            i = i % data.length;
        }while(i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);

        queue.insert(56);
        queue.insert(57);
        queue.insert(26);
        queue.insert(76);
        queue.insert(06);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();
        
    }
}