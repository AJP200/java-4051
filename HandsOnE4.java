import java.util.Scanner;
import java.util.InputMismatchException;
public class HandsOnE4 {
    public static void main( String [ ] args ) throws ArithmeticException , IndexOutOfBoundsException
{
Scanner input = new Scanner( System.in ); // for standard input
int[ ] numeratorList = { 23, 21, 7, 45, 3 }; // list of possible values for the numerator
int numerator, // to hold the numerator
denominator, // to hold the denominator
index; // to hold an array index value
try
{
/*---------read an index value and use it to get the value of the numerator from the array-----*/
System.out.println( "\nPlease enter a value from 0 to 4:\t" );
index = input.nextInt( ); // InputMismatchException may be detected
numerator = numeratorList[ index ];
// IndexOutOfBoundsException may be thrown and detected
/*-------------------------------- read the denominator ---------------------------------------------*/
System.out.println( "\nPlease enter the denominator:\t" );
denominator = input.nextInt( ); // InputMismatchException may be detected
/*---------------------------Compute and print the quotient--------------------------------*/
int result = numerator / denominator; // ArithmeticException may be thrown and detected
System.out.printf( "\nThe result of: %d / %d = %d\n", numerator , denominator, result);
}
catch( InputMismatchException e )
{
System.err.printf( "\nException: %s\n", e ); // display the exception detected
String line = input.nextLine( ); // discard the invalid input data
System.out.println( "\nThe error is: You have entered an invalid input data\n" );
}
catch( ArithmeticException e )
{
System.err.printf( "\nException: %s\n", e ); // display the exception detected
System.out.println( "\nThe error is: division by zero is not feasible\n" );
}
catch( IndexOutOfBoundsException e )
{
System.err.printf( "\nException: %s\n", e ); // display the exception detected
System.out.println( "\nThe error is: you should have entered a value from zero to four\n" );
}
finally
{
System.out.println( "\nThank you for using this program. \n Bye bye\n" );
}
}
}
