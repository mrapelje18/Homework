
public abstract class Pokemon {
	private String name;
	private String type;
	private String opponentType;
	public Pokemon(String name, String type, String opponentType) {
		this.name = name;
		this.type = type;
		this.opponentType = opponentType;
	}
	public String toString() {
		return name + " is " + type + " type.";
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	public String getOpponent() {
		return opponentType;
	}
	public abstract void typeBonusA();
	public abstract void typeBonusD();
}
