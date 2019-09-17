package lecture5;

import java.util.Scanner;

public class spiral {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 10, 20, 30, 40 }, { 5, 6, 7, 8 }, { 11, 12, 13, 14 } };
		//	display(arr);
		spiral(arr);
	}
	
	public static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void spiral(int arr[][])
	{
		int minrow=0;
		int maxrow=arr.length-1;
		int mincol=0;
		int maxcol=arr[0].length-1;
		int counter=0;
		int nel=arr.length*arr[0].length;
		
		while(counter<nel)
		{
			for(int i=minrow;i<=maxrow&&counter<nel;i++)
				{
				System.out.print(arr[i][mincol]+" ");
			    counter++;
				}
			mincol++;
			
			for(int j=mincol;j<=maxcol&&counter<nel;j++)
			{
				System.out.print(arr[maxrow][j]+" ");
				counter++;
			}
			maxrow--;
			
			for(int i=maxrow;i>=minrow&&counter<nel;i--)
			{
				System.out.print(arr[i][maxcol]+" ");
				counter++;
			}
			maxcol--;
			
			for(int j=maxcol;j>=mincol&&counter<nel;j--)
			{
				System.out.print(arr[minrow][j]+" ");
				counter++;
			}
			minrow++;
		}
	}

}
