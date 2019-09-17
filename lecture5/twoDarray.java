package lecture5;

import java.util.Scanner;

public class twoDarray {
	public static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
	int a[][]= Takeinput();
	display(a);

	}
	
	public static int[][] Takeinput()
	{
		System.out.println("Enter the no of rows");
		int rows= scn.nextInt();
		int [][]arr= new int[rows][];
		for(rows=0;rows<arr.length;rows++)
		{
			System.out.println("Enter the no of columns");
			int cols= scn.nextInt();
			arr[rows]= new int[cols];
			for(cols=0;cols<arr[rows].length;cols++)
			{
				arr[rows][cols]=scn.nextInt();
			}
		}
		return arr;
	}
	
	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
