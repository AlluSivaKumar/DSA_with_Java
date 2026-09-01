package Stacks_And_Queues;

public class Dynamic_Stack extends CustomStack
{
    public Dynamic_Stack()
    {
        //CALLING THE DEFAULT CONSTRUCTOR OF THE PARENT CLASS
        super(); //IT WILL CALL CUSTOMSTACK();
    }

    public Dynamic_Stack(int size)
    {
        //CALLING THE CONSTRUCTOR WITH SIZE OF THE PARENT CLASS
        super(size); //IT WILL CALL CUSTOMSATCK(SIZE);
    }

    //OVERRIDE THE PUSH METHOD TO MAKE THE STACK DYNAMIC
    @Override
    public boolean push(int item)
    {
        if(this.isFull())
        {
            //Double the array size;
            int temp[] = new int[data.length*2];

            //Copy all previous
            for(int i=0;i<data.length;i++)
            {
                temp[i] = data[i];
            }

            data = temp;
            
        }
        
        //Insert Item            
        super.push(item);
        return true;
    }
}
