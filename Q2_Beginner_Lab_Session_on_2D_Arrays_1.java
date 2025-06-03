/*Problem Description

You are given a 2D Dynamic Array A, return a 2D integer Dynamic Array containing row-wise unique elements of A.

Note:
A unique element is an element whose frequency is 1.
In JAVA: Dynamic Array is ArrayList.
In C++: Dynamic Array is vector.
In Python: Dynamic Array is List.





Problem Constraints

1 <= A.size() <= 102
1 <= A.get(i).size() <= 102
1 <= A.get(i).get(j) <= 103


Input Format

First argument A is a 2D Dynamic Array of integers.


Output Format

Return 2D Dynamic Array containing row-wise unique elements of A.


Example Input

Input 1:
A =[ [1, 2, 3, 4, 1],
     [5, 8, 7, 8, 8],
     [9, 4, 3, 2, 4] ]
Input 2:
A = [ [3, 2],
      [2, 4] ]


Example Output

Output 1:
[ [2, 3, 4],
  [5, 7],
  [9, 3, 2] ]
Output 2:
[ [3, 2],
  [2, 4] ]


Example Explanation

Explanation 1:
1st row unique elements -> 2 3 4
2nd row unique elements -> 5 7
3rd row unique elements -> 9 3 2
Explanation 2:
1st row unique elements -> 3 2
2nd row unique elements -> 2 4 */
public class Q2_Beginner_Lab_Session_on_2D_Arrays_1 {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        for (int r = 0; r < A.size(); r++) 
        {
            ArrayList<Integer> row = A.get(r);
            ArrayList<Integer> uniqueRow = new ArrayList<>();

            for (int i = 0; i < row.size(); i++) 
            {
                int count = 0;

                for (int j = 0; j < row.size(); j++) 
                {
                    if (row.get(i).equals(row.get(j))) 
                    {
                        count++;
                    }
                }

                if (count == 1) 
                {
                    uniqueRow.add(row.get(i));
                    }
            }

            result.add(uniqueRow);
        }

        return result;
    }
}

/* public class Solution 
{
    ArrayList<Integer> unique(ArrayList<Integer> al)
    {
        ArrayList<Integer> final_unique_al=new ArrayList<>();
        for(int i=0;i<al.size();i++)
        {
            int count=0;
            for(int j=0;j<al.size();j++)
            {
                if(al.get(i)==al.get(j))
                    count++;
            }

            if(count==1)
                final_unique_al.add(al.get(i));
        }

        return final_unique_al;

    }


public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A)
{
    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    for(int i=0;i<A.size();i++)
    {

import java.util.ArrayList;

        ArrayList<Integer> list= unique(A.get(i));
        result.add(list);
    }

    return result;
}

}*/