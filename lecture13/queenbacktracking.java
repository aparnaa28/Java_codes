package lecture13;

import java.util.Scanner;

public class queenbacktracking {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size");
		int n = scn.nextInt();
		boolean[][] board = new boolean[n][n];
		Nqueens(board, 0, "");

	}

	public static void Nqueens(boolean[][] board, int row, String asf) {
	
		if (row == board.length) {
			System.out.println(asf);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (isSafe(board, row, col)) {
				board[row][col] = true;
				Nqueens(board, row + 1, asf + "{"+ row + "-" + col+ "}");
				board[row][col] = false;
			}
		}
	}

	public static boolean isSafe(boolean[][] board, int row, int col) {
		// vertically
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board.length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;

	}

}
