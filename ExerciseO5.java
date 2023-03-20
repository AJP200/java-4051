import java.util.Scanner;
public class ExerciseO5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee [] empList = new Employee[5];

        for(int i = 0; i <empList.length; i++){
            empList[i] = new Employee();
            empList[i].readPInfo(scan);
            empList[i].readPayInfo(scan);
        }

        for(int i = 0; i < empList.length; i++){
            System.out.println(empList[i].getPInfoString());
            System.out.println(empList[i].getPayInfoString());
        }
    }
}
