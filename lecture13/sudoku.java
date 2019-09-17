package lecture13;

import java.util.Scanner;

public class sudoku {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	
	public static void sudoku(int[][] board,int row,int col,String ans)
	{
		if(row==board.length)
		{
			return;
		}
		if(col==board[0].length)
		{
			sudoku(board,row+1,col,ans);
			return;
		}
		
		if(board[row][col]!=0)
		{
			sudoku(board,row,col+1,ans);
		}
		for(int i=1;i<=9;i++)
		{
			//if(isitSafe())
			//{
			//	board[row][col]=i;
				//sudoku(board,row,col+1,ans);
			//}
			board[row][col]=0;
		}
		
	}
	
	

}
