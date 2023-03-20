public class Demo
{
    private int val1; // the first data member
    private int val2; // the second data member

    public void setValues(int num1, int num2)
    {  
        val1 = num1;
        val2 = num2;
    }

    public int getValue1( )
    {
        return (val1);
    }

    public int getValue2( )
    {
        return (val2);
    }

    public int getAverage( )
    {
    return( (val1 + val2) / 2);
    }

    static void decrDemo(Demo obj){
        obj.val1 -= 1;
        obj.val2 -= 1;
    }
}