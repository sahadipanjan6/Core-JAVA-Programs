/*Problem Statement:

Given an array A[] of size N and an integer K. Your task is to print the count of distinct numbers in all windows of size k
in the array A[].

Sample Input Array = [1, 2, 1, 3, 4, 2, 3]
Window Size = 4
Sample Output = 3, 4, 4, 3 */


import java.io.*;
import java.util.*;

public class CountDistinctInEveryWindow
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements: ");
		int n = Integer.parseInt(br.readLine());

		int []arr = new int[n];
		System.out.println("Enter the elements...");
		for(int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());

		System.out.println("Enter window size: ");
		int window = Integer.parseInt(br.readLine());


		//traversing the array and finding the distinct elements
		for(int i=0; i<=(arr.length-window); i++)
		{
			TreeSet<Integer> ts = new TreeSet<Integer>();
			for(int j=i; j<(i+window); j++)
			{
				ts.add(arr[j]);
			}
			System.out.println("Number of distinct elements in Window #" + (i+1) + ": " + ts.size());
		}
	}
}



