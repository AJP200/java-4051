public class HandsOnW2 {
    // method printNumArray
    public static void printNumArray( Number [ ] inputArray )
    {
        // Display array elements
        for ( Number element : inputArray )
        System.out.printf( "%s ", element );
        System.out.println();
    }
    public static void main( String args[ ] )
    {
        // Create arrays of Integer, Double and Character
        Byte[ ] byteArray = { 1, 2, 3, 4, 5 };
        Double[ ] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        // pass an Integer array
        System.out.println( "Array byteArray contains:" );
        printNumArray( byteArray );
        // pass a Double array
        System.out.println( "\nArray doubleArray contains:" );
        printNumArray( doubleArray );
    } 
}
