/*Problem Description

Given a 2D Array A[][], return max element from this matrix.


Problem Constraints

0 < total row, total col <= 1000
-100000 <= A[i][j] <= 100000


Input Format

Single Argument A which is a 2D array.


Output Format

Return maximum element from matrix.


Example Input

Input 1 :
A = [ [12, 65, 89, 74], 
      [22, 44, 12, 30],
      [10, 12, 97, 19] ]
Input 2 :
A = [ [12, 16, 19],
      [21, 23, 59] ]


Example Output

Output 1:
97
Output 2:
59


Example Explanation

Explanation 1:
Max element of matrix is 97.
Explanation 2:
Max element of matrix is 59.
 */
public class Q3_Beginner_Lab_Session_on_2D_Arrays_1 {
    public int solve(int[][] A) {
        int max=A[0][0];
        int N=A.length;
        int M=A[0].length;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(A[i][j]>max)
                    max=A[i][j];
            }
        }

        return max;
    }
}
