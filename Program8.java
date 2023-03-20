public class Program8 {
    public static void main( String [ ] args )
    {
        int quantity; // to hold the quantity of the product
        double uprice; // to hold its unit price
        /*---- stop the execution if the user did not type three arguments in the command line---*/
        if( args.length != 3 )
            {
                System.out.println("This program is terminated!");
                System.out.println("Because you did not enter the proper number of arguments");
                return;
            }
        /*----------convert strings for the quantity and the unit price to their values ------------------*/
        quantity = Integer.parseInt( args[1] );
        uprice = Double.parseDouble( args[2] );
        /*------------------Compute and print the price of the product -----------------------------------*/
        System.out.println( "The price of the” + args[0] +” is:\t" + ( quantity * uprice ));
    }
}

