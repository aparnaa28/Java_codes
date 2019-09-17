package lecture2;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter the binary number");
		int n= scn.nextInt();
		int ans=0,mult=1,rem;
		while(n!=0)
		{
			rem=n%10;
			ans=ans+(rem*mult);
			n=n/10;
			mult=mult*2;
		}
		System.out.println(ans);
	}
	

}
