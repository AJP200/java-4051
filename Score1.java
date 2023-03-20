import java.util.Scanner;

public class Score1 {
    private String firstName;
    private String lastName;
    private String courseName;
    private double [] testScores = new double [5];

    public Score1(){
        firstName = null;
        lastName = null;
        courseName = null;

        for(int i = 0; i <testScores.length; i++){
            testScores[i] = 0.0;
        }
    }

    public Score1(String fname, String lname, String courseNum, double[] list){
        firstName = fname;
        lastName = lname;
        courseName = courseNum;

        for(int i = 0; i < testScores.length;i++){
            testScores[i] += list[i];
        }
    }

    double computeAverage(){
        double total = 0.0;
        for(int i = 0; i < testScores.length; i++){
            total += testScores[i];
        }
        return total/5.0;
    }

    void read(Scanner scan){
        System.out.print("\nFirst Name: ");
        firstName = scan.next();

        System.out.print("\nLast Name: ");
        lastName = scan.next();

        System.out.print("\nCourse Name: ");
        courseName = scan.next();

        for(int i = 0; i < testScores.length; i++){
            System.out.printf("Enter Test Score %d: ", i+1);
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
