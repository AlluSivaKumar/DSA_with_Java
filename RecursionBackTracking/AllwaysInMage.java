package RecursionBackTracking;

public class AllwaysInMage 
{
    public static void main(String[] args) 
    {
        mageWys("", 3, 3);
    }

    static void mageWys(String ans , int row , int  col)
    {
        if(row ==1 && col == 1)
        {
            System.out.println(ans);
            return;
        }

        if(row > 1)
        {
            mageWys(ans + "D", row-1, col);
        }
        if(col > 1)
        {
            mageWys(ans + "R", row, col-1);
        }
    }
}


/* 
("")
(3,3)
├── "D" (2,3)
│   ├── "DD" (1,3)
│   │   ├── "DDR" (1,2)
│   │   │   └── "DDRR" (1,1) ✅
│   └── "DR" (2,2)
│       ├── "DRD" (1,2)
│       │   └── "DRDR" (1,1) ✅
│       └── "DRR" (2,1)
│           └── "DRRD" (1,1) ✅
└── "R" (3,2)
    ├── "RD" (2,2)
    │   ├── "RDD" (1,2)
    │   │   └── "RDDR" (1,1) ✅
    │   └── "RDR" (2,1)
    │       └── "RDRD" (1,1) ✅
    └── "RR" (3,1)
        ├── "RRD" (2,1)
        │   └── "RRDD" (1,1) ✅

*/


/* 
package RecursionBackTracking; // Defines the package name. (Organizes related classes)

// Main class
public class AllwaysInMage 
{
    // Main method - starting point of the program
    public static void main(String[] args) 
    {
        // Start the recursive function with an empty path string and a 3x3 grid
        mageWys("", 3, 3);
    }

    // Recursive function to print all paths from top-left to bottom-right of a grid
    static void mageWys(String ans , int row , int  col)
    {
        // Base case: when you're at the destination cell (1,1)
        if(row == 1 && col == 1)
        {
            // Print the current path taken (ans) to reach the bottom-right
            System.out.println(ans);
            return;
        }

        // Recursive case: move down if row > 1
        if(row > 1)
        {
            // Add 'D' (Down) to the path and reduce row by 1
            mageWys(ans + "D", row-1, col);
        }

        // Recursive case: move right if col > 1
        if(col > 1)
        {
            // Add 'R' (Right) to the path and reduce column by 1
            mageWys(ans + "R", row, col-1);
        }
    }
}
*/
