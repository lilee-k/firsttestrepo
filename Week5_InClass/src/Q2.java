import javax.swing.JOptionPane;


public class Q2 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog(null, "Enter a customer number in the form LLLNNNN \n (LLL = letters and NNNN = numbers)");
		
		boolean testboo1= true;
		boolean testboo2= true;
		int i=0;
		
		while (i<3) {		
			char lChar = str.charAt(i);
			System.out.println(lChar);
			testboo1 = Character.isLetter(lChar);
			
			
			if (testboo1 == false) {
				JOptionPane.showMessageDialog(null,"This is NOT a valid customer number");
				i=3;
			}
			else {
				i++;
			}
		}

		if (testboo1 == true) {
			while (i<7) {
				char dChar = str.charAt(i);
				System.out.println(dChar);
				testboo2= Character.isDigit(dChar);
				
				if (testboo2 == false) {
					JOptionPane.showMessageDialog(null,"This is NOT a valid customer number");
					i=7;
				}
				else {
					i++;
				}	
			}
			
			if (testboo2==true) {
				JOptionPane.showMessageDialog(null,"This is a valid customer number");
		}
		
		
		}
	}

}

