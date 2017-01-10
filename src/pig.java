import java.util.*;
import java.util.Random;

public class pig {
	public static void main(String[] args) {
		pigGame();
	}
	public static void pigGame() {
		int points1 = 0;
		int points2 = 0;
		String player1 = "yes";
		String player2 = "yes";
		Scanner userInput = new Scanner(System.in);
		
		while ((points1 < 100) && (points2 < 100)) {
			points1 = repeat(points1, player1, userInput, "Player 1");
			System.out.println();
			if (points1 >= 100) {
				break;
			}
			points2 = repeat(points2, player2, userInput, "Player 2");
			System.out.println();
		}
		if (points1 >= 100) {
			System.out.print("Player 1 wins!");
		} else if (points2 >= 100) {
			System.out.print("Player 2 wins!");
		}
	}
	public static int repeat(int points, String player, Scanner userInput, String name) {
		int sum = 0;
		int d = 0;
		System.out.println("It's your turn, " + name + "!\n");
		while ((player.equals("yes")) && ((points + sum) < 100)) {
			Random r = new Random();
			d = r.nextInt(6)  + 1;
			System.out.println("You rolled a " + d + "!");
			if (d == 1) {
				System.out.println("Sorry, you have to skip a turn.");
				System.out.println("You now have " + (points) + " points.  You need " + (100 - points) + " to win.\n");
				break;
			} else {
				sum += d;
				System.out.println("You now have " + (sum + points) + " points.");
				if ((points + sum) < 100) {
					System.out.println("You need " + (100 - points - sum) + " to win.");
					System.out.print("Would you like to continue rolling? ");
					player = userInput.next();
				}
			}
			System.out.println();
		}
		if (d != 1) {
			points += sum;
		}
		return points;
	}
}
