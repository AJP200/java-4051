public class ExerciseO14 {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        outerObject.outerMethod();

        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.innerMethod2();
    }
}

class OuterClass
{
    public void outerMethod( )
    {
        System.out.println("outer class");
        (new OuterClass.NestedClass()).innerMethod1();
        /*---- 3 ----- write the sequence of statements to call the method innerMethod1 ------------*/
    }
    static class NestedClass
    {
        public void innerMethod1( )
        {   
            System.out.println("nested class Method1");
        }
        public void innerMethod2( )
        {
            System.out.println("nested class Method2");
            (new OuterClass()).outerMethod();
            /*---- 4 ----- write the sequence of statements to call the method outerMethod------------*/
        }
    } // end of class StaticNestedClass
}