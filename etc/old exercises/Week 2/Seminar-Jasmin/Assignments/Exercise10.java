/**
 * Exercise 6: Instance methods and fields
 */
public class Exercise10 {
	private int valueOne;
	private int valueTwo;
	
	public static void main(String[] args) {
		Exercise10 e = new Exercise10();
		e.setValueOne(42);
		System.out.println(e.getSumOfValues());
	}

	public Exercise10() {
		valueTwo = 99;
	}

	public void setValueOne( int a ) {
		valueOne = a;
	}

	public int getSumOfValues() {
		return valueOne + valueTwo;
	}
}
