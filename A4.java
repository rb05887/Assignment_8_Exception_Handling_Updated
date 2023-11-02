package test;

import java.util.Random;
import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		int[] randomArray = generateRandomArray(100);
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Enter an index (0-99): ");
				int index = sc.nextInt();

				if (index < 0 || index >= randomArray.length) {
					throw new IndexOutOfBoundsException("Out of Bounds");
				}

				int element = randomArray[index];
				System.out.println("Element at index " + index + " is: " + element);
				break; 
			} catch (IndexOutOfBoundsException e) {
				System.err.println(e.getMessage());
			} catch (java.util.InputMismatchException e) {
				System.err.println("Invalid input. Please enter a valid index.");
				sc.nextLine(); 
			}
		}
		sc.close();
	}
	public static int[] generateRandomArray(int size) {
		int[] array = new int[size];
		Random random = new Random();

		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt(1000); 
		}
		return array;
	}
}
