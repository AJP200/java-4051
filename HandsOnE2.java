import java.util.Scanner;
public class HandsOnE2 {
    public static void main( String [ ] args ) throws ArithmeticException
{
try (Scanner input = new Scanner( System.in )) {
    int numerator, // to hold the numerator
    denominator; // to hold the denominator
    boolean continueLoop = true; // set to false if the user enter a non-zero value
    /*-------------------------------read the numerator -------------------------------*/
    System.out.println( "\nPlease enter the numerator:\t" );
    numerator = input.nextInt( );
    while( continueLoop )
    {
    /*-------------------------------- read the denominator ---------------------------------------------*/
    System.out.println( "\nPlease enter the denominator:\t" );
    denominator = input.nextInt( );
    try
    {
    /*---------------------------Compute and print the quotient--------------------------------*/
    int result = numerator / denominator; //exception may be thrown and detected
    System.out.printf( "\nThe result of: %d / %d = %d\n", numerator , denominator, result);
    continueLoop = false; // stop the repetition of the loop with a non-zero value
    }
    catch( ArithmeticException e )
    {
    System.err.printf( "\nException: %s\n", e ); // display the exception detected
    System.out.println( "\nThe error is:" + e.getMessage( ) + ". Please try again\n" );
    }
    }
}
}
} // end of class ProgramE1a
    

