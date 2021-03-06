/* Given two strings str1 and str2. Write a JAVA program to modify string str1 such that all the common characters
of str1 and str2 is to be removed and the uncommon characters of str1 and str2 to be concatenated.
For e.g.
Input String1 : "aacdb"
Input String2: "gafd"
Output String: "cbgf" */


import java.io.*;
import java.util.*;

public class RemoveCommonAndConcatenate
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st string: ");
		String str1 = br.readLine();
		System.out.println("Enter 2nd string: ");
		String str2 = br.readLine();

		String st1 = "";
		String st2 = "";

		for(int i=0; i<str1.length(); i++)
		{
			int flag = 0;
			for(int j=0; j<str2.length(); j++)
			{
				if(str1.charAt(i) != str2.charAt(j))
					continue;

				else
				{
					flag = 1;
					break;
				}
			}

			if(flag == 0)
				st1 += str1.charAt(i);
		}

		for(int i=0; i<str2.length(); i++)
		{
			int flag = 0;
			for(int j=0; j<str1.length(); j++)
			{
				if(str2.charAt(i) != str1.charAt(j))
					continue;

				else
				{
					flag = 1;
					break;
				}
			}

			if(flag == 0)
				st2 += str2.charAt(i);
		}

		//displaying the concatenated string
		System.out.println("Output String: " + st1+st2);
	}
}
