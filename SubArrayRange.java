/* Given an unsorted array arr[] of N integers and a sum. 
The task is to count the number of subarray which adds to a given number.
Sample Input Array = [10, 2, -2, -20, 10]
Sum to be checked = -10
Count of subarrays = 3 */


import java.io.*;
import java.util.*;

public class SubArrayRange
{

	//function definition to find out all possible subarrays
	public static ArrayList<ArrayList<Integer>> allSubArrays(int []arr)
	{
		ArrayList<ArrayList<Integer>> outputList = new ArrayList<ArrayList<Integer>>();

		//the starting point
		for(int i=0; i<=arr.length; i++)
		{
			//the ending point
			for(int j=i; j<arr.length; j++)
			{
				ArrayList<Integer> list = new ArrayList<Integer>();
				//picking elements within the starting and ending point
				for(int k=i; k<=j; k++)
					list.add(arr[k]);

				outputList.add(list);
			}
		}

		return outputList;
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

		System.out.println("Enter sum to be checked: ");
		int sum = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Integer>> subArrays = allSubArrays(arr);

		int count=0;
		for(ArrayList<Integer> li : subArrays)
		{
			int total = 0;
			//finding the sum
			for(int i : li)
				total += i;

			if(total == sum)
				count++;
		}

		//displaying the count
		System.out.println("Total number of subarrays having sum " + sum + " is " + count);

	}
}
