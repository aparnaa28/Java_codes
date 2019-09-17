package lecture2;

import java.util.Scanner;

public class anybasetodecimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Input any base");
		int b= scn.nextInt();
		System.out.println("Input the number");
		int n= scn.nextInt();
		int rem,ans=0;
		int mult=1;
		while(n!=0)
		{
			rem=n%10;
			ans=ans+(rem*mult);
			n=n/10;
			mult=mult*b;
		}
		System.out.println(ans);
		
	}

}
