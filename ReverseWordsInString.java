/* Write a JAVA Program to reverse each word in a given sentence(to be taken from the user). */

import java.io.*;
import java.util.*;

public class SplitExample
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string: ");
		String str = br.readLine();

		String array[] = str.split(" ");

		//reversing each word of the sentence
		String output = "";
		for(int i=0; i<array.length; i++)
		{
			StringBuffer sb = new StringBuffer();
			sb.append(array[i]);
			output = output + sb.reverse().toString() + " ";
		}

		//displaying the output string
		System.out.println("Output String: " + output);
	}
}
