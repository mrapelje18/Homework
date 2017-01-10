import java.util.*;

public class comparePlayers { //for exercise 3
	public static void main(String[] args) {
		compare();
	}
	public static void compare() {
		int moves1 = 0;
		int moves2 = 0;
		int counter = 0;
		double final1 = 0;
		double final2 = 0;
		Scanner userInput = new Scanner(System.in);
		while (counter < 2) {
			if (counter == 0) {
				System.out.println("Player 1:");
			} else {
				System.out.println("Player 2:");
			}
			System.out.print("How many times did you play the game? ");
			double numGames = userInput.nextInt();
			System.out.print("How many times did you win? ");
			double numWins = userInput.nextInt();
			System.out.print("How many moves in a game? ");
			int numMoves = userInput.nextInt();
			if (counter == 0) {
				final1 = (numWins)/(numGames);
				moves1 = numMoves;
			} else if (counter == 1) {
				final2 = (numWins)/(numGames);
				moves2 = numMoves;
			}
			counter++;
			System.out.println();
		}
		System.out.println();
		if (final1 < final2) {
			System.out.print("Player 2 performed better.");
		} else if (final1 > final2) {
			System.out.print("Player 1 performed better.");
		} else if (final1 == final2) {
			if (moves1 < moves2) {
				System.out.print("Player 1 performed better.");
			} else if (moves1 > moves2) {
				System.out.print("Player 2 performed better.");
			} else {
				System.out.print("Both players performed well.");
			}
		}
		userInput.close();
	}
}
