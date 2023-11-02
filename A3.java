package test;

import javax.swing.*;

public class A3 {
	public static void main(String[] args) {
		x: while (true) {
			try {
				String s1 = JOptionPane.showInputDialog("Enter the first integer: ");
				int num1 = Integer.parseInt(s1);
				y: while (true) {
					try {
						String s2 = JOptionPane.showInputDialog("Enter the second integer: ");
						int num2 = Integer.parseInt(s2);
						int sum = num1 + num2;
						JOptionPane.showMessageDialog(null, "Sum of " + num1 + " and " + num2 + " is: " + sum);
						if (true) {
							break x;
						}
							break y;						
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "read the number again");
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "read the number again");
			}

		}
	}
}
