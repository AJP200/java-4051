public class ExerciseO11 {
    public static void main(String[] args) {
        Date obj1 = new Date(10, 1, 2001);
        Employee obj2 = new Employee("Aljalis", "Pineda", 999999, new Date(1,1,2000), new Date(12,1,2013), 400);

        BonusEmployee obj3 = new BonusEmployee("Jill", "Gill", 9999, new Date(10, 8, 2001), new Date(1, 13, 2008), 400, 90.0);

        Date today = new Date(10, 30, 2022);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        
        System.out.println("The class name of the today object is " + today.getClass().getName());

    }
}


