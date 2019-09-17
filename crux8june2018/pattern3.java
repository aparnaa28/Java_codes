package crux8june2018;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n= scn.nextInt();
		int row=1,nsd=1,i,nsr=2*n-1;
		int val=1;
		while(row<=nsr)
		{ 
			//work
			for(i=1;i<=nsd;i++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(val);
				}
			}
			
			//preparation
		
			if(row<=nsr/2)
			{   val++;
				nsd+=2;
			}
			else
			{   val--;
				nsd-=2;
			}
			System.out.println();
			row++;
		}
	}

}
