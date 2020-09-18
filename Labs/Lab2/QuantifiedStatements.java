public class QuantifiedStatements {

	public static void main(String[] args) {

		int[] domainD = new int[10];
		boolean[] truthValues = new boolean[5];

		for (int i = 0; i < 10; i++) {
			// If statement to check the truth value of proposition a: For all values of x
			// in domain D, if x<0 then x is odd.
			if (domainD[i] < 0) {
				if (domainD[i] % 2 == 0) {
					truthValues[0] = false;
					break;
				} // end if for a 2
				else {
					truthValues[0] = true;
				} // end else
			} // end if statement for proposition a
			else {
				truthValues[0] = true;
			}

			// If statement to check the truth value of proposition b: There exists a value
			// of x in domain D such that if x<0, then x is odd.
			if (domainD[i] < 0) {
				if (domainD[i] % 2 != 0) {
					truthValues[1] = true;
					break;
				} // end if for b 2
			} // end if statement for proposition b

			// If statement to check the truth value of proposition c: There exists a value
			// of x in domain D such that x is both <0 and odd.
			if (domainD[i] < 0 && domainD[i] % 2 != 0) {
				truthValues[2] = true;
				break;
			} else if (domainD[i] >= 0) {
				truthValues[2] = true;
				break;
			} else {
				truthValues[4] = false;
			}

			// If statement to check the truth value of proposition d: For all values of x
			// in domain D, if x is divisible by 3, then it is divisible by 5.
			if (domainD[i] % 3 == 0) {
				if (domainD[i] % 5 != 0) {
					truthValues[3] = false;
					break;
				} else {
					truthValues[3] = true;
				}
			} else {
				truthValues[3] = true;
			}

			// If statement to check the truth value of proposition e: There exists a value
			// of x in domain D such that if x is divisible by 3, then it is divisible by 5.
			if (domainD[i] % 3 == 0 && domainD[i] % 5 == 0) {
				truthValues[4] = true;
				break;
			} else if (domainD[i] % 3 != 0) {
				truthValues[4] = true;
				break;
			} else {
				truthValues[4] = false;
			}
		}
	}

}