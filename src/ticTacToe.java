import java.util.*;

public class ticTacToe {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String response = "Yes";
		System.out.println("Welcome to Tic-Tac-Toe.");
		System.out.println("In this game, the players will take turns entering the row number and column number to pick where to mark.");
		System.out.println("The left-most column would be column 1, and the top row would be row 1.");
		System.out.println("The game will end automatically after 9 turns");
		while (response.equals("Yes")) {
			game(userInput);
			System.out.println("Would you like to play again? Yes or No");
			response = userInput.next();
		}
		System.out.println("Thank you for playing!");
		userInput.close();
	}
	public static void game(Scanner userInput) {
		String[][] board = new String[3][3];
		int current = 1;
		String currentMark = "X";
		int counter = 0; //each time someone goes, it adds 1 because there can be a max of 9 inputs on the board
		while ((check(board) == false) && (counter < 9)) {
			process(current, currentMark, userInput, board);
			counter++;
			printBoard(board);
			System.out.println();
			if (current == 1) {
				current = 2;
				currentMark = "O";
			} else {
				current = 1;
				currentMark = "X";
			}
		}
		if (check(board) == true) {
			if (current == 2) {
				System.out.println("Player one wins!");
			} else if (current == 1) {
				System.out.println("Player two wins!");
			}
		} else {
			System.out.println("Tie!");
		}
	}
	public static void printBoard(String [][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == null) {
					System.out.print(" ");
				} else {
					System.out.print(board[i][j]);
				}
				if (j < 2) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("-----");
			}
		}
	}
	public static void process(int player, String mark, Scanner userInput, String [][] board) {
		boolean valid = false;
		while (valid == false) {
			System.out.println("Player " + player + ", choose where to put your mark.");
			System.out.println("Which row?");
			int row = userInput.nextInt() - 1;
			System.out.println("Which column?");
			int column = userInput.nextInt() - 1;
			if ((row >= 0) && (row < 3) && (column >= 0) && (column < 3) && (board[row][column] == null)) {
				board[row][column] = mark;
				valid = true;
			}
		}
		System.out.println();
	}
	public static boolean check(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			if ((board[i][1] != null) && (board[i][2] != null) && (board[i][1].equals(board[i][2])) && (board[i][2].equals(board[i][0]))) {
				return true;
			} else if ((board[1][i] != null) && (board[2][i] != null) && (board[1][i].equals(board[2][i])) && (board[2][i].equals(board[0][i]))) {
				return true;
			} else if ((board[0][0] != null) && (board[1][1] != null) && (board[0][0].equals(board[1][1])) && (board[1][1].equals(board[2][2]))) {
				return true;
			} else if ((board[0][2] != null) && (board[1][1] != null) && (board[0][2].equals(board[1][1])) && (board[1][1].equals(board[2][0]))) {
				return true;
			}
		}
		return false;
	}
}
