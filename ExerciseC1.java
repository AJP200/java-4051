import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseC1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            ArrayList<Integer> listOfValues = new ArrayList<Integer>();

            Integer obj1 = 100;

            for(int i = 1; i <= 10; i++){
                System.out.println("Enter number: ");
                Integer value = scan.nextInt();
                listOfValues.add(value);
            }

            for (Integer integer : listOfValues) {
                System.out.printf("%d ", integer);
            }

            System.out.println();

            listOfValues.set(5, obj1);

            listOfValues.remove(listOfValues.indexOf(50));

            Iterator<Integer> itr = listOfValues.iterator();

            while(itr.hasNext()){
                Object element = itr.next();
                System.out.print(element + " ");
            }
        }
    }
}
