
public class PairOfdice {
	private Die die1, die2;
public PairOfdice() {
	die1 = new Die();
	die2 = new Die();
	}
public int roll() {
	return die1.roll() + die2.roll();
	}
public int getTotalFaceValue() {
	return die1.getFaceValue() + die2.getFaceValue();
	}
public int getdie1FaceValue() {
	return die1.getFaceValue();
	}
public int getdie2FaceValue() {
	return die2.getFaceValue();
	}
public String ToString() {
	return "Die 1: " + die1.getFaceValue() + "  Die 2:" + die2.getFaceValue();
	}
}
