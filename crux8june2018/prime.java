package crux8june2018;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		int i=2;
		int flag=0;
		while(i<n)
		{
			if(n%i==0)
			{ flag=1;
			
				
			}
			i++;
			
		}
		if(flag==0)
		{ 
			System.out.println("prime");
			
		}
		else
		{
			System.out.println("not prime");
		}
		
		
	}

}
