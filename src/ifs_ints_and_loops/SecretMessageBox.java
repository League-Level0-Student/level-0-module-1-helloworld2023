package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
	
	// 1. Set a password in a String variable
String password = "1243";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
String message = JOptionPane.showInputDialog("Type in a secret message.");
// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
JOptionPane.showMessageDialog(null, "(Next user) Only you can see the secret message if you get the password correct.");
String guess = JOptionPane.showInputDialog("Can you guess what the password is?");
	// 4. If their guess matches the password, show them the secret message
if (guess.equals("1243")) {
	JOptionPane.showMessageDialog(null, message);
}
	// 5. If the password does not match, pop-up "INTRUDER!!"
else {
	JOptionPane.showMessageDialog(null, "Intruder!");
}
	}
}