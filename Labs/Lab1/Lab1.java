// CS-278-M01
// Julian Vivar
// August 28, 2018
// Program: Create 256 Truth Tables and show the output for all possibilities of p, q, and r.

package Lab1;

public class Lab1 {
	
	public static void main(String[] args) {
		
		int count = 1;
		
		// 8 for loops create truth tables, eliminating one possibility at a time. 
		for ( int prop1 = 0; prop1 <= 1; prop1++ ) {
			for ( int prop2 = 0; prop2 <= 1; prop2++ ) {
				for ( int prop3 = 0; prop3 <= 1; prop3++) {
					for ( int prop4 = 0; prop4 <= 1; prop4++ ) {
						for ( int prop5 = 0; prop5 <= 1; prop5++ ) {
							for ( int prop6 = 0; prop6 <= 1; prop6++ ) {
								for ( int prop7 = 0; prop7 <= 1; prop7++ ) {
									for ( int prop8 = 0; prop8 <= 1; prop8++ ) {
										
										System.out.printf("Truth Table %d:\np   q   r   proposition\n", count++);
										System.out.printf("-----------------\n");
										
										// Converts of prop variables into 'T' or 'F' format.
										if ( prop1 == 1 ) {
											System.out.print( "F   F   F   T\n" );
										} else {
											System.out.print( "F   F   F   F\n" );
										} // end prop1 if
										
										if ( prop2 == 1 ) {
											System.out.print( "F   F   T   T\n");
										} else {
											System.out.print( "F   F   T   F\n");
										} // end prop2 if
										
										if ( prop3 == 1 ) {
											System.out.print( "F   T   F   T\n");
										} else {
											System.out.print( "F   T   F   F\n");
										} // end prop3 if
										
										if ( prop4 == 1 ) {
											System.out.print( "F   T   T   T\n");
										} else {
											System.out.print( "F   T   T   F\n");
										} // end prop4 if
										
										if ( prop5 == 1 ) {
											System.out.print( "T   F   F   T\n");
										} else {
											System.out.print( "T   F   F   F\n");
										} // end prop5 if
										
										if ( prop6 == 1 ) {
											System.out.print( "T   F   T   T\n");
										} else {
											System.out.print( "T   F   T   F\n");
										} // end prop6 if
										
										if ( prop7 == 1 ) {
											System.out.print( "T   T   F   T\n");
										} else {
											System.out.print( "T   T   F   F\n");
										} // end prop7 if
										
										if ( prop8 == 1 ) {
											System.out.print( "T   T   T   T\n");
										} else {
											System.out.print( "T   T   T   F\n");
										} // end prop 8 if
										
										System.out.println("");
										
									} // end prop8 for
								} // end prop7 for
							} // end prop6 for
						} // end prop5 for
					} // end prop4 for
				} // end prop3 for
			} // end prop2 for
		} // end prop1 for

	} // end main
} // end class
