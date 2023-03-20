import java.util.Scanner;

public class ExerciseO6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fName, lName, courseName;
        double [] list = new double[5];

        Score1 obj1 = new Score1();

        obj1.read(scan);
        obj1.print();

        fName = scan.next();
        lName = scan.next();
        courseName = scan.next();
        for(int i = 0; i < list.length; i++){
            System.out.printf("\nTest Score %d: ", i);
            list[i] = scan.nextDouble();
        }

        Score1 obj2 = new Score1(fName, lName, courseName,list);

        obj2.print();

    }
}
