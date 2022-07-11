package submissions;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter number you wish to check: ");
		int n = s.nextInt();
		if(n % 2 == 0) {
			System.out.println("The number " + n + " is even");
		}else {
			System.out.println("The number " + n + " is odd");
			
		}
		s.close();
	}

}
