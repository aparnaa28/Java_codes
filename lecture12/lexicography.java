package lecture12;

import java.util.Scanner;

public class lexicography {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n=scn.nextInt();
		lexicoCounting(0,n);
	}
	
	public static void lexicoCounting(int curr,int end)
	{
		if(curr>end) {
			return;
		}
		
		System.out.print(curr+" ");
		
		if(curr==0) {
		for(int i=1;i<=9;i++)
		{
			lexicoCounting(curr*10+i,end);
		}
		}
		else
		{
			for(int i=0;i<=9;i++)
			{
				lexicoCounting(curr*10+i,end);
			}
			
		}
		
		
	}

}
