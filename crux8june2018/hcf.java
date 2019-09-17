package crux8june2018;

import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=scn.nextInt();
		System.out.println("Enter the second number");
		int n2=scn.nextInt();
		int i;
		if(n1<n2) {
			 i=n1;
		}
		else
		{
			i=n2;
		}
		
		while(i>0)
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.println(i);
				//break;
			}
			i--;
		}
		

	}

}
