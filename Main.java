package simpleConsoleCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean running = true;
		double one = 0;
		double two = 0;
		Scanner scanner = new Scanner(System.in);
		int choice;
		while (running) {
			System.out.println("Enter a number");
			one = scanner.nextInt();
			System.out.println("Enter another number");
			two = scanner.nextInt();
			System.out.println(
					"Would you like to do?\n1.add\n2.subtract\n3.multiply\n4.divide\n5.end\n(pick a number)");

			choice = scanner.nextInt();
			// scanner.nextLine(); // Clear leftover newline

			switch (choice) {
			case 1:
				System.out.println(one + two + "\n");
				break;
			case 2:
				System.out.println(one - two + "\n");
				break;

			case 3:
				System.out.println(one * two + "\n");
				break;

			case 4:
				System.out.println(one / two + "\n");
				break;

			case 5:
				running = false;
				break;

			default:
				System.out.println("Please choose one of the five options");
				break;
			}
		}
	}

}
