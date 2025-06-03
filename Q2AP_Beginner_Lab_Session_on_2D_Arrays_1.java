/*Problem Description

Given 2D Array A[][], return min element from this matrix.


Problem Constraints

1 <= A.length <= 103
1 <= A[i].length <= 103
-103 <= A[i][j] <= 103


Input Format

First argument A is a 2D array of integers (2D matrix).


Output Format

Return the min element from the matrix.


Example Input

[7,2,3,4]
[5,6,1,8]
[9,2,3,4]


Example Output

1


Example Explanation

Min element of the entire matrix A is 1.
 */
public class Q2AP_Beginner_Lab_Session_on_2D_Arrays_1 
{
    public int solve(int[][] A) 
    {
        int min=A[0][0];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                if(A[i][j]<min)
                    min=A[i][j];
            }
        }

        return min;

    }
}
