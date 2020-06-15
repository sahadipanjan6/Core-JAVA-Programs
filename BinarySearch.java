/*Write a JAVA program to search an element in the given array using the Binary Search methodology.
Sample Input Array = [2, 3, 4, 10, 40]
Search Key = 10
Sample Output = 10 is present in index position 3. */


import java.io.*;
import java.util.*;

public class BinarySearch
{

	//function definition to perform Binary Search
	public static int binarySearch(int arr[], int l, int r, int key)
	{
		if(l <= r)
		{
			int mid = l+(r-l)/2;

			if(key == arr[mid])
				return mid;

			else if(key < arr[mid])
				return binarySearch(arr, l, mid-1, key);

			else if(key > arr[mid])
				return binarySearch(arr, mid+1, r, key);
		}

		return -1;
	}


	//the main() function definition
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements: ");
		int n = Integer.parseInt(br.readLine());

		int []arr = new int[n];
		System.out.println("Enter the elements...");
		for(int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());

		System.out.println("Enter the element to be searched: ");
		int search_key = Integer.parseInt(br.readLine());

		//sorting the input array in ascending order
		Arrays.sort(arr);

		//performing Binary Search of the element
		int output = binarySearch(arr, 0, (arr.length-1), search_key);

		if(output != -1)
			System.out.println(search_key + " is found in index position " + output);

		else if(output == -1)
			System.out.println(search_key + " is not present in the given array!!!");
	}
}
