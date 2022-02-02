import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string with empty space:");
		
		String str = input.nextLine();
		
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==' ') {
				count++;
			}
		}
		
		System.out.println("There are " + count + " spaces in the string.");	

	}

}
