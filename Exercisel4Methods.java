public class Exercisel4Methods {
    static double [] readTestScores(int size){
        double [] test_scores = new double[size];

        for(int i = 0; i < size; i++){
            System.out.printf("Test score %d: ", i+1);
            test_scores[i] = Exercisel4.scan.nextDouble();
        }
         return (test_scores);
    }

    public static String printComment(char grade){
        String result;
        switch (grade){
            case 'A':
                result = "Very good";
                break;
            case 'B':
                result = "Good";
                break;
            case 'C':
                result = "Satisfactory";
                break;
            case 'D':
                result = "Need improvement";
                break;
            case 'F':
                result = "Poor";
                break;
            default:
                result = "Invaild";

        }
        return result;

    }

    static char getLetterGrade(double score){
        if(score >= 90){
            return 'A';
        } else if(score < 90 && score >= 80){
            return 'B';
        } else if (score < 80 && score >= 70){
            return 'C';
        } else if (score < 70 && score >= 60){
            return 'D';
        } else {
            return 'F';
        }
    

    }

    static void printTestResults(double [] testList){
        String test_Score = "Test Score";
        String letter_Grade = "Letter Grade";
        String comment = "Comment";
        System.out.printf("%-15s %15s %15s %n", test_Score, letter_Grade, comment);

        for(int i = 0; i < testList.length; i++){
            System.out.printf("%-15.1f %15c %15s %n", testList[i], getLetterGrade(testList[i]), printComment(getLetterGrade(testList[i])));
        }
    }
}
