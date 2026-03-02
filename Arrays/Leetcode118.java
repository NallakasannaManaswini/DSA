Step-by-Step Algorithm:

Step 1: Create an empty list ans to store all rows of the triangle.
Step 2: If n == 0, return the empty list ans.
Step 3: Create the first row as a new list containing only 1.
Step 4: Add the first row to ans.
Step 5: If n == 1, return ans because only one row is required.
Step 6: Start a loop from i = 2 to n (to generate remaining rows).
Step 7: For each iteration:
Create a new empty list r for the current row.
Get the previous row from ans.

Step 8: Add 1 as the first element of the new row.
Step 9: For each middle position j from 1 to previous row size - 1:
Compute the value as the sum of two adjacent elements from the previous row:
previousRow[j] + previousRow[j - 1]
Add this value to the current row.
  
Step 10: Add 1 as the last element of the new row.
Step 11: Add the completed row to ans.
Step 12: Repeat the process until all n rows are generated.
Step 13: Return ans containing all rows of Pascal’s Triangle.

Time Complexity
O(n^2)
Space Complexity
O(n^2)


------> Code <------

  class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        if(n==0) return ans;
        List<Integer> row=new ArrayList<>();
        row.add(1);
        ans.add(row);
        if(n==1)return ans;
        for(int i=2;i<=n;i++){
            List<Integer> r=new ArrayList<>();
            List <Integer> prev=ans.get(ans.size()-1);
            r.add(1);
            for(int j=1;j<prev.size();j++){
                r.add(prev.get(j)+prev.get(j-1));
            }
            r.add(1);
            ans.add(r);
        }
        return ans;
    }
}
