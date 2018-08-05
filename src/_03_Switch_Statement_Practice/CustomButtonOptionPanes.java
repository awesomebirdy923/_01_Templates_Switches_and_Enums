package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		
		switch(choice) {
		case "Sunday":
			System.out.println("I can't think of an idea for this one.");
			break;
		case "Monday":
			System.out.println("Many people hate these.");
			break;
		case "Tuesday":
			System.out.println("TACOS!");
			break;
		case "Wednesday":
			System.out.println("Tortillllllla");
			break;
		case "Thursday":
			System.out.println("WEFJIEWFJEWOPFJEWJFCOEWNTREPvnt4ebvuyn58io4pv 9jy ");
			break;
		case "Friday":
			System.out.println("My favorite day of the week");
			break;
		case "Saturday":
			System.out.println("I'm going to sit on my rear end and play on a Christian Minecraft Server for 12 straight hours.");
			break;
		}
		
		//use a switch statement to do something cool for each option
		
	}
}
