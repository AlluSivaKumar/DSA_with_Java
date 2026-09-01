package Stacks_And_Queues;

public class DynamicQueue extends CircularQueue
{
    public DynamicQueue()
    {
        super();
    }

    public DynamicQueue(int size)
    {
        super(size);
    }

    @Override
    public boolean insert(int item)
    {
        if(this.isFull())
        {
            int[] temp = new int[data.length * 2];
        
            //Copy array elements
            for(int i=0;i<data.length;i++)
            {
                temp[i] = data[(start + i) % data.length];
            }

            start = 0;
            end = data.length;
            
            data = temp;
        }
        return super.insert(item);
    }

    public static void main(String[] args) throws Exception {
            DynamicQueue queue = new DynamicQueue();

            queue.insert(78);
            queue.insert(18);
            queue.insert(78);
            queue.insert(88);
            queue.insert(56);
            queue.insert(12);
            queue.insert(784);
            queue.insert(23);

            queue.display();
    }
}
