public class ExerciseO12 {
    public static void main(String[] args) {
        
    
    Tile tile1 = new RectangleTile(3.0, 5.0, 4.0);
    Tile tile2 = new TriangleTile(2.0, 6.0, 8.0);
    
    tile1.print();
    tile2.print();
    }
}

abstract class Tile {
    private double unitPrice;
    public Tile( )
    {
        unitPrice = 2.0;
    }

    public Tile ( double uprice )
    {
        unitPrice = uprice;
    }

    public double getUprice( )
    {
        return unitPrice ;
    }

    public abstract double computeArea(); // abstract method

    public double computePrice( )
    {
        double area;
        area = computeArea( ); // calling the abstract method
        return( unitPrice * area );
    }

    public void print()
    {
        System.out.println("The price of the tile is:\t" + computePrice ( ));
    }
}

class RectangleTile extends Tile // inherits class Tile
{
    private double length;
    private double width;

    public RectangleTile( )
    {
        length = 0.5;
        width = 1.0;
    }

    public RectangleTile(double len , double wth, double uprice )
    {
        super( uprice );
        length = len;
        width = wth;
    }

    @Override
    public double computeArea( )
    {
        return ( length * width ); // return the area of a rectangular tile
    }

    @Override
    public void print()
    {
        System.out.println( "The length is:\t" + length );
        System.out.println( "The width is:\t" + width);
        System.out.println( "The price of the tile is:\t" + computePrice ( ));
    }
}

class TriangleTile extends Tile // inherits class Tile
{
    private double height;
    private double base;

    public TriangleTile ()
    {
        height = 0.5;
        base = 1.0;
    }   

    public TriangleTile (double ht , double bse, double uprice )
    {
        super( uprice );
        height = ht;
        base = bse;
    }

    @Override
    public double computeArea( )
    {
        return ( height * base / 2.0 ); // return the area of a triangular tile
    }

    @Override
    public void print()
    {
        System.out.println( "The height is:\t" + height);
        System.out.println( "The base is:\t" + base);
        System.out.println( "The price of the tile is:\t" + computePrice ( ));
    }
}