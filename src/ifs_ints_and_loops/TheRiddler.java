package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("Paul's height is six feet, he's an assistant at a butcher's shop, "
		+ "and wears size 9 shoes. What does he weigh?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("meat")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is meat.");
}
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog("Imagine you are in a dark room. How do you get out?");
if (riddle2.equals("Stop imagining")) {
	
}
		// 2. Make a pop up to show the score.
	
	}
}

