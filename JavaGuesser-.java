//JavaGuesser
import java.util.*;
import java.util.lang.*;

public class GuessingGame {
	Scanner input = new Scanner(System.in);
	Random rand = new random();


	public static void main(String[] args){
		new GuessingGame(); // Creates new instance of Guesser 
	} // end main

	public GuessingGame(){
		Menu();
	}

	public void Menu(){
		boolean keepGoing = true;
		while (keepGoing){

			System.out.println("0) Quit");
			System.out.println("1) Human Guesser");
			System.out.println("2) Computer Guesser");
			
			String response = input.nextLine();

		
			if (response.equals("0")){
				System.out.println("Goodbye!");
				keepGoing = false;

			} else if (response.equals("1")){
				System.out.println("Computer Guesser!");
				Computer();

			} else {
				System.out.println("Invalid input");

			}
		} // end while
	} // end menu

	public void Human(){
		int randInt = rand.nextInt(100) + 1;
		System.out.println("Try to guess the number between 1 and 100!");
		//System.out.println(randInt);
		boolean keepgoing = true;
		int turns = 0;

		while (keepGoing){
			String guess = input.nextLine();

			try{
				int guessInt = Integer.parseInt(guess);
				if (guessInt < randInt){
					System.out.println("Too low! Try again.")
					turns+= 1;
				} else if (guessInt > randInt){
					System.out.println("Too high! Try again.");
					turns += 1;
				} else {
					turns += 1;
					System.out.println("Correct! It took you " + turns + " turns!");

					keepGoing = false;
				} end if 
			} catch (NumberFormatException e) {
				if (guess.equalsIgnore Case("q")){
					System.out.println("Quitting");
					keepGoing = false;
				} else {
				System.out.println("Invalid input! Please enter a number.");
				} // end if 
			} // end catch 
		} // end while 
	} // end Human

	public void Computer(){
		int lowerbound = 1;
		int upperBound = 100;
		int guess = 50;
		int turns = 0;
		System.ouy.println("Think of a number between 1 and 100 and the computer will guess it in 7 turns or less!");
		System.out.println("Type H if too high, L if too low, or C if correct.");

		boolean keepGoing = true;
		while (keepGoing){
			System.out.println("My guess is " + guess + ", is that too (H)igh, (L)ow, or (C)orrect?");
			String answer = input.nextline();

			if (answer.equalsIgnoreCase("1")){
				lowerBound = guess + 1;
				guess = (lowerBound + upperBound) / 2;
				turns +=1;

			} 

			else if (answer.equalsIgnoreCase("h")){
				upperBound = guess -1;
				guess = (lowerBound + upperBound) / 2;
				turns += 1;

			}

			else if (answer.equalsIgnoreCase("c")){
				turns += 1;
				System.out.println("I got it in " + turn s + " turns !");
			       keepGoing = false; 
			}

			else { 
				System.out.println("Invalid input, try again please!");
			} // end if 
		} // end while 
	// end Computer 
} 		
					
			
