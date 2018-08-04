package extra;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {

		String birthday = JOptionPane.showInputDialog("When is your birthday? (mm/dd)");
		if (birthday.equals("8/4")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Merry Unbirthday!");
		}

	}

}
