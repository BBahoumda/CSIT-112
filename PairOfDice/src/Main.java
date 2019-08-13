
public class Main {
	public static void main(String[] args) {
		PairOfdice dice = new PairOfdice();
		int boxcars = 0;
	final int NUM_ROLLS = 1000, BOX_CAR = 12; 
		for( int i = 0; i < NUM_ROLLS; i++)
			if(dice.roll() == BOX_CAR)
				boxcars++;
	System.out.println("Amount Rolled " + NUM_ROLLS + " pairs " + boxcars + " boxcars.");
	}
}