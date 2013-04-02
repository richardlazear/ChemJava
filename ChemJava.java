// Version: 0.2
// Author: Richie Lazear
// https://github.com/richardlazear/
// www.linkedin.com/in/rlazear/

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class MainFrame extends JFrame {
	JLabel whichEquationLabel = new JLabel("Which equation would you like to solve?");
	JLabel whichUnknownLabel = new JLabel("What is the unknown?");
	
	class MainPanel extends JPanel {
		public MainPanel() {
			super(new GridLayout(1, 1));
				
			JTabbedPane tabbedPane = new JTabbedPane();
			JPanel panel1 = new JPanel(new BorderLayout());
	        tabbedPane.add("Chaper 2", panel1);
	        JPanel panel2 = new JPanel(new BorderLayout());
	        	JPanel whichEquationLabelContainer = new JPanel();
	        		whichEquationLabelContainer.add(whichEquationLabel);
	        	JPanel panel2eqnButtons = new JPanel();
	        		JButton pvnrtButton = new JButton("PV = nRT");
	        		JButton otherButton = new JButton("Other Equation");
	        		panel2eqnButtons.add(pvnrtButton);
	        		panel2eqnButtons.add(otherButton);
	        	panel2.add(whichEquationLabelContainer, BorderLayout.PAGE_START);
	        	panel2.add(panel2eqnButtons, BorderLayout.CENTER);
	        tabbedPane.add("Chaper 5", panel2);
	        JPanel panel3 = new JPanel(new BorderLayout());
	        tabbedPane.add("Chaper 6-7", panel3);
	        JPanel panel4 = new JPanel(new BorderLayout());
	        tabbedPane.add("Chaper 8-9", panel4);
	        JPanel panel5 = new JPanel(new BorderLayout());
	        tabbedPane.add("Chaper 11", panel5);
	        JPanel panel6 = new JPanel(new BorderLayout());
	        tabbedPane.add("Chaper 14", panel6);
	        
	        add(tabbedPane);	
		}
	}
	
	public MainFrame() {
		// http://www.daniweb.com/software-development/java/threads/76144/removing-and-adding-items-to-jpanel
		
		super();
		this.setSize(700, 700);
		this.setTitle("ChemJava");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setContentPane(new MainPanel());
	}
}

public class ChemJava {
	public static void main(String[] args) {
		MainFrame chemjavaFrame = new MainFrame();
		chemjavaFrame.setVisible(true);
		
		
		/*Scanner input = new Scanner(System.in);
		int chapter = 0;
		
		do {
			System.out.println("Chapter 2:   Chemical Formulas  = 1");
			System.out.println("Chapter 5:   Thermochemistry    = 2");
			System.out.println("Chapter 6-7: Light              = 3");
			System.out.println("Chapter 8-9: Chemical Bonding   = 4");
			System.out.println("Chapter 11:  Gases              = 5");
			System.out.println("Chapter 14:  Solutions          = 6");
			System.out.println("Conversions                     = 7");
			System.out.println("Exit Program = 8");
			System.out.println("Please enter the corresponding number of the chapter you would like to enter: ");
			chapter = input.nextInt();
			
			switch (chapter) {
				case 1:
					
					System.out.println();
					break;
				
				case 2:
					
					System.out.println();
					break;
				
				case 3:
					
					System.out.println();
					break;
				
				case 4:
					
					System.out.println();
					break;
				
				case 5:
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
					
					System.out.println();
					break;
				
				case 6:
					
					System.out.println();
					break;
					
				case 7:
					
					System.out.println();
					break;
					
				case 8:
					System.exit(0);
					
					System.out.println();
					break;
											
				default:
					System.out.println();
					System.out.println("Error");
					System.out.println();
			}
			
		} while (chapter != 8);*/	
	}
}