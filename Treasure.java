package exercise_TreasureHuntGame;

public class Treasure {
	
	private String name;
	private String description;
	private int value;
	
	public Treasure(String name, String description, int value) {
		this.name = name;
		this.description = description;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return description;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nDescription: " + description + "\nValue: " + value + " points\n";
	}


	
	

}
