public class ExerciseO13 {
    public static void main(String[] args) {
        HourlyPay obj1 = new HourlyPay();
        HourlyPay obj2 = new HourlyPay(50,12);
        obj1.printDetails();
        obj2.printDetails();
    }
}

interface Payroll{
    double TAXRATE = 0.15; // tax rate
    double getGrossPay( ); // to compute and return the gross pay
    double getDeductions( ); // to compute and return the deductions
    void printDetails( ); // to output the payroll
}

class HourlyPay implements Payroll{
    private double hours;
    private double payRate;

    HourlyPay(){
        hours = 40;
        payRate = 10.00;
    }

    HourlyPay(double hrs,double pRate){
        hours = hrs;
        payRate = pRate;
    }

    double getOverTime(){
        if(hours>40)
            return 1.5*(hours-40)*payRate;
        return 0;
    }

    @Override
    public double getGrossPay() {
        return hours*payRate + getOverTime();
    }

    @Override
    public double getDeductions() {
        return TAXRATE * getGrossPay();
    }

    public String toString(){
        String str = String.format("\nPAY RATE: %.2f\nHOURS: %.2f\nOVERTIME: %.2f\nGROSS PAY: %.2f\nTAX DEDUCTION: %.2f\nNET PAY: %.2f", payRate, hours, getOverTime(),getGrossPay(),getDeductions(),getGrossPay()-getDeductions());
        return str;
    }

    @Override
    public void printDetails() {
        System.out.println(toString());
        
    }
}
