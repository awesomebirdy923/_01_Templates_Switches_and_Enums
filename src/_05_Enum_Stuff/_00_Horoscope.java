package _05_Enum_Stuff;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.

	private static void showHoroscope(Zodiac zodiac) {
		if(zodiac == Zodiac.ARIES) {
			JOptionPane.showMessageDialog(null, "You're impuslive.");
		} else if(zodiac == Zodiac.CANCER) {
			JOptionPane.showMessageDialog(null, "Cancer is is love, cancer is life.");
		} else if(zodiac == Zodiac.TAURUS) {
			JOptionPane.showMessageDialog(null, "You're a stubborn boi.");
		} else if(zodiac == Zodiac.GEMINI) {
			JOptionPane.showMessageDialog(null, "You have a second face you freak.");
		} else if(zodiac == Zodiac.LEO) {
			JOptionPane.showMessageDialog(null, "You have too much pride.");
		} else if(zodiac == Zodiac.VIRGO) {
			JOptionPane.showMessageDialog(null, "Successful.");
		} else if(zodiac == Zodiac.LIBRA) {
			JOptionPane.showMessageDialog(null, "You're adventurous which means you'll eventually kill yourself while getting bitten in the face by a grizzly bear, a python, and a vulture at the same time.");
		} else if(zodiac == Zodiac.SCORPIO) {
			JOptionPane.showMessageDialog(null, "You have a pointy tail.");
		} else if(zodiac == Zodiac.SAGITTARIUS) {
			JOptionPane.showMessageDialog(null, "You're cold.");
		} else if(zodiac == Zodiac.CAPRICORN) {
			JOptionPane.showMessageDialog(null, "You're hardworking.");
		} else if(zodiac == Zodiac.AQUARIUS) {
			JOptionPane.showMessageDialog(null, "You're a trend setter.");
		} else {
			JOptionPane.showMessageDialog(null, "You're a fish.");
		}
	}
	
	// 3. Make a main method to test your method
	
	public static void main(String[] args) {
		showHoroscope(Zodiac.LIBRA);
	}
	
}
