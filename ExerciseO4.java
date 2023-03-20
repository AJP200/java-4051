import java.util.Scanner;
public class ExerciseO4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee john = new Employee();
        Employee joe = new Employee();
        Employee joel = new Employee();
        Employee invalid = new Employee();

        System.out.print(john.getPInfoString());
        
        joe.readPInfo(scan);
        joe.readPayInfo(scan);
        System.out.print(joe.getPInfoString() +" "+ joe.getPayInfoString());

        joel.readPInfo(scan);
        joel.readPayInfo(scan);
        System.out.print(joel.getPInfoString() +" "+ joel.getPayInfoString());

        invalid.readPInfo(scan);
        invalid.readPayInfo(scan);
        System.out.print(invalid.getPInfoString() +" "+ invalid.getPayInfoString());



    }
}
