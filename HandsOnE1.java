import java.util.Scanner;
public class HandsOnE1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numerator, denominator;

            /*-------------------------------read the numerator -------------------------------*/
            System.out.println( "\nPlease enter the numerator:\t" );
            numerator = input.nextInt( );
            /*-------------------------------- read the denominator ---------------------------------------------*/
            System.out.println( "\nPlease enter the denominator:\t" );
            denominator = input.nextInt( );
            /*---------------------------Compute and print the quotient--------------------------------*/
            int result = quotient( numerator , denominator ); //exception may be detected
            System.out.printf( "\nThe result of: %d / %d = %d\n", numerator, denominator, result);
        }
    }

    public static int quotient( int first, int second )
    {
        return( first / second ); // possible division by zero
    }
}
