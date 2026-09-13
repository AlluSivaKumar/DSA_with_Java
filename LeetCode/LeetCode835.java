package LeetCode;

public class LeetCode835 
{
    public static int largestOverlap(int[][] img1, int[][] img2) 
    {
        int maxCountaxCount = 0;
        
        int count = 0;
        //Just Compare
        for(int i=0;i<img1.length;i++)
        {
            for(int j=0;j<img2.length;j++)
            {
                if(img1[i][j] == 1 && img2[i][j] == 1)
                {
                    count++;
                    if(count > maxCountaxCount)
                    {
                        maxCountaxCount = count;
                    }
                }
            }
        }

        //SLIDING ALL 1'S LEFT SIDE 
        //SLIDING ALL 1'S RIGHT SIDE 
        //SLIDING ALL 1'S UP SIDE 
        //SLIDING ALL 1'S DOWN SIDE 


        return maxCountaxCount;
    }
    
    public static void main(String[] args) 
    {
        int[][] img1 = {{1,1,0},{0,1,0},{0,1,0}};
        int[][] img2 = {{0,0,0},{0,1,1},{0,0,1}};

        System.out.println(largestOverlap(img1, img2));
    }
} 
