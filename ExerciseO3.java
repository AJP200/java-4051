import java.util.Scanner;

public class ExerciseO3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date obj1 = new Date();
        Date today = new Date(10,14,2022);
        Date dueDate = new Date();

        System.out.println(obj1.getStringDate());
        System.out.printf("Today's day is:\t%s",today.getStringDate());

        dueDate.inputDate(scan);

        if(today.isEqualTo(dueDate))
            System.out.println("Your project is on time.");
        else if(Date.isGreaterThan(today, dueDate))
            System.out.println("Your project is late.");
        else
            System.out.println("Your project is early.");

        Date invDate = new Date(25, 4, 2000);
        invDate.getDay();

        
    }
}
