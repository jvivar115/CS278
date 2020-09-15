// CS-278-M01
// Julian Vivar
// August 28, 2018
// Program: Create 256 Truth Tables and show the output for all possibilities of p, q, and r.

package Lab1;

public class Lab1 {
	
	public static void main(String[] args) {
		
		int count = 1;
		
		// 8 for loops create truth tables, eliminating one possibility at a time. 
		for ( int proposition_one = 0; proposition_one <= 1; proposition_one++ ) {
			for ( int proposition_two = 0; proposition_two <= 1; proposition_two++ ) {
				for ( int proposition_three = 0; proposition_three <= 1; proposition_three++) {
					for ( int proposition_four = 0; proposition_four <= 1; proposition_four++ ) {
						for ( int proposition_five = 0; proposition_five <= 1; proposition_five++ ) {
							for ( int proposition_six = 0; proposition_six <= 1; proposition_six++ ) {
								for ( int proposition_seven = 0; proposition_seven <= 1; proposition_seven++ ) {
									for ( int proposition_eight = 0; proposition_eight <= 1; proposition_eight++ ) {
										
										System.out.printf("Truth Table %d:\np   q   r   Proposition\n", count++);
										System.out.printf("-----------------\n");
										
										// Prints out the true or false statements and proposition results
										if ( proposition_one == 1 ) {
											System.out.print( "F   F   F   T\n" );
										} else {
											System.out.print( "F   F   F   F\n" );
										} // end proposition_one if
										
										if ( proposition_two == 1 ) {
											System.out.print( "F   F   T   T\n");
										} else {
											System.out.print( "F   F   T   F\n");
										} // end proposition_two if
										
										if ( proposition_three == 1 ) {
											System.out.print( "F   T   F   T\n");
										} else {
											System.out.print( "F   T   F   F\n");
										} // end proposition_three if
										
										if ( proposition_four == 1 ) {
											System.out.print( "F   T   T   T\n");
										} else {
											System.out.print( "F   T   T   F\n");
										} // end proposition_four if
										
										if ( proposition_five == 1 ) {
											System.out.print( "T   F   F   T\n");
										} else {
											System.out.print( "T   F   F   F\n");
										} // end proposition_five if
										
										if ( proposition_six == 1 ) {
											System.out.print( "T   F   T   T\n");
										} else {
											System.out.print( "T   F   T   F\n");
										} // end proposition_six if
										
										if ( proposition_seven == 1 ) {
											System.out.print( "T   T   F   T\n");
										} else {
											System.out.print( "T   T   F   F\n");
										} // end proposition_seven if
										
										if ( proposition_eight == 1 ) {
											System.out.print( "T   T   T   T\n");
										} else {
											System.out.print( "T   T   T   F\n");
										} // end proposition_eight if
										
										System.out.println("");
										
									} // end proposition_eight for
								} // end proposition_seven for
							} // end proposition_six for
						} // end proposition_five for
					} // end proposition_four for
				} // end proposition_three for
			} // end proposition_two for
		} // end proposition_one for

	} // end main
} // end class
