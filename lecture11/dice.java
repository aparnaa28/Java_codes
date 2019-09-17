package lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class dice {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter current");
		int n=scn.nextInt();
		System.out.println("Enter end");
		int m=scn.nextInt();
		System.out.println(Boardpath(n,m));
	
	}
	
	public static ArrayList<String> Boardpath(int curr,int end)
	{
		if (curr==end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
        for(int i=1;i<=6&&i+curr<=end;i++)
        {
        	ArrayList<String> rr = Boardpath(curr+i,end);
        	for(String rrs:rr) {
        		mr.add(i+rrs);
        	}
        }
        return mr;
		
	}
	
	
	}



