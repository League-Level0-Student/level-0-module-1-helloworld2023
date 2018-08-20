package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Remarkable {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Type in your name");
		
	if (name.equals("Rounak")) {
		JOptionPane.showMessageDialog(null, "You taught me some things I had forgotten from my workshop!");
	}
	
	if (name.equals("Aiden")) {
		JOptionPane.showMessageDialog(null, "I wouldn't have guessed that you liked anime:)");
	}
	
}
}
