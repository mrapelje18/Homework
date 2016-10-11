
public class Mississippi {
	public static void main(String[] args) {
		M();
		ISS();
		ISS();
		I();
		P();
		P();
		I();
		
	}
	public static void ISS() {
		I();
		S();
		S();
	}
	public static void M() {
		System.out.println("M     M");
		System.out.println("MM   MM");
		System.out.println("M M M M");
		System.out.println("M  M  M");
		System.out.println("M     M");
		System.out.println("M     M");
		System.out.println("M     M\n");
	}
	public static void midI() {
		System.out.println("  I");
	}
	public static void I() {
		System.out.println("IIIII");
		midI();
		midI();
		midI();
		midI();
		midI();
		System.out.println("IIIII\n");
	}
	public static void midS() {
		System.out.println(" SSSSS");
	}
	public static void S() {
		midS();
		System.out.println("S     S");
		System.out.println("S");
		midS();
		System.out.println("      S");
		System.out.println("S     S");
		midS();
		System.out.println();
	}
	public static void P() {
		System.out.println("PPPPPP");
		System.out.println("P     P");
		System.out.println("P     P");
		System.out.println("PPPPPP");
		System.out.println("P");
		System.out.println("P");
		System.out.println("P\n");
	}
}
