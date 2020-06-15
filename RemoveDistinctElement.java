/* Write a JAVA program to remove all the occurrences of an element(to be taken from the user) in a given list of integers.
For e.g.
Input List = [1, 5, 6, 2, 5]
Input Element = 5
Output List = [1, 6, 2] */


import java.io.*;
import java.util.*;

public class RemoveDistinctElement
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of elements: ");
		int n = Integer.parseInt(br.readLine());

		//declaring an array with size=n
		int []inputArray = new int[n];

		//accepting the elements of the array from the user
		System.out.println("Enter the elements of the array...");
		for(int i=0; i<n; i++)
			inputArray[i] = Integer.parseInt(br.readLine());

		//prompting the user to enter the specific element
		System.out.println("Enter the specific element: ");
		int element = Integer.parseInt(br.readLine());

		//finding the maximum element from the input array
		int maximum = inputArray[0];
		for(int j=1; j<n; j++)
		{
			if(maximum <= inputArray[j])
				maximum = inputArray[j];
		}

		//creating an auxiliary array with size=maximum+1
		int size = maximum + 1;
		int []auxiliaryArray = new int[size];

		//initialising each index of the auxiliary array with zero(0)
		for(int k=0; k<size; k++)
			auxiliaryArray[k] = 0;

		//maintaining the count of each elements in the auxiliary array
		for(int a=0; a<n; a++)
		{
			auxiliaryArray[inputArray[a]]++;
		}

		//traversing the auxiliary array and searching for the specific element and its count
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int index=0; index<size; index++)
		{
			if((element==index) && (auxiliaryArray[index]>1))
			{
				continue;
			} 
			else if(auxiliaryArray[index] != 0)
				list.add(index);
		}

		//displaying the list and it's size
		System.out.println("Output Array: " + list);
		System.out.println("Length of the Array: " + list.size());
	}
}
