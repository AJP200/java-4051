import java.util.Scanner;

public class Exercisel4 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
            int n;
            
            System.out.println("How many test scores? ");
            n = scan.nextInt();

            double [] test_storage = Exercisel4Methods.readTestScores(n);
            Exercisel4Methods.printTestResults(test_storage);

        }
}
