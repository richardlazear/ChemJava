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
			final double R = 0.08205746; // Gas constant "R"
			System.out.println("Which equation would you like to use?");
			System.out.println("PV=nRT = 1");
			
			int equationNumber = input.nextInt();
			
			if (equationNumber == 1) {
				System.out.println("Which variable is your unknown...P, V, n, or T? ");
				String unknown = input.next();
				
				if (unknown.equals("P")) {
					// TODO: make sure this equation is correct
					System.out.print("V (liters) = ");
					double V = input.nextDouble();
					System.out.print("n (moles) = ");
					double n = input.nextDouble();
					System.out.print("T (Kelvins) = ");
					double T = input.nextDouble();
					double P = (n * R * T) / V;
					System.out.println(P);
				}
				
				if (unknown.equals("V")) {
					System.out.println("unknown is V");
				}
				
				if (unknown.equals("n")) {
					System.out.println("unknown is n");
				}
				
				if (unknown.equals("T")) {
					System.out.println("unknown is T");
				}
			}
		}
		
		if (chapter == 6) {
		}
	}
}