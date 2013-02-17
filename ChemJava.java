import java.util.Scanner;

public class ChemJava {
	public static void main(String[] args) {
		System.out.println("Chapter 2:   Chemical Formulas  = 1");
		System.out.println("Chapter 5:   Thermochemistry    = 2");
		System.out.println("Chapter 6-7: Light              = 3");
		System.out.println("Chapter 8-9: Chemical Bonding   = 4");
		System.out.println("Chapter 11:  Gases              = 5");
		System.out.println("Chapter 14:  Solutions          = 6");
		System.out.println("Conversions                     = 7");
		System.out.println("Please enter the corresponding number of the chapter you would like to enter: ");
		
		Scanner input = new Scanner(System.in);
		int chapter = input.nextInt();
		
		if (chapter == 1) {
		}
		
		else if (chapter == 2) {
		}
		
		else if (chapter == 3) {
		}
		
		else if (chapter == 4) {
		}
		
		else if (chapter == 5) {
			final double R = 0.08205746; // Gas constant "R"
			System.out.println("Which equation would you like to use?");
			System.out.println("PV=nRT = 1");
			
			int equationNumber = input.nextInt();
			
			if (equationNumber == 1) {
				System.out.println("Which variable is your unknown...P, V, n, or T? ");
				String unknown = input.next();
				
				if (unknown.equalsIgnoreCase("P")) {
					// Ask for values and store as variables
					System.out.print("V (liters) = ");
					double V = input.nextDouble();
					System.out.print("n (moles) = ");
					double n = input.nextDouble();
					System.out.print("T (Kelvins) = ");
					double T = input.nextDouble();
					// Perform the equation and print
					double P = (n * R * T) / V;
					System.out.println(P + " atm");
				}
				
				else if (unknown.equalsIgnoreCase("V")) {
					// Ask for values and store as variables
					System.out.print("P (atm) = ");
					double P = input.nextDouble();
					System.out.print("n (moles) = ");
					double n = input.nextDouble();
					System.out.print("T (Kelvins) = ");
					double T = input.nextDouble();
					// Perform the equation and print
					double V = (n * R * T) / P;
					System.out.println(V + " liters");
				}
				
				else if (unknown.equalsIgnoreCase("n")) {
					// Ask for values and store as variables
					System.out.print("P (atm) = ");
					double P = input.nextDouble();
					System.out.print("V (liters) = ");
					double V = input.nextDouble();
					System.out.print("T (Kelvins) = ");
					double T = input.nextDouble();
					// Perform the equation and print
					double n = (P * V)/(R * T);
					System.out.println(n + " moles");					
				}
				
				else { // The only other unknown the user would choose is T
					// Ask for values and store as variables
					System.out.print("P (atm) = ");
					double P = input.nextDouble();
					System.out.print("V (liters) = ");
					double V = input.nextDouble();
					System.out.print("n (moles) = ");
					double n = input.nextDouble();
					// Perform the equation and print
					double T = (P * V) / (n * R);
					System.out.println(T + " Kelvins");
				}
			}
		}
		
		else if (chapter == 6) {
		}
		
		else { // The only other number the user would input is 7
		}
	}
}