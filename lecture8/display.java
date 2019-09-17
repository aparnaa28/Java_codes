package lecture8;

import java.util.Scanner;

public class display {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		display(a,0);

	}
	
	public static void display(int arr[],int index)
	{
		if(index==arr.length)
			return;
		System.out.print(arr[index]+" ");
		display(arr,index+1);
	}

}
