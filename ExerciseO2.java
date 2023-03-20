public class ExerciseO2 {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.setValues(5, 7);
        Demo.decrDemo(obj1);

        System.out.printf("The Value of Val1 is %d and the value of val2 is %d", obj1.getValue1(),obj1.getValue2());

    }
}
