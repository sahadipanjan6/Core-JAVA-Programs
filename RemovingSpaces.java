/* Write a JAVA program to remove all whitespaces from a string without using the replace() function.
For e.g.
Input String = "Hello World"
Output String = "HelloWorld" */


import java.io.*;
import java.util.*;

public class RemovingSpaces
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string: ");
		String str = br.readLine();
		String outputString = "";

		//removing the spaces and forming the new string
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ')
				outputString += str.charAt(i);

			else
				continue;
		}

		//displaying the output string
		System.out.println("Output String: " + outputString);
	}
}
