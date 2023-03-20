import java.util.Scanner;
public class ExerciseO7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numTestScores;
        String firstName, lastName, courseName;
        double [] list = new double[10];

        Score2 obj1 = new Score2();
        obj1.read(scan);
        obj1.print();

        System.out.println("\nEnter number of tests: ");
        numTestScores = scan.nextInt();

        Score2 obj2 = new Score2(numTestScores);
        obj2.read(scan);
        obj2.print();


        System.out.println("\nEnter First Name: ");
        firstName = scan.nextLine();

        System.out.println("\nEnter Last Name: ");
        lastName = scan.nextLine();

        System.out.println("\nEnter Course Name: ");
        courseName = scan.nextLine();

        for(int i = 0; i < list.length; i++){
            System.out.printf("\nTest Score %d: ", i);
            list[i] = scan.nextDouble();
        }

        Score2 obj3 = new Score2(firstName,lastName,courseName,list);

        obj3.print();


        
    }
}

class Score2{
    String firstName, lastName, courseName;
    int numTestScores;
    double [] testScores;

    public Score2(){
        firstName = null;
        lastName = null;
        courseName = null;
        numTestScores = 5;
        testScores = new double[numTestScores];
        for(int i = 0; i < numTestScores; i++){
            testScores[i] = 0.0;
        }
    }

    public Score2(int numElt){
        firstName = null;
        lastName = null;
        courseName = null;
        numTestScores = numElt;
        testScores = new double[numTestScores];
        for(int i = 0; i < numTestScores; i++){
            testScores[i] = 0.0;
        }
        
    }

    public Score2(String fname, String lname, String courseNum, double[] list){
        firstName = fname;
        lastName = lname;
        courseName = courseNum;
        numTestScores = list.length;
        testScores = new double[numTestScores];
        for(int i = 0; i < numTestScores; i++){
            testScores[i] = list[i];
        }
    }

    double computeAverage(){
        double total = 0.0;
        for(int i = 0; i < testScores.length; i++){
            total += testScores[i];
        }
        return total/testScores.length;
    }

    void read(Scanner scan){
        System.out.print("\nFirst Name: ");
        firstName = scan.next();

        System.out.print("\nLast Name: ");
        lastName = scan.next();

        System.out.print("\nCourse Name: ");
        courseName = scan.next();

        System.out.print("\nNumber of Test Scores: ");
        numTestScores = scan.nextInt();
        testScores = new double[numTestScores];

        for(int i = 0; i < testScores.length; i++){
            System.out.printf("\nTest Score %d: ",i+1);
            testScores[i] = scan.nextDouble();
        }
    }

    void print(){
        System.out.printf("\nFIRST NAME: %s\nLAST NAME: %s\nCOURSE NAME: %s\n",firstName, lastName, courseName);
        for(int i = 0; i < testScores.length;i++){
            System.out.printf("Test Score %d: %.1f\n",i+1,testScores[i]);
        }
        System.out.printf("Average Test Scores: %.1f\n", computeAverage());
    }
}
