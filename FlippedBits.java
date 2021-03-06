/* Write a JAVA program to count the number of bits to be flipped to convert one integer into another integer.
For e.g.
Integer1 = 5
Integer2 = 6
Output = 2 */


import java.io.*;
import java.util.*;

public class FlippedBits
{
	//fucntion definition to count the number of 1s in the binary representation of an integer
	public static int countOnes(int number)
	{
		int copy = number;
		int count = 0;

		while(copy != 0)
		{
			if(copy % 2 == 1)
			{
				count++;
				copy /= 2;
			}

			else
				copy /= 2;
		}

		return count;
	}


	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 1st number: ");
		int n1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the 2nd number: ");
		int n2 = Integer.parseInt(br.readLine());

		int xor = n1^n2;
		System.out.println("Number of bits to be flipped: " + countOnes(xor));

	}
}
