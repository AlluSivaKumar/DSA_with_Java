package LinearSearching;

public class EvenDigits {
    public static void main(String[] args) 
    {
        int arr[] = {39,4,55,3667,43,433224};
        int res = solution(arr);
        System.out.println(res);
    }

    static int solution(int arr[])
    {
        int count = 0;

        for(int num : arr)
        {
            if(even(num))
            {
                count ++;
            }
        }

        return count;
    }

    static boolean even(int num)
    {
       /*  int count = 0;
        
        while(num>0)
        {
            count++;
            num = num /10;
        }
        if(count % 2 ==0)
        {
            return true;
        }
        return false; */



        if (num == 0) return false; // special case
        int digits = (int)(Math.log10(num)) + 1;
        return digits % 2 == 0;
    }
}
