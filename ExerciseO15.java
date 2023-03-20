public class ExerciseO15 {
    public static void main(String[] args) {
        OuterClass1 outerObject = new OuterClass1();
        OuterClass1.InnerClass1 innerObject = (new OuterClass1()).new InnerClass1();

        outerObject.outerMethod();
        innerObject.innerMethod1();

       
    }
}

class OuterClass1
{
    private int outerNum;
    public OuterClass1( )
    {
        outerNum = 20;
    }

    public int getOuterNum( )
    {
        return( outerNum );
    }
    public void outerMethod( )
    {
        System.out.println("outer class");
        (new InnerClass1()).innerMethod1();
        System.out.println((new InnerClass1()).innerNum);
        /*---- 3 ----- write the sequence of statements to call the method innerMethod1 ------------*/
        /*-- 4 -- write the sequence of statements to output the value of instance variable innerNum -*/
    }
    class InnerClass1
    {
        private int innerNum;

        public InnerClass1( )
        {
            innerNum = 15;
        }
        public int getInnerNum( )
        {
            return( innerNum );
        }
        public void innerMethod1( )
        {
            System.out.println("nested class 1");
        }
        public void innerMethod2( )
        {
            System.out.println("nested class 2");
            innerMethod1();
            System.out.println(outerNum);
            /*---- 5 ----- write the sequence of statements to call the method outerMethod------------*/
            /* 6 - write the sequence of statements to output the value of instance variable outerNum -*/
        }
    } // end of class InnerClass
} // end of class OuterClass
