package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.

	private void showHoroscope(Zodiac zodiac) {
		if(zodiac == Zodiac.ARIES) {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else if(zodiac == Zodiac.CANCER) {
			JOptionPane.showMessageDialog(null, "Cancer is is love, cancer is life.");
		} else if(zodiac == Zodiac.TAURUS) {
			JOptionPane.showMessageDialog(null, "You're a stubborn boi.");
		} else if(zodiac == Zodiac.GEMINI) {
			JOptionPane.showMessageDialog(null, "You have a second face you freak.");
		} else if() {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else if() {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else if() {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else if() {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else if() {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else if() {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else if() {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		}
	}
	
	// 3. Make a main method to test your method
	
}
