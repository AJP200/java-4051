import java.util.Scanner;
public class ExerciseO10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HourlyEmployee obj1 = new HourlyEmployee();
        HourlyEmployee obj2 = new HourlyEmployee("Mark", "Peter", 333333, new Date(1, 10, 1995), new Date(7, 10, 2012), 50, 25);
        HourlyEmployee obj3 = new HourlyEmployee("Jane", "Doe", 444444, new Date(10, 1, 1998), new Date(5, 10, 2011), 30, 20);
        HourlyEmployee obj4 = new HourlyEmployee();
        System.out.println(obj1.getPInfoString() + obj1.getPayInfoString());
        System.out.println(obj2.getPInfoString() + obj2.getPayInfoString());
        System.out.println(obj3.getPInfoString() + obj3.getPayInfoString());

        obj4.readPInfo(scan);
        obj4.readPayInfo(scan);
        System.out.println(obj4.getPInfoString() + obj4.getPayInfoString());
    }
    
}

class HourlyEmployee extends Employee{
    int hours = 0;
    double payRate = 0.00;
    double overtime = 0.00;

    public HourlyEmployee(){
        super();
        hours = 0;
        payRate = 0.00;
        overtime = 0.00;
    }

    public HourlyEmployee(String fn, String ln, int id, Date bd, Date hd, int hrs, double prate){
        super(fn, ln, id, bd, hd, 0.0);
        hours = hrs;
        payRate = prate;
        computeBaseOvertimePay();
    }
    
    private void computeBaseOvertimePay(){
        if(hours <= 35){
            setBpay(payRate*hours);
            overtime = 0.00;
        }
        else{
            setBpay(payRate*35);
            overtime = payRate * 1.5 * (hours-35);
        }
    }

    public int getHours(){
        return hours;
    }

    public double getPayRate(){
        return payRate;
    }

    public double getOvertime(){
        return overtime;
    }

    @Override
    void readPayInfo(Scanner scan){
        System.out.println("Hours: ");
        hours = scan.nextInt();
        System.out.println("Pay Rate: ");
        payRate = scan.nextDouble();
        computeBaseOvertimePay();
    }

    @Override
    double getGpay(){
        return getBpay() + overtime;
    }

    @Override
    String getPayInfoString(){
        String str = String.format("\nHOURS: %d\nPAY RATE: %.2f\nBASE PAY: %.2f\nOVERTIME: %.2f\nGROSS PAY: %.2f\nTAX DEDUCTION: %.2f\nNET PAY: %.2f\n",getHours(),getPayRate(), getBpay(),getOvertime(), getGpay(),computeTax(),getGpay()-computeTax());
        return str;
    }
}