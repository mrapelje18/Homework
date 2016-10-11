//This program prints three short letters to parents, friend, and sibling.
//It's easy to change the orders of the paragraphs by calling methods.
public class letterProject {
	public static void main(String[] args) {
		parent();
		friend();
		sibling();
	}
	public static void parent() {
		System.out.println("Dear Mom and Dad,\n");
		money();
		school();
		closing();
	}
	public static void friend() {
		System.out.println("Dear friend,\n");
		hobby();
		school();
		closing();
	}
	public static void sibling() {
		System.out.println("Dear sibling,\n");
		friends();
		school();
		closing();
	}
	public static void closing() {
		System.out.println("From, Micah");
		System.out.println();
		System.out.println();
	}
	public static void school() {
		//paragraph about school
		System.out.println("	I am so stressed about school right now.  I know it's still about the third week of school, but there");
		System.out.println("has already been three quizzes in the last week.  I am taking three AP classes this year, and I think those");
		System.out.println("are the hardest classes that I am taking.  There's so much homework.  Ugh.  On top of that, I have to go");
		System.out.println("to Japanese Saturday school.  There's not too much homework there, but so many projects and tests.  I have");
		System.out.println("to write a seven page speech and there are midterms tomorrow.");
		System.out.println();
	}
	public static void friends() {
		//paragraph about friends
		System.out.println("	I think I have good friends.  I'm not too close to them because I have never met them before, but I know");
		System.out.println("they're good people since there is a group chat where we discuss the game that we're playing.  Yes, it's a");
		System.out.println("guild/team chat and we're a team in a smartphone game.  I don't really talk, but I kinda consider myself");
		System.out.println("their friend.");
		System.out.println();
	}
	public static void money() {
		//paragraph about money
		System.out.println("	I think I need money.  I need to buy food from the pavilion.  Please donate money to support for a cause");
		System.out.println("to help fill my stomach.");
		System.out.println();
	}
	public static void hobby() {
		//paragraph about hobby
		System.out.println("	I really love to play games on my iPhone.  I could play them all day.  They're mostly strategy games and");
		System.out.println("are sometimes complicated.  I also really love to draw.  I like to color lineart that is uploaded to a site");
		System.out.println("where people can download other peopl's work to see how they drew it.");
		System.out.println();
	}
}
