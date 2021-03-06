/* Write a JAVA program to reverse a string with preserving the position of spaces. 
For e.g. 
Input String = "I Am Not String"
Output String = "g ni rtS toNmAI" */


import java.io.*;
import java.util.*;

public class ReverseAndPreserve
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string: ");
		String str = br.readLine();

		ArrayList<Integer> indexOfSpaces = new ArrayList<Integer>();

		//finding the indexes at which spaces are present in the string
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
				indexOfSpaces.add(i);
		}

		//forming the reverse of the actual string without taking the spaces
		String str1 = "";
		for(int j=str.length()-1; j>=0; j--)
		{
			if(str.charAt(j) != ' ')
				str1 += str.charAt(j);
		}

		StringBuffer sb = new StringBuffer();
		sb.append(str1);

		//inserting spaces in their respective indexes
		for(int index : indexOfSpaces)
			sb.insert(index, ' ');

		//displaying the final output string
		System.out.println("Output String: " + sb.toString());
	}
}
