package WhatIsIt;

import java.util.Scanner;

public class WhatIsIt {

	protected static String input;

	public static void main(String[] args) {

		getInput();

		createOutput();
	}

	private static void getInput() {
		Scanner	scanner = new Scanner(System.in);
		System.out.println("input a word");
		input = scanner.nextLine();
	}

	private static void createOutput() {
		InputReinterpreterService service = new InputReinterpreterService(input);
		String sequence = service.execute();

		System.out.println("\n\nhere is your extremely useful new character sequence");
		System.out.println(sequence);
	}

}
