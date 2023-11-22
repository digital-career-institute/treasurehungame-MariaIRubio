package exercise_TreasureHuntGame;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Methods {

	public static void showTreasures(List<Treasure> treasures, Set<Treasure> inventory) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		for (Treasure treasure : treasures) {
			System.out.println(i + "." + treasure.toString());
			i++;
		}
		System.out.print("Write the number of the Treasure you want to pick... ");
		int choice = scanner.nextInt();
		scanner.nextLine();

		if (choice >= 1 && choice <= treasures.size()) {
			Treasure chosenTreasure = treasures.get(choice - 1);
			System.out.println("\nYour Treasure\n" + chosenTreasure);

			if (!inventory.contains(chosenTreasure)) {
				inventory.add(chosenTreasure);
				System.out.println("\nTreasure added to your inventory.");
			} else {
				System.out.println("\nYou already own this Treasure!");
			}
		} else {
			System.out.println("\nTreasure not found!");
		}
	}

	public static void showInventory(Set<Treasure> inventory) {
		System.out.println("\nYour inventory\n");

		if (!inventory.isEmpty()) {
			inventory.forEach(System.out::println);
		} else {
			System.out.println("You still don't have any possesions.");
		}
	}

	public static int calculateTotalValue(Set<Treasure> inventory) {
		int totalValue = 0;
		int sumOfValues = inventory.stream().mapToInt(t -> t.getValue()).sum();
		System.out.println("\nTotal Value of your Inventory: " + sumOfValues + " points.");
		return totalValue + sumOfValues;
	}

	public static String changeLocations(Map<String, Location> locations) {
		Scanner scanner = new Scanner(System.in);

		for (Map.Entry<String, Location> entry : locations.entrySet()) {
			String key = entry.getValue().getName();
			String value = entry.getValue().getLocation();
			System.out.println(key + value);
		}
		System.out.println("\nWhere do you want to go? Write the location (Ex. Beach): ");
		String newLocation = scanner.nextLine();

		return newLocation;
	}

}
