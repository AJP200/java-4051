import java.util.Scanner;
public class ExerciseO8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee obj1 = new Employee();
        Employee obj3 = new Employee("John", "Doe", 111111, new Date(10, 25, 1991), new Date(5, 10, 2010), 1250);

        BonusEmployee obj2 = new BonusEmployee();
        BonusEmployee obj4 = new BonusEmployee("Jobe", "Daly", 222222, new Date(1, 5, 1990), new Date(5, 10, 2010), 850, 250.0);

        Employee obj5 = new Employee();
        BonusEmployee obj6 = new BonusEmployee();
        

        System.out.println(obj1.getPInfoString() + obj1.getPayInfoString());

        System.out.println(obj2.getPInfoString() + obj2.getPayInfoString());

        System.out.println(obj3.getPInfoString() + obj3.getPayInfoString());

        System.out.println(obj4.getPInfoString() + obj4.getPayInfoString());

        obj5.readPInfo(scan);
        obj5.readPayInfo(scan);
        System.out.println(obj5.getPInfoString() + obj5.getPayInfoString());

        obj6.readPInfo(scan);
        obj6.readPayInfo(scan);
        System.out.println(obj6.getPInfoString() + obj6.getPayInfoString());


    }
    
}

class BonusEmployee extends Employee{
    private double bonus;

    public BonusEmployee(){
        super();
        bonus = 0.0;
    }
   
   public BonusEmployee(String firstName, String lastName, int id, Date birthDate, Date hiredDate, double bPay,Double bonusP){
       super(firstName, lastName, id, birthDate, hiredDate, bPay);
       bonus = bonusP;
   }


    public double getBonus(){
        return bonus;
    }

    @Override
    void readPayInfo(Scanner scan){
        System.out.print("Enter Base Pay: ");
        setBpay(scan.nextDouble());
        System.out.print("Enter Bonus: ");
        bonus = scan.nextDouble();
    }

    @Override
    double getGpay(){
        return getBpay() + bonus;
    }

    @Override
    String getPayInfoString(){
        String str = String.format("\nBASE PAY: %.2f\nBONUS: %.2f\nGROSS PAY: %.2f\nTAX DEDUCTION: %.2f\nNET PAY: %.2f\n",getBpay(),getBonus(), getGpay(),computeTax(),getGpay()-computeTax());
            return str;
    }

    @Override
    public String toString(){
        String str = String.format("\nBASE PAY: %.2f\nBONUS: %.2f\nGROSS PAY: %.2f\nTAX DEDUCTION: %.2f\nNET PAY: %.2f\n",getBpay(),getBonus(), getGpay(),computeTax(),getGpay()-computeTax());
        return getPInfoString() + str;
    }
}