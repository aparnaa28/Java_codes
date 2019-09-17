package lecture5;

import java.util.Scanner;

public class wavedisplay {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 10, 20, 30, 40 }, { 5, 6, 7, 8 }, { 11, 12, 13, 14 } };
		//	display(arr);
			wave(arr);
	}
	
	public static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void wave(int arr[][])
	{
		int j, i;
		 
			
				for (j =0; j<arr.length;j++)
				{
					if(j%2!=0)
					{
						for(i= arr[0].length-1 ;i>=0; i--)
							System.out.print(arr[i][j] + " ");
					}
				
					else
					{
						
							for (i = 0; i < arr[0].length; i++)
							System.out.print(arr[i][j] + " ");	
					}
			    }
			
			
			
		}
	}


