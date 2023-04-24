/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

Input Format

The first line have the M value
Second line have N value
Third-line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith rows constitutes column values separated by a single space
Constraints

No

Output Format

90 degree Rotated Matrix in single line.
Sample Input 0

3
3
1 2 3
4 5 6
7 8 9
Sample Output 0

7 4 1 8 5 2 9 6 3
Sample Input 1

3
3
1 12 3
4 15 6
7 18 9
Sample Output 1

7 4 1 18 15 12 9 6 3
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
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int arr[][] = new int[m][n];
        
        for(int i =0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.print(arr[2][0]+ " ");
        System.out.print(arr[1][0]+ " ");
        System.out.print(arr[0][0]+ " ");
        System.out.print(arr[2][1]+ " ");
        System.out.print(arr[1][1]+ " ");
        System.out.print(arr[0][1]+ " ");
        System.out.print(arr[2][2]+ " ");
        System.out.print(arr[1][2]+ " ");
        System.out.print(arr[0][2]+ " ");
    }
}
