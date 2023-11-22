package exercise_TreasureHuntGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TreasureHuntGame {

	public static void main(String[] args) {
		
		Map<String, Location> locations = new HashMap<>();
		List<Treasure> treasures = new ArrayList<>();
		Set<Treasure> inventory = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		
		locations.put("Beach", new Location("Beach", "You are on a beautiful beach with golden sand."));
		locations.put("Forest", new Location("Forest", "You find yourself in a dense forest surrounded by tall trees."));
	    locations.put("Mountain", new Location("Mountain", "You are standing on top of a high mountain, enjoying the breathtaking view."));
	    locations.put("City", new Location("City", "You are in the midst of a bustling city filled with skyscrapers and people rushing around."));
	    locations.put("Cave", new Location("Cave", "You venture into a dark cave, where mysterious echoes bounce off the walls."));
	    locations.put("River", new Location("River", "You stand by a serene river, listening to the gentle flow of water as it soothes your senses."));
	    
	    treasures.add(new Treasure("Gold coin", "A shiny gold coin", 10));
	    treasures.add(new Treasure("Ruby", "A sparkling red gemstone", 20));
        treasures.add(new Treasure("Diamond", "A dazzling diamond", 30));
        treasures.add(new Treasure("Emerald", "A vibrant green emerald", 25));
        treasures.add(new Treasure("Sapphire", "A deep blue sapphire", 22));
        treasures.add(new Treasure("Pearl", "A lustrous white pearl", 15));
        
        String currentLocation = "Forest";
        int choice = 0;
        while(choice != 3) {
        	try {
        	Location current = locations.get(currentLocation);
        	
        	if(current != null) {
        	System.out.println(current.getName() + current.getLocation());
       
        	} else {
        		System.out.println("Invalid location: " + currentLocation);
        	}
        	
        	System.out.println("\nDo you want to"
        				+ "\n(1) Pick up a Treasure"
        				+ "\n(2) Move to the next location"
        				+ "\n(3) Quit?");
        	
        	choice = scanner.nextInt();
        	scanner.nextLine();
        	
        	switch(choice) {
        	case 1: 
        		System.out.println("\n(1) Pick up a Treasure\n");
        		Methods.showTreasures(treasures, inventory);
        		break;
        		
        	case 2: 
        		System.out.println("\n(2) Move to the next location");
        		currentLocation = Methods.changeLocations(locations);
        		break;
        		
        	case 3: 
        		System.out.println("\n(3) Quit");
        		Methods.showInventory(inventory);
        		Methods.calculateTotalValue(inventory);
        		System.out.println("\nBye. See you next time!");
        		break;
        	
        	default: 
        		System.out.println("\nInvalid choice!");
        		scanner.nextLine();
        	}
        	}catch(InputMismatchException e) {
        		System.out.println("\nInvalid input!");
        		scanner.nextLine();
        	}
        	
        }
		

	}

}
