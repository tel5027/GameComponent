/*
 * Version:
 * $Id:$
 * 
 * Revisions:
 * $Log:$
 * 
 */

package gamecomponent;

import java.util.Random;

/**
 * @author Thomas LaSalle
 *
 */
public class Dice implements BaseComponent {
	
	private int id;
	private int sides;
	private Random die = new Random();
	public static final int NORM_SEED = 6;
	
	public Dice() {
		this.sides = NORM_SEED;		
	}
	
	public Dice(int sides) {
		if(sides <= 0) {
			this.sides = 1;
		}
		else {
			this.sides = sides;
		}
						
	}
	
	@Override
	public int getID() {
		
		return id;
	}

	@Override
	public void setID(int id) {
		
        this.id = id;
	}
	
	public int getDiceSides() {
		
		return sides;
	}
	
	public int roll() {
		
		return die.nextInt(sides) + 1;
	}
	
	public String toString() {
		return "Id: " + id + ", Sides: " + sides;
	}
	
	public static void main(String[] args) {
		//Test
		Dice testDie = new Dice();
		Dice testDieTwo = new Dice(50);
		testDie.setID(1);
		testDieTwo.setID(2);
		
		System.out.println("Roll testDie: " + testDie.roll());
		System.out.println("Roll testDieTwo: " + testDieTwo.roll());
		
		System.out.println(testDie);
		System.out.println(testDieTwo);
	}

}
