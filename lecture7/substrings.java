package lecture7;

import java.util.Scanner;

public class substrings {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a string");
		String Str= scn.nextLine();
		substrings(Str);
	}
	
	public static void substrings(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}

}
