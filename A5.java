package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> numbers = new HashSet<>();
		System.out.print("Input the integers (space-separated): ");
		String input = sc.nextLine();
	String[] inputArray = input.split(" ");
	
		try {
			for (String numStr : inputArray) {
				int num = Integer.parseInt(numStr);
				if (numbers.contains(num)) {
					throw new DuplicateNumberException(num);
				}
				numbers.add(num);
			}
			System.out.println("No duplicate numbers!");
		} catch (NumberFormatException e) {
			System.err.println("Error: Invalid input. Please enter valid integers.");
		} catch (DuplicateNumberException e) {
			System.err.println("Error: Duplicate number found: " + e.getDuplicateNumber());
		}
		sc.close();
	}
}

class DuplicateNumberException extends Exception {
	private int duplicateNumber;

	public DuplicateNumberException(int num) {
		duplicateNumber = num;
	}

	public int getDuplicateNumber() {
		return duplicateNumber;
	}
}
