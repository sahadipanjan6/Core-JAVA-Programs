/* Write a JAVA program to perform Linear Search of an element in a given integer array.
Sample Input Array = [5, 4, 3, 2, 1]
Element to be searched = 3
Sample Output: 3 is found in index position 2 */


import java.io.*;
import java.util.*;

public class LinearSearch
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

		System.out.println("Enter the elements to be searched: ");
		int key = Integer.parseInt(br.readLine());

		//performing Linear Search
		int flag = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == key)
			{
				flag = 1;
				System.out.println(key +" is found in index position " + i);
				break;
			}
		}

		if(flag==0)
			System.out.println(key + " is not present in the given array...");
	}
}
