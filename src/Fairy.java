
public class Fairy extends Pokemon {
	public Fairy (String name, String opponentType) {
		super(name, "fairy", opponentType);
	}
	public void typeBonusA() {
		String OT = getOpponent();
		if (OT.equals("fighting") || OT.equals("dragon") || OT.equals("dark")) {
			System.out.println("Super effective!");
		} else if (OT.equals("poison") || OT.equals("steel") || OT.equals("fire")) {
			System.out.println("Not very effective...");
		} else {
			System.out.println("Normal effect.");
		}
	}
	public void typeBonusD() {
		String OT = getOpponent();
		if (OT.equals("poison") || OT.equals("steel")) {
			System.out.println("Super effective!");
		} else if (OT.equals("fighting") || OT.equals("bug") || OT.equals("dark")) {
			System.out.println("Not very effective...");
		} else if (OT.equals("dragon")) {
			System.out.println("No effect!");
		} else {
			System.out.println("Normal effect.");
		}
	}
}
