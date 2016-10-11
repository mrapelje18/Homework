
public class houseJack {
	public static void main(String[] args) {
		System.out.println("This is the house that Jack built.");
		System.out.println("This is the malt");
		malt();
		System.out.println("This is the rat,");
		rat();
		System.out.println("This is the cat,");
		cat();
		System.out.println("This is the dog,");
		dog();
		System.out.println("This is the cow with the crumpled horn,");
		cow();
		System.out.println("This is the maiden all forlorn,");
		maiden();
		System.out.println("This is the man all tattered and torn,");
		man();
		System.out.println("This is the priest all shaven and shorn,");
		priest();
		System.out.println("This is the rooster that crowed in the morn,");
		rooster();
		System.out.println("This is the farmer sowing his corn,");
		farmer();
	}
	public static void malt() {
		System.out.println("That lay in the house that Jack built.");
	}
	public static void rat() {
		System.out.println("That ate the malt");
		malt();
	}
	public static void cat() {
		System.out.println("That killed the rat,");
		rat();
	}
	public static void dog() {
		System.out.println("That worried the cat,");
		cat();
	}
	public static void cow() {
		System.out.println("That tossed the dog,");
		dog();
	}
	public static void maiden() {
		System.out.println("That milked the cow with the crumpled horn,");
		cow();
	}
	public static void man() {
		System.out.println("That kissed the maiden all forlorn,");
		maiden();
	}
	public static void priest() {
		System.out.println("That married the man all tattered and torn,");
		man();
	}
	public static void rooster() {
		System.out.println("That waked the priest all shaven and shorn,");
		priest();
	}
	public static void farmer() {
		System.out.println("That kept the rooster that crowed in the morn,");
		rooster();
	}
}
