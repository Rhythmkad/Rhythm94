/*
NAME: Rhythm Kad And Sandeep Kaur
STUDENT NUMBER: A00245057 And A00245516
DESCRIPTION: Model class to store the dice and it's details
*/
import java.util.Random;

public class Dice {

	// to generate random side
	private Random r = new Random();

	// dice type
	private String type;

	// no of sides
	private int sides;

	// currently upward facing side
	private int currentSide;

	// no arg constructor
	public Dice() {

		this.type = "d6";
		this.sides = 6;
		this.currentSide = 1 + r.nextInt(sides);
	}
	// 1-arg constructor 
	// sides - Number of sides in dice
	public Dice(int sides) {

		this.type = String.format("d%d", sides);
		this.sides = sides;
		this.currentSide = 1 + r.nextInt(sides);
	}

	// 2-arg constructor
	// sides - Number of sides in dice
	// type - Custom Dice type
	public Dice(String type, int sides) {

		this.type = type;
		this.sides = sides;
		this.currentSide = 1 + r.nextInt(this.sides);
	}

	// set the dice to a random number, limit it to the sides count.
	public void roll() {
		this.currentSide = 1 + r.nextInt(this.sides);
	}

	// set current side of dice
	public void setCurrentSide(int side) {
		this.currentSide = side;
	}

	// get current side of dice
	public int getCurrentSide() {
		return this.currentSide;
	}

	// get type of the dice
	public String getType() {
		return this.type;
	}

	// get sides of the dice
	public int getSides() {
		return this.sides;
	}

}
