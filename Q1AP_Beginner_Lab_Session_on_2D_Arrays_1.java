/*Problem Description
You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.


NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.



Problem Constraints

1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000



Input Format

First argument is a 2D matrix of integers.



Output Format

You have to return a 1D list of integers after doing required operations.



Example Input

Input 1:

A = [[1, 2],[4, 5],[8, 9]]


Example Output

Output 1:

[3, 9, 17, 13, 16]


Example Explanation

Explanation 1:

Row 1 elements sum = 1 + 2 = 3.
Row 2 elements sum = 4 + 5 = 9.
Row 3 elements sum = 8 + 9 = 17.
Column 1 elements sum = 1 + 4 + 8 = 13.
Column 2 elements sum = 2 + 5 + 9 = 16.
 */
public class Q1AP_Beginner_Lab_Session_on_2D_Arrays_1
{
    public int[] solve(int[][] A) 
    {
        int N=A.length;
        int M=A[0].length;
        int size=N+M;
        int[] res=new int[size];
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=0;
            for(int j=0;j<M;j++)
            {
               sum=sum+A[i][j];
            }
            res[i]=sum;
        }

        for(int j=0;j<M;j++)
        {
            sum=0;
            for(int i=0;i<N;i++)
            {
               sum=sum+A[i][j];
            }
            res[N+j]=sum;
        }

        return res;

    }
}
