import java.util.Scanner;
import java.util.InputMismatchException;
public class HandsOnE3 {
    public static void main( String [ ] args ) throws ArithmeticException{
    try (Scanner input = new Scanner( System.in )) {
        int numerator, // to hold the numerator
        denominator; // to hold the denominator
        boolean continueLoop = true; // set to false if the user enter a non-zero value
        while( continueLoop )
{
try
{
/*----------------------------------read the numerator ----------------------------------------------*/
System.out.println( "\nPlease enter the numerator:\t" );
numerator = input.nextInt( ); // exception may be detected
/*-------------------------------- read the denominator ---------------------------------------------*/
System.out.println( "\nPlease enter the denominator:\t" );
denominator = input.nextInt( ); // exception may be detected
/*---------------------------Compute and print the quotient--------------------------------*/
int result = numerator / denominator; //exception may be thrown and detected
System.out.printf( "\nThe result of: %d / %d = %d\n", numerator , denominator, result);
continueLoop = false; // stop the repetition of the loop with a non-zero value
}
catch( InputMismatchException e )
{
System.err.printf( "\nException: %s\n", e ); // display the exception detected
String line = input.nextLine( ); // discard the invalid input data
System.out.println( "\nThe error is:" + e.getMessage( ) + ". Please try again\n" );
}
catch( ArithmeticException e )
{
System.err.printf( "\nException: %s\n", e ); // display the exception detected
System.out.println( "\nThe error is:" + e.getMessage( ) + ". Please try again\n" );
}
}
    }
} // end of method main
}
