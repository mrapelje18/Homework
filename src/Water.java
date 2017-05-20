
public class Water extends Pokemon {
	public Water(String name, String opponentType) {
		super(name, "water", opponentType);
	}
	public void typeBonusA() {
		String OT = getOpponent();
		if (OT.equals("fire") || OT.equals("rock") || OT.equals("ground")) {
			System.out.println("Super effective!");
		} else if (OT.equals("grass") || OT.equals("water") || OT.equals("dragon")) {
			System.out.println("Not very effective...");
		} else {
			System.out.println("Normal effect.");
		}
	}
	public void typeBonusD() {
		String OT = getOpponent();
		if (OT.equals("electric") || OT.equals("grass")) {
			System.out.println("Super effective!");
		} else if (OT.equals("steel") || OT.equals("fire") || OT.equals("water") || OT.equals("ice")) {
			System.out.println("Not very effective...");
		} else {
			System.out.println("Normal effect.");
		}
	}
}
