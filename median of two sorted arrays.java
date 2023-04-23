/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Input Format

Line consists of 'n' space seperated integers representing the values present in the Array
Constraints

nums1.length == m
nums2.length == n
Output Format

Median of two sorted arrays
Sample Input 0

2
1 2
1
3
Sample Output 0

2.0
Sample Input 1

2
1 2
2
3 4
Sample Output 1

2.5
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sorted {
    public static int Solution(int[] arr)
    {
        int n = arr.length;
    
        if (n % 2 == 0)
        {
            int z = n / 2;
            int e = arr[z];
            int q = arr[z - 1];

            int ans = (e + q) / 2;
            return ans;
        }
    
        else
        {
            int z = Math.round(n / 2);
            return arr[z];
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
       
        
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        
        for(int i =0; i<m; i++)
        {
            arr1[i] = sc.nextInt();
        }
        
        for(int i =0; i<n; i++)
        {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[m + n];

        System.arraycopy(arr1, 0, arr3, 0, m);
        System.arraycopy(arr2, 0, arr3, m, n);

        Arrays.sort(arr3);

        float a = Solution(arr3);
        System.out.print(a);
    }
}
