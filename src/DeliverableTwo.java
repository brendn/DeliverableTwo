import java.util.Random;
import java.util.Scanner;

/**
 * DeliverableTwo
 * 
 * @author Brendan
 */
public class DeliverableTwo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guess which will have more: heads or tails?");
		String headsOrTailsGuess = scan.nextLine().toLowerCase();
		
		//Check whether or not heads or tails was entered
		if (!(headsOrTailsGuess.equals("heads") || headsOrTailsGuess.equals("tails"))) {
			System.out.println("Invalid input. Please enter heads or tails.");
			scan.close();
			return;
		}
		
		//Check if the user entered heads or tails
		boolean isHeads = headsOrTailsGuess.equals("heads");

		//Prompt the user for how many flips need to be done
		System.out.println("How many times shall we flip a coin?");
		int numberOfFlips = scan.nextInt();
		int correctCount = 0;
		
		//Close the scanner since we're done with it now
		scan.close();
		
		Random rand = new Random();
		
		//Iterate through each flip
		for (int flips = 0; flips < numberOfFlips; flips++) {
			//This being true will count as heads, false will be tails.
			boolean heads = rand.nextBoolean();
			System.out.println(heads ? "heads" : "tails");
			correctCount += (heads && isHeads ? 1 : !heads && !isHeads ? 1 : 0);
		}
		
		//Print the result
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).");
		float percentage = (correctCount * 100.0F) / numberOfFlips;
		System.out.println("That's " + percentage + "%.");
	}
}
