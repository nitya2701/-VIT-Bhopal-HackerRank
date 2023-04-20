/*
You have been given a integer array/list(ARR) of size N. In the array you are only having 0, 1 and 2 elements. Write a function to sort the array using this algorithm.

Input Format

First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Constraints

No

Output Format

Return Sorted Array

Sample Input 0

3
0 1 0
Sample Output 0

0 0 1
Sample Input 1

9
0 0 1 1 2 2 2 0 1
Sample Output 1

0 0 0 1 1 1 2 2 2
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int arr[] = new int[N];
        
        for(int i = 0; i<N; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i =0 ; i<N; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
