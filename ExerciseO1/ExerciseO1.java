package ExerciseO1;
import java.util.Scanner;

public class ExerciseO1 {

    public static void main(String[] args) {
        Demo item = new Demo();                 
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        Demo objR = new Demo();

        try (Scanner input = new Scanner(System.in)) {
            int first, second; 

            System.out.print("Enter first value for item.val1: ");
            first = input.nextInt();
            System.out.print("\nEnter second value for item.val2: ");
            second = input.nextInt();

            item.setValues(first, second);              //Sets the value of the "item" Demo object
            System.out.printf("The average for item values are %d\n",item.getAverage());        //Prints the average of the Demo object "item"

            System.out.print("\nEnter first value for obj1.val1: ");    //Sets new values for "obj1" Demo object
            first = input.nextInt();
            System.out.print("\nEnter second value for obj1.val2: ");
            second = input.nextInt();

            obj1.setValues(first, second);              

            System.out.print("\nEnter first value for obj2.val1: ");    //Sets new values for "obj2" Demo object
            first = input.nextInt();
            System.out.print("\nEnter second value for obj2.val2: ");
            second = input.nextInt();

            obj2.setValues(first, second);
        }
        Demo sum = new Demo();                  //Creates Demo object "sum" to store the sum of obj1 variables and obj2 variables
        sum = addDemo(obj1, obj2);
        objR.setValues(sum.getValue1(), sum.getValue2());   //Demo object "objR" val1 is set to the sums of obj1 variables, val2 is set
                                                            //to the sums of obj2 variables 

        incrDemo(obj1);

        System.out.printf("The values of Val1: %d and Val2:%d for objR\n", objR.getValue1(),objR.getValue2());
        System.out.printf("The values of Val1: %d and Val2:%d for obj1\n", obj1.getValue1(),obj1.getValue2());



    }

    static Demo addDemo(Demo obj1, Demo obj2){          //Adds the val1 and val2 for two objects and stores it in sum object val1 and val2
        Demo sum = new Demo();
        
        sum.setValues(obj1.getValue1()+obj2.getValue1(), obj1.getValue2()+obj2.getValue2());

        return sum;
    }

    static void incrDemo(Demo obj1){                    //Increments an objects instances variables by 5
        obj1.setValues(obj1.getValue1()+5, obj1.getValue2()+5);
    }

    
}

