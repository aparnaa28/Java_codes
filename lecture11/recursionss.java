package lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class recursionss {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a string");
		String s= scn.nextLine();
	System.out.println(substrings(s));	
	}
	
	public static ArrayList<String> substrings(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> br= new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> rr=substrings(ros);
		ArrayList<String> mr=new ArrayList<>();
		for(String rrs:rr)
		{
			mr.add(rrs);
			mr.add(ch+rrs);
			mr.add((int)(ch)+rrs);
		}
		return mr;
		
	}

}
