package test;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter a string: ");
			String inputString = sc.nextLine();
			int vowelCount = countVowels(inputString);
			System.out.println("Number of vowels in the string: " + vowelCount);
		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
	public static int countVowels(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = Character.toLowerCase(input.charAt(i));
			try {
				if ("aeiou".contains(String.valueOf(c))) {
					count++;
				}
			} catch (Exception e) {
				System.err.println("Error while counting vowels: " + e.getMessage());
			}
		}
		return count;
	}
}
