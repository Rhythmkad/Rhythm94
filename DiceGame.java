/*
NAME : Rhythm Kad And Sandeep Kaur
STUDENT NUMBER : A00245057 And A00245516
DESCRIPTION: Main Class to check the functionality of the Dice.java class
*/
public class DiceGame {

	// method to check all the the dice have same current side.
	public static boolean is5aKind(Dice dices[]) {
		for (int i = 1; i < dices.length; i++) {
			if (dices[0].getCurrentSide() != dices[i].getCurrentSide())
				return false;
		}
		return true;
	}

	public static void main(String args[]) {

		// Testing all the constructors
		System.out.println("Creating a default d6...");
		Dice defaultDice = new Dice();
		System.out.println("Creating a d20...");
		Dice d20Dice = new Dice(20);
		System.out.println("Creating percentile tile (a special d10)...");
		Dice percentileDice = new Dice("Percentile", 10);

		// printing current side for 3 dices.
		System.out.println(
				String.format("The current side up for %s is %d", defaultDice.getType(), defaultDice.getCurrentSide()));
		System.out.println(
				String.format("The current side up for %s is %d", d20Dice.getType(), d20Dice.getCurrentSide()));
		System.out.println(String.format("The current side up for %s is %d", percentileDice.getType(),
				percentileDice.getCurrentSide()));
		System.out.println("\nTesting the roll method\n");

		
		// rolling each dice and printing current side.
		
		System.out.println(String.format("Rolling the %s...", defaultDice.getType()));
		defaultDice.roll();
		if (defaultDice.getCurrentSide() == defaultDice.getSides()) {
			System.out.println(String.format("YAY! It's a %d", defaultDice.getSides()));
		} else {
			System.out.println(String.format("The new values is %d", defaultDice.getCurrentSide()));
		}
		
		System.out.println(String.format("Rolling the %s...", d20Dice.getType()));
		d20Dice.roll();
		if (d20Dice.getCurrentSide() == d20Dice.getSides()) {
			System.out.println(String.format("YAY! It's a %d", d20Dice.getSides()));
		} else {
			System.out.println(String.format("The new values is %d", d20Dice.getCurrentSide()));
		}
		System.out.println(String.format("Rolling the %s...", percentileDice.getType()));
		percentileDice.roll();
		if (percentileDice.getCurrentSide() == percentileDice.getSides()) {
			System.out.println(String.format("YAY! It's a %d", percentileDice.getSides()));
		} else {
			System.out.println(String.format("The new values is %d", percentileDice.getCurrentSide()));
		}

		// setting d20 to max
		System.out.println(String.format("\nSetting the %s to show %d...",d20Dice.getType(),20));
		d20Dice.setCurrentSide(20);
		System.out.println(String.format("The side up is now %d. Finally.",d20Dice.getCurrentSide()));
		
		
		System.out.println("\n-----\nBONUS\n-----");
		System.out.println("Creating 5 d6...");
		// storing all the dices in an array
		Dice[] dices = new Dice[5];
		for (int i = 0; i < dices.length; i++) {
			// instantiating each dice in array
			dices[i] = new Dice();
		}
		// counter to keep track of total rolls
		int rolls = 0;
		
		// call is5aKind to check the terminating condition
		while (!is5aKind(dices)) {
			// roll every dice
			for (int i = 0; i < dices.length; i++) {
				dices[i].roll();
			}
			// increment 5 to total roll count. Since we are rolling every dice.
			rolls += 5;
		}
		System.out.println(String.format("YAHTZEE! It took %d rolls", rolls));
	}
}
