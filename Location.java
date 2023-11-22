package exercise_TreasureHuntGame;

public class Location {
	
	private String name;
	private String location;
	
	public Location(String name, String location) {
	
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return "\nLocation: " + name ;
	}

	public String getLocation() {
		return "\nDescription: " + location;
	}
	@Override
	public String toString() {
		return "\nName: " + name + "\nLocation: " + location;
	}
	
	
	

}
