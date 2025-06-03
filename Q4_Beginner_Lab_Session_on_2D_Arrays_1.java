/*Problem Description

Given a 2D Array A[][], Return sum of every column in an array.


Problem Constraints

0 < total row, total col <= 1000
-100000 <= A[i][j] <= 100000


Input Format

Single Argument A which is 2D Array.


Output Format

Return an array having sum of columns.


Example Input

Input 1 :
A = [[12, 65, 89, 74],
     [22, 44, 12, 30],
     [10, 12, 97, 19]]
Input 2 :
A = [[12, 16, 19],
     [21, 23, 59]]


Example Output

Output 1 :
[44, 121, 198, 123]
Output 2 :
[33, 39, 78]


Example Explanation

Explanation 1 :
In given matrix :
column 0 is : [12, 22, 10] so sum is 44
column 1 is : [65, 44, 12] so sum is 121
column 2 is : [89, 12, 97] so sum is 198
column 3 is : [74, 30, 19] so sum is 123
Explanation 2 :
In given matrix :
column 0 is : [12, 21] so sum is 33
column 1 is : [16, 23] so sum is 39
column 2 is : [19, 59] so sum is 78 */
public class Q4_Beginner_Lab_Session_on_2D_Arrays_1 {
    public int[] solve(int[][] A) {
        
        int N=A.length;
        int M=A[0].length;
        int[] col_sum=new int[M];
        int sum=0;
        for(int j=0;j<M;j++)
        {
            sum=0;
            for(int i=0;i<N;i++)
            {
                sum=sum+A[i][j];
            }
            col_sum[j]=sum;
        }

        return col_sum;
    }
}
