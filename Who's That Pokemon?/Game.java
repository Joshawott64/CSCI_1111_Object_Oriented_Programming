/*
 * Author: Joshua Gray
 * Date: 8/10/21
 * 
 * This program is the final project for the Object Oriented Programming 
 * course. This program is a guessing game where the objective is for 
 * the user to guess which Pokemon the program is talking about.
 */
import java.util.Scanner;
import java.util.*;
public class Game {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		
		// Construct Pokemon objects
		Pokemon[] pokemon = new Pokemon[20];
		pokemon[0] = new Pokemon("Riolu", "Fighting", "Sinnoh", 1, "Emanation", false);
		pokemon[1] = new Pokemon("Mewtwo", "Psychic", "Kanto", 0, "Genetic", true);
		pokemon[2] = new Pokemon("Greninja", "Water/Dark", "Kalos", 3, "Ninja", false);
		pokemon[3] = new Pokemon("Charizard", "Fire/Flying", "Kanto", 3, "Flame", false);
		pokemon[4] = new Pokemon("Rayquaza", "Dragon/Flying", "Hoenn", 0, "Sky High", true);
		pokemon[5] = new Pokemon("Umbreon", "Dark", "Johto", 2, "Moonlight", false);
		pokemon[6] = new Pokemon("Oshawott", "Water", "Unova", 1, "Sea Otter", false);
		pokemon[7] = new Pokemon("Clawitzer", "Water", "Kalos", 2, "Howitzer", false);
		pokemon[8] = new Pokemon("Elekid", "Electric", "Johto", 1, "Electric", false);
		pokemon[9] = new Pokemon("Xerneas", "Fairy", "Kalos", 0, "Life", true);
		pokemon[10] = new Pokemon("Corsola", "Water/Rock", "Johto", 0, "Coral", false);
		pokemon[11] = new Pokemon("Scrafty", "Dark/Fightin", "Unova", 2, "Hoodlum", false);
		pokemon[12] = new Pokemon("Oddish", "Grass/Poison", "Kanto", 1, "Weed", false);
		pokemon[13] = new Pokemon("Charjabug", "Bug/Electric", "Alola", 2, "Battery", false);
		pokemon[14] = new Pokemon("Mamoswine", "Ice/Ground", "Sinnoh", 3, "Twin Tusk", false);
		pokemon[15] = new Pokemon("Absol", "Dark", "Hoenn", 0, "Disaster", false);
		pokemon[16] = new Pokemon("Lunala", "Psychic/Ghost", "Alola", 3, "Moone", true);
		pokemon[17] = new Pokemon("Grovyle", "Grass", "Hoenn", 2, "Wood Gecko", false);
		pokemon[18] = new Pokemon("Dialga", "Steel/Dragon", "Sinnoh", 0, "Temporal", true);
		pokemon[19] = new Pokemon("Pikachu", "Electric", "Kanto", 2, "Mouse", false);
		
		// Continue-loop variable
		int e = 0;
		
		while (e != 1) {
			// Select random Pokemon based on index
			int i = (int) (Math.random() * pokemon.length);
			String guess = "e";
			// Header
			System.out.println("---------------------");
			System.out.println(" Who's That Pokemon? ");
			System.out.println("---------------------");
			System.out.println();

			System.out.println("This Pokemon is " + pokemon[i].getType() + " type.");
			System.out.println();
			System.out.print("Enter a name or enter 'c' to continue: ");
			guess = input.next();
			if (guess.equalsIgnoreCase(pokemon[i].getName())) {
				System.out.println("Congrats! You got it!");
			}
			System.out.println();
			
			if (!guess.equalsIgnoreCase(pokemon[i].getName())) {
				System.out.println("This Pokemon comes from the " + pokemon[i].getRegion() + 
						" region.");
				System.out.println();
				System.out.print("Enter a name or enter 'c' to continue: ");
				guess = input.next();
				if (guess.equalsIgnoreCase(pokemon[i].getName())) {
					System.out.println("Congrats! You got it!");
				}
				System.out.println();
			}
			
			if (!guess.equalsIgnoreCase(pokemon[i].getName())) {
				if (pokemon[i].isLegendary() == false) {
					System.out.println("This Pokemon is not a legendary");
				}
				else {
					System.out.println("This Pokemon is a legendary");
				}
				System.out.println();
				System.out.print("Enter a name or enter 'c' to continue: ");
				guess = input.next();
				if (guess.equalsIgnoreCase(pokemon[i].getName())) {
					System.out.println("Congrats! You got it!");
				}
				System.out.println();
			}
			
			if (!guess.equalsIgnoreCase(pokemon[i].getName())) {
				if (pokemon[i].getEvoNum() == 1 || pokemon[i].getEvoNum() == 2 || 
						pokemon[i].getEvoNum() == 3) {
					System.out.println("This Pokemon is number " + pokemon[i].getEvoNum() + 
							" in its evolution line.");
					System.out.println();
					System.out.print("Enter a name or enter 'c' to continue: ");
					guess = input.next();
					if (guess.equalsIgnoreCase(pokemon[i].getName())) {
						System.out.println("Congrats! You got it!");
					}
					System.out.println();
				}
				else {
					System.out.println("This Pokemon has no evolution line.");
					System.out.println();
					System.out.print("Enter a name or enter 'c' to continue: ");
					guess = input.next();
					if (guess.equalsIgnoreCase(pokemon[i].getName())) {
						System.out.println("Congrats! You got it!");
					}
					System.out.println();
				}
			}

			if (!guess.equalsIgnoreCase(pokemon[i].getName())) {
				System.out.println("This Pokemon is classified as the " + 
						pokemon[i].getClassification() + " Pokemon.");
				System.out.println();
				System.out.print("Enter a name or enter 'c' to continue: ");
				guess = input.next();
				if (guess.equalsIgnoreCase(pokemon[i].getName())) {
					System.out.println("Congrats! You got it!");
				}
				System.out.println();
			}
			
			while (!guess.equalsIgnoreCase(pokemon[i].getName())) {
				try {
					System.out.println("All out of hints! Would you like to give up?");
					System.out.print("Enter 1 for yes or 2 for no: ");
					int choice = input.nextInt();
				
					if (choice == 1) {
						System.out.println();
						System.out.println("This Pokemon is " + pokemon[i].getName() + ".");
						if (pokemon[i].getName() == "Pikachu") {
							System.out.println();
							System.out.println("Wait, seriously? You missed PIKACHU?!");
							System.out.println("I can't believe you call yourself a Pokemon fan!");
							System.out.println("My grandma could figure that out quicker than you!");
							System.out.println("Go pray to Lord Helix because you need it!");
							System.out.println("Now get OUT!");
							System.exit(0);
						}
						guess = pokemon[i].getName();
						System.out.println();
					}
					else if (choice == 2) {
						System.out.println();
						System.out.print("Guess again: ");
						guess = input.next();
						if (guess.equalsIgnoreCase(pokemon[i].getName())) {
							System.out.println("Congrats! You got it!");
						}
						System.out.println();
					}
				}
				catch (InputMismatchException ex) {
					System.out.println();
					System.out.println("Try again. (Incorrect input: an integer is required");
					System.out.println();
					input.nextLine();
				}
			}
			
				// Play again or quit
			do {
				try {
					System.out.print("Would you like to play again? Enter any number to play "
							+ "again or enter 1 to quit: ");
					e = input.nextInt();
					if (e == 1) {
						System.out.println();
						System.out.println("Thanks for playing!");
						System.exit(0);
					}
					System.out.println();
				}
				catch (InputMismatchException ex) {
					System.out.println();
					System.out.println("Try again. (Incorrect input: an integer is required)");
					System.out.println();
					input.nextLine();
				}
			} while (!guess.equalsIgnoreCase(pokemon[i].getName()));
		}
	}

}
