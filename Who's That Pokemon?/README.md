# Who's That Pokemon?
## Synopsis
This program is a guessing game based on the popular Pokemon series. The program gives information about a given Pokemon and the user has to make a guess based on it.
## How to Run
The program needs Game.java and Pokemon.java to run. To start the game, run the Game file. Simply follow the instructions given on the console to play and stop the game.
[Example run](CodeRunning.png)
## Code Example
This code snippet determines whether the game plays again or ends based on the user's input.
```
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
```
