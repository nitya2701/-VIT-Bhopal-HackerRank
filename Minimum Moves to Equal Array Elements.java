/*
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
In one move, you can increment or decrement an element of the array by 1.
Test cases are designed so that the answer will fit in a 32-bit integer.
Input Format

First line array size
Second line array elements
Constraints

n == nums.length
1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
Output Format

Moves required to make array equal
Sample Input 0

3
1 2 3
Sample Output 0

2
Explanation 0

Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3] => [2,2,3] => [2,2,2]
Sample Input 1

4
1 10 2 9
Sample Output 1

16
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, median = nums[nums.length / 2];
        for (int num : nums) ans += Math.abs(median - num);
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        
        for(int i = 0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        
        System.out.println(minMoves2(nums));
    }
}
