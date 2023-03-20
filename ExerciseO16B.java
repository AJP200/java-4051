public class ExerciseO16B {
    public static void main(String[] args) {
        Expression obj1 = new Expression() {
            @Override
            public void saySomething() {
                System.out.println("I do not feel well");
            }
        };

        obj1.saySomething();
    }
}


interface Expression{
    void saySomething();
}
