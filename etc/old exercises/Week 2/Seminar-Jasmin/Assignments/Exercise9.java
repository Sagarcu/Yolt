import java.util.Scanner;

/**
 * Exercise 5: User input.
 */
public class Exercise9 {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.print("Hello, ");
		System.out.println(name);
	}
}
