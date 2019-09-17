package lecture8;

import java.util.Scanner;

public class maximum {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int max;
	max=maximum(a,0);
	System.out.println(max);
	}
	
	public static int maximum(int arr[],int index)
	{
		if(index==arr.length)
			return Integer.MIN_VALUE;
		
		int max=maximum(arr,index+1);
		if(arr[index]> max)
		{
		 max = arr[index];
		}
		
		return max;
		
	}

}
