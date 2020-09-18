import java.util.*;

public class lab2 {

	public static void main(String[] args) {

		// Variables: domainD to hold the integers, truthValues to hold the truth
		// values, exceptionFound and existenceFound to determine if existential
		// quantification has been met
		int[] domainD = new int[10];
		boolean[] truthValues = new boolean[5];
		boolean[] exceptionFound = new boolean[2];
		boolean[] existenceFound = new boolean[3];

		System.out.print("Please enter 10 different integers:");
		Scanner sc = new Scanner(System.in);

		for (int k = 0; k < 10; k++) {
			domainD[k] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {

			
			// If statement to check the truth value of proposition a: For all values of x
			// in domain D, if x<0 then x is odd.
			if (exceptionFound[0] == false) {

				if (domainD[i] < 0 && domainD[i] % 2 != 0) {
					truthValues[0] = true;

				} else if (domainD[i] < 0 && domainD[i] % 2 == 0) {
					truthValues[0] = false;
					exceptionFound[0] = true;

				} else if (domainD[i] >= 0 && domainD[i] % 2 != 0) {
					truthValues[0] = true;

				} else if (domainD[i] >= 0 && domainD[i] % 2 == 0) {
					truthValues[0] = true;

				}
			} // end proposition a if

			
			// If statement to check the truth value of proposition b: There exists a value
			// of x in domain D such that if x<0, then x is odd.
			if (existenceFound[0] == false) {

				if (domainD[i] < 0 && domainD[i] % 2 != 0) {
					truthValues[1] = true;
					existenceFound[0] = true;

				} else if (domainD[i] < 0 && domainD[i] % 2 == 0) {
					truthValues[1] = false;

				} else if (domainD[i] >= 0 && domainD[i] % 2 != 0) {
					truthValues[1] = true;
					existenceFound[0] = true;

				} else if (domainD[i] >= 0 && domainD[i] % 2 == 0) {
					truthValues[1] = true;
					existenceFound[0] = true;

				}
			} // end proposition b if

			
			// If statement to check the truth value of proposition c: There exists a value
			// of x in domain D such that x is both <0 and odd.
			if (existenceFound[1] == false) {

				if (domainD[i] < 0 && domainD[i] % 2 != 0) {
					truthValues[2] = true;
					existenceFound[1] = true;

				} else {
					truthValues[2] = false;
				}
			} // end proposition c if

			
			// If statement to check the truth value of proposition d: For all values of x
			// in domain D, if x is divisible by 3, then it is divisible by 5.
			if (exceptionFound[1] == false) {

				if (domainD[i] % 3 == 0 && domainD[i] % 5 == 0) {
					truthValues[3] = true;

				} else if (domainD[i] % 3 == 0 && domainD[i] % 5 != 0) {
					truthValues[3] = false;
					exceptionFound[1] = true;

				} else if (domainD[i] % 3 != 0 && domainD[i] % 5 == 0) {
					truthValues[3] = true;

				} else if (domainD[i] % 3 != 0 && domainD[i] % 5 != 0) {
					truthValues[3] = true;

				}
			} // end proposition d if

			
			// If statement to check the truth value of proposition e: There exists a value
			// of x in domain D such that if x is divisible by 3, then it is divisible by 5.
			if (existenceFound[2] == false) {

				if (domainD[i] % 3 == 0 && domainD[i] % 5 == 0) {
					truthValues[4] = true;
					existenceFound[2] = true;

				} else if (domainD[i] % 3 == 0 && domainD[i] % 5 != 0) {
					truthValues[4] = false;

				} else if (domainD[i] % 3 != 0 && domainD[i] % 5 == 0) {
					truthValues[4] = true;
					existenceFound[2] = true;

				} else if (domainD[i] % 3 != 0 && domainD[i] % 5 != 0) {
					truthValues[4] = true;
					existenceFound[2] = true;

				}
			} // end proposition e if

			
		} // end for loop

		System.out.println("\nFinal Truth Values:\na) is " + truthValues[0] + "\nb) is " + truthValues[1] + "\nc) is "
				+ truthValues[2] + "\nd) is " + truthValues[3] + "\ne) is " + truthValues[4]);

	}// end main

}// end class
