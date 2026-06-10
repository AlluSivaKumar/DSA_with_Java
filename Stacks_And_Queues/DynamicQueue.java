package Stacks_And_Queues;

public class DynamicQueue extends CustomQueue
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
    public boolean insert(int item) throws Exception
    {
        if(this.isFull())
        {
            int[] temp = new int[data.length * 2];
        
            //Copy array elements
            for(int i=0;i<data.length;i++)
            {
                temp[i] = data[i];
            }

            data = temp;
        }
        return super.insert(item);

    }

    public static void main(String[] args) {
        
    }
}
