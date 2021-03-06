/* Write a JAVA Program to accept a string from the user, reverse the string and display in the following format:
Sample Input : "EARTH"
Sample Output: "EARTH | HTRAE" */


import java.io.*;
import java.util.*;

public class MirrorImage
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		String str = br.readLine();
		String reverse = new StringBuffer(str).reverse().toString();

		System.out.println("Output: " + str +" | " + reverse);
	}
}
