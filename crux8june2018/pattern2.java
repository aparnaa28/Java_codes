package crux8june2018;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n= scn.nextInt();
		int row=1,nsr=2*n-1,nst=n,nsp=n-1;
		while(row<=nsr)
		{
			//no of spaces
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print(" ");
			}
			
			//no of stars
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*");
			}
			
			if(row<=nsr/2)
			{
				nsp--;
				nst--;
			}
			else
			{
				nsp++;
				nst++;
			}
			System.out.println();
			row++;
		}

	}

}
