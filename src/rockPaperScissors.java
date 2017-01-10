import java.util.Random;
import java.util.*;

public class rockPaperScissors { 
	public static void main(String[] args) {
		game(); //for exercise 1
	}
	public static void game() {
		boolean hi = true;
		Scanner userMove = new Scanner(System.in);
		int userInt = 0;
		while (hi == true) {
			System.out.println("Lets play rock paper scissors!");
			System.out.println("What do you play?  Type rock, paper, or scissors.");
			String usermove = userMove.next();
			if (usermove.equals("rock")) {
				userInt = 0;
			} else if (usermove.equals("scissors")) {
				userInt = 1;
			} else if (usermove.equals("paper")) {
				userInt = 2;
			} else {
				System.out.println("That doesn't work.");
				break;
			}
			Random r = new Random( );
			int cpu = r.nextInt(3);
			if (userInt == cpu) {
				System.out.println("We played the same move! Tied!");
			} else if (userInt == 0) {
				if (cpu == 1) {
					System.out.println("I played scissors!");
					System.out.println("You win!");
				} else if (cpu == 2) {
					System.out.println("I played paper!");
					System.out.println("You lose.");
				}
			} else if (userInt == 1) {
				if (cpu == 0) {
					System.out.println("I played rock!");
					System.out.println("You lose.");
				} else if (cpu == 2) {
					System.out.println("I played paper!");
					System.out.println("You win!");
				}
			} else if (userInt == 2) {
				if (cpu == 0) {
					System.out.println("I played rock!");
					System.out.println("You win!");
				} else if (cpu == 1) {
					System.out.println("I played scissors!");
					System.out.println("You lose.");
				}
			} else {
				break;
			}
			System.out.print("Would you like to play again? Type yes or no. ");
			String response = userMove.next();
			if (response.equals("yes")) {
				hi = true;
			} else {
				hi = false;
			}
		}
		userMove.close();
		System.out.print("Thank you for playing.");
	}
}