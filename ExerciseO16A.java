public class ExerciseO16A {
    public static void main(String[] args) {
        ChangeMaker obj1 = new ChangeMaker() {
            @Override
            public void makeChanges() {
                setValues(getVal1()+1, getVal2()+1);
            }
        };

        obj1.makeChanges();
        System.out.println(obj1.toString());

        ChangeMaker obj2 = new ChangeMaker(3,4) {
            @Override
            public void makeChanges() {
                setValues(getVal1()+5, getVal2()+5);
                
            }
        };

        obj2.makeChanges();
        System.out.println(obj2.toString());
    }
}

abstract class ChangeMaker
{
    private int val1;
    private int val2;
    public ChangeMaker( )
    {
        val1 = 0;
        val2 = 0;
    }

    public ChangeMaker(int n1, int n2 )
    {
        val1 = n1;
        val2 = n2;
    }

    public int getVal1( )
    {
        return val1;
    }
    
    public int getVal2( )
    {
        return val2;
    }

    public void setValues( int num1, int num2)
    {
        val1 = num1;
        val2 = num2;
    }

    public abstract void makeChanges( ); // abstract method
    @Override
    public String toString( )
    {
        String s = "\nval1=" + val1 +"\nval2 =" + val2;
        return( s );
    }
}