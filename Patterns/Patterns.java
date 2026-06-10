package Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        pattern31(n);
    }



    
/* 
    4 4 4 4 4 4 4 
    4 3 3 3 3 3 4 
    4 3 2 2 2 3 4 
    4 3 2 1 2 3 4 
    4 3 2 2 2 3 4 
    4 3 3 3 3 3 4 
    4 4 4 4 4 4 4 
 */
    static void pattern31(int n) 
    {
        int OriginalN = n;
        n = 2*n-2;
        for(int row = 0 ; row <= n ; row++)
        {
            for(int col = 0 ; col <= n ; col++)
            {
                int atEveryIndex =OriginalN-Math.min(Math.min(row, col),Math.min(n-col,n-row));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

/* 
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
    4 3 2 1 2 3 4 
      3 2 1 2 3 
        2 1 2 
          1   

 */
    static void pattern17(int n) 
    {
        for(int row = 1 ; row <= 2*n-1; row++)
        {
            int noOfcolumns = row > n ? 2*n-row : row ;

            for(int space = 0 ; space <= n-noOfcolumns ;space++)
            {
                System.out.print("  ");
            }


            for(int col = noOfcolumns ; col >= 1 ; col--)
            {
                System.out.print(col+" ");
            }
            for(int col = 2; col <= noOfcolumns; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }



/* 
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5
 */
    static void pattern30(int n)
    {
        for(int row = 1; row<=n; row++)
        {
            int whiteSpaces = n - row;
            for(int space=1; space<= whiteSpaces;space++)
            {
                System.out.print("  ");
            }
            for(int col = row; col >= 1;col--) 
            {
                System.out.print(col+" ");
            }
            for(int col = 2 ; col <= row ; col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


/* 
        * 
       * * 
      * * * 
     * * * * 
    * * * * * 
     * * * * 
      * * * 
       * * 
        * 
 */
    static void pattern28(int n)
    {
        for(int row = 1; row <= 2*n-1 ; row++)
        {
            int noOfcolumns = row > n ? 2*n-row: row ;
            int noOfSpaces = n-noOfcolumns;

            for(int space = 1; space <= noOfSpaces;space++)
            {
                System.out.print(" ");
            }

            for(int col = 1 ; col <= noOfcolumns ; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }        
    }


    /* 
    * 
    * * 
    * * * 
    * * * * 
    * * * * * 
    * * * * 
    * * * 
    * * 
    *  
    */
    static void pattern5(int n)
    {
        //total rows = 2*n-1 
        for(int i=1 ; i<=2*n-1 ; i++)
        {
            //if value of i exceeds row number then no of cols = 2*n-1
            int col = i>n?2*n-i:i;
            
            for(int j=1;j<=col;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }



    /* 
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5  
    */
    static void pattern4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }





    /*  
        * * * * * 
        * * * *
        * * *
        * *
        *
    */
    static void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //each row decrease the 1 colum in each row 
            //Instead of using loic find the fourmla j = n+1-i
            for(int j=n;j>=i;j--)
            //for(int j=1;j<=n-i+1;j++)//if i=0;cond = n-r;
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    /*  
        * 
        * *
        * * *
        * * * *
        * * * * *   
    */
    static void pattern2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)//each row having, row number of colums
            {
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }



    /*  
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * *     
    */
    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)//each row having, tolal rows no of columns.
            {
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            System.out.println();
        }
    }

}
