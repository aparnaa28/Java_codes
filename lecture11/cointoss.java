package lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class cointoss {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the no of toss");
		int n=scn.nextInt();
		System.out.println(substrings(n));
		
	}
	
	public static ArrayList<String> substrings(int n) {
		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> rr = substrings(n-1);
		
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) {
				char ch1='H';
				mr.add( ch1 + rrs);
				char ch2='T';
				mr.add(ch2 + rrs);
			
		}
		return mr;

	}
	
	
	}

	
