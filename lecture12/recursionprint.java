package lecture12;

import java.util.ArrayList;
import java.util.Scanner;

public class recursionprint {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter a string");
	String str=scn.nextLine();
	System.out.println(substrings(str).size());
	printss(str,"");
	

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
			mr.add(rrs+ch);
			mr.add((int)(ch)+rrs);
		}
		return mr;
		
	}
	
	public static void printss(String s,String ans)
	{
		if(s.length()==0)
		{
			System.out.print(ans+" ");
			return ;
		}
		
		
		char ch=s.charAt(0);
		String ros=s.substring(1);
		
		printss(ros,ans);
		printss(ros,ans+ch);
		printss(ros,ans+(int)ch);
		
	}

}
