/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input Format

Two integers x and n (separated by space)

Constraints

0 <= x <= 30
0 <= n <= 30
Output Format

x^n (i.e. x raise to the power n)

Sample Input 0

3 4
Sample Output 0

81
Sample Input 1

2 2
Sample Output 1

4
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
        double x = sc.nextDouble();
        double n = sc.nextDouble();
        double prod = 1; 
        
        prod = Math.pow(x,n);
                
        int val = (int)prod;
        
        System.out.println(val);
    }
}
