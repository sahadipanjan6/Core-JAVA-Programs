/* Write a JAVA program to find all such triplets in a given integer array whose sum will be equal to a given total.
Sample Input Array = [1, 2, 3, 4, 5]
Sum to be checked = 6
Sample Output Triplet = (1, 2, 3) */


import java.io.*;
import java.util.*;

public class TripletFamily
{

	//function definition to find out all possible triplets
	public static void findTriplets(int []arr, int sum)
	{
		for(int i=0; i<arr.length-2; i++)
		{
			for(int j=i+1; j<arr.length-1; j++)
			{				
				for(int k=j+1; k<arr.length; k++)
				{
					if((arr[i]+arr[j]+arr[k]) == sum)
						System.out.println("Found Triplet: (" + arr[i]+","+arr[j]+","+arr[k]+")");		
				}
			}
		}
	}

	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements: ");
		int n = Integer.parseInt(br.readLine());

		int []arr = new int[n];
		System.out.println("Enter the elements...");
		for(int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());

		System.out.println("Enter the sum to be checked: ");
		int total = Integer.parseInt(br.readLine());

		//calling the function
		findTriplets(arr, total);
	}
}
