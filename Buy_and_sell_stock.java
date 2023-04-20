/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input Format

First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Constraints

No

Output Format

Integer representing the answer of the problem statement.
Sample Input 0

6
7 1 5 3 6 4
Sample Output 0

5
Explanation 0

Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Sample Input 1

5
7 6 4 3 1
Sample Output 1

0
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int num, max=0;
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        int[] array = new int[num]; 
        for(int i=0;i<num;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=num-1;i>=0;i--)
        {
            for(int j=0;j<i;j++){
                max=((array[i]-array[j])>max) ? (array[i]-array[j]): max;
            }
        }
        System.out.print(max);
   }
}
