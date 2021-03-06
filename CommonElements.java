/*Write a JAVA program to find out all the common elements from two given lists(to be entered by the user).
For e.g.
List1 = [1, 2, 3, 4, 5]
List2 = [1, 3, 5, 7]
Output = [1, 3, 5] */


import java.io.*;
import java.util.*;

public class CommonElements
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements of 1st array: ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.println("Enter number of elements of 2nd array: ");
		int n2 = Integer.parseInt(br.readLine());

		//declaring the two arrays
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		//accepting the elements of the arrays from the user
		System.out.println("Enter the elements of the 1st array...");
		for(int i=0; i<n1; i++)
			arr1[i] = Integer.parseInt(br.readLine());


		System.out.println("Enter the elements of the 2nd array...");
		for(int j=0; j<n2; j++)
			arr2[j] = Integer.parseInt(br.readLine());

		//finding out the common elements from the two arrays
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a=0; a<n1; a++)
		{
			for(int b=0; b<n2; b++)
			{
				if(arr1[a] == arr2[b])
				{
					if(!(list.contains(arr1[a])))
						list.add(arr1[a]);
				}
			}
		}

		//displaying the common elements of the two arrays
		System.out.println("Common Elements: " + list);
	}
}
