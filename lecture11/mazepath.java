package lecture11;

import java.util.ArrayList;
import java.util.Scanner;

public class mazepath {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int cr=scn.nextInt();
		int cc=scn.nextInt();
		int er=scn.nextInt();
		int ec=scn.nextInt();
		System.out.println(mazepath(cr,cc,er,ec));
	}
	
	public static ArrayList<String> mazepath(int cr,int cc,int er,int ec)
	{
		if (cr==er&&cc==ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		if (cr>er||cc>ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = mazepath(cr,cc+1,er,ec);
		for(String rrs:rrh) {
			mr.add("H"+rrs);
		}
		
		ArrayList<String> rrv = mazepath(cr+1,cc,er,ec);
		for(String rrs:rrv) {
			mr.add("V"+rrs);
		}
		return mr;
	}

}
