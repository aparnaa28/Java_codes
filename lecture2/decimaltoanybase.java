package lecture2;

import java.util.Scanner;

public class decimaltoanybase {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number in decimal");
		int n= scn.nextInt();
		System.out.println("Enter the conversion base");
		int b= scn.nextInt();
		int rem,ans=0,mult=1;
	    while(n!=0)
	    {
	    	rem=n%b;
	    	ans=ans+(rem*mult);
	    	n=n/b;
	    	mult=mult*10;
	    }
	    System.out.println(ans);
	}

}
