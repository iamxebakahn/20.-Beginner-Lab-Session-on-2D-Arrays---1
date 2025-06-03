/*Problem Description

Given 2 arrays of integers A and B
Return a 2D array of integers such that i-th row of the array contains list of values in A such that A[j]%B[i]==0 in A in sequential order


Problem Constraints

1 <= |A| <= 103

1 <= |B| <= 103

1 <= A[i] <= 105

1 <= B[i] <= 105



Input Format

The two arguments A and B are array of integers.



Output Format

Return a 2D array of integers.



Example Input

Input 1:
A = [1, 2, 3, 4]
B = [1, 2]
Input 2:
A = [2, 5, 9, 3, 8]
B = [3, 2]


Example Output

Output 1:
[ [1, 2, 3, 4 ], [ 2, 4] ]
Output 2:
[ [9, 3 ], [ 2, 8] ]


Example Explanation

For Input 1:
The elements that are multiples of 1 are [1, 2, 3, 4] and elements
that are multiples of 2 are [2, 4].
For Input 2:
The elements that are multiples of 3 are [9, 3] and elements
that are multiples of 2 are [2, 8]. */
public class Q1_Beginner_Lab_Session_on_2D_Arrays_1 {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        for(int i=0;i<B.size();i++)
        {
            int divisor=B.get(i);
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<A.size();j++)
            {
                if(A.get(j)%divisor==0)
                {
                    row.add(A.get(j));
                }
            }

            res.add(row);
        }

        return res;
    }
}


import java.util.ArrayList;

