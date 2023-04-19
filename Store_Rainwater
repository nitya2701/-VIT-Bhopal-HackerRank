/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Input Format

First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Constraints

n == height.length
1 <= n <= 2 * 10^4
0 <= height[i] <= 10^5
Output Format

Value showing how much water we can store
Sample Input 0

12
0 1 0 2 1 0 1 3 2 1 2 1
Sample Output 0

6
Explanation 0

The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Sample Input 1

6
4 2 0 3 2 5
Sample Output 1

9
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int maxWater(int[] arr, int n)
    {
  
        // To store the maximum water
        // that can be stored
        int res = 0;
  
        // For every element of the array
        // except first and last element
        for (int i = 1; i < n - 1; i++) {
  
            // Find maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
  
            // Find maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
  
            // Update maximum water value
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int [n];
        
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println(maxWater(arr,n));
    }
}
