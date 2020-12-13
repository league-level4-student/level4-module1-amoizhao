package _05_Enum_Stuff;

import javax.swing.JOptionPane;


public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void display (Zodiac zodiac) {
		switch(zodiac) {
		case ARIES: 
			JOptionPane.showMessageDialog(null, "Bold and ambitious, Aries dives headfirst into even the most challenging situations.");
			break;
		case TAURUS: 
			JOptionPane.showMessageDialog(null, "Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors.");
			break;
		case GEMINI: 
			JOptionPane.showMessageDialog(null, "Playful and intellectually curious, Gemini are constantly juggling a variety of passions, hobbies, careers, and friend groups");
			break;
		case CANCER: 
			JOptionPane.showMessageDialog(null, "Cancers are highly intuitive and their psychic abilities manifest in tangible spaces");
			break;
		case LEO: 
			JOptionPane.showMessageDialog(null, "Leos delighted to embrace their royal status: Vivacious, theatrical, and passionate, Leos love to bask in the spotlight and celebrate themselves.");
			break;
		case VIRGO: 
			JOptionPane.showMessageDialog(null, "Virgos are logical, practical, and systematic in their approach to life.");
			break;
		case LIBRA: 
			JOptionPane.showMessageDialog(null, "Libra is obsessed with symmetry and strives to create equilibrium in all areas of life.");
			break;
		case SCORPIO: 
			JOptionPane.showMessageDialog(null, "Scorpios are resourceful, brave, passionate, and stubborn, but a true friend");
			break;
		case SAGITTARIUS: 
			JOptionPane.showMessageDialog(null, "Sagittarius launches its many pursuits like blazing arrows, chasing after geographical, intellectual, and spiritual adventures.");
			break;
		case CAPRICORN: 
			JOptionPane.showMessageDialog(null, "Capricorns are skilled at navigating both the material and emotional realms.");
			break;
		case AQUARIUS: 
			JOptionPane.showMessageDialog(null, "Aquarius is represented by the water bearer, the mystical healer who bestows water, or life, upon the land. Accordingly, Aquarius is the most humanitarian astrological sign.");
			break;
		case PISCES: 
			JOptionPane.showMessageDialog(null, "Pisces has absorbed every lesson — the joys and the pain, the hopes and the fears");
			break;
		default: 
			System.out.println("Well oops");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		display(Zodiac.GEMINI);
	}
	
}
