import java.util.Scanner;

public class ChemJava {
	public static void main(String[] args) {
		System.out.println("Chapter 2: Chemical Formulas  = 1");
		System.out.println("Chapter 5: Thermochemistry    = 2");
		System.out.println("Chapter 6-7: Light            = 3");
		System.out.println("Chapter 8-9: Chemical Bonding = 4");
		System.out.println("Chapter 11: Gases             = 5");
		System.out.println("Chapter 14: Solutions         = 6");
		System.out.println("Please enter the corresponding number of the chapter you would like to enter: ");
		
		Scanner input = new Scanner(System.in);
		int chapter = input.nextInt();
		
		if (chapter == 1) {
		}
		
		if (chapter == 2) {
		}
		
		if (chapter == 3) {
		}
		
		if (chapter == 4) {
		}
		
		if (chapter == 5) {
			System.out.println("PV=nRT");
		}
		
		if (chapter == 6) {
		}
	}
}