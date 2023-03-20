import java.util.Scanner;

public class Employee {
        private String fName;
        private String lName;
        private int idNum;
        private Date bDay;
        private Date hiredDay;
        private double basePay;
    
        public Employee(){
            fName = "john";
            lName = "Doe";
            idNum = 999999;
            bDay = new Date(1,1,1960);
            hiredDay = new Date(1,1,1960);
            basePay = 0.00;
        }

        public Employee(String firstName, String lastName, int id, Date birthDate, Date hiredDate, double bPay){
            fName = firstName;
            lName = lastName;
            idNum = id;
            bDay = birthDate;
            hiredDay = hiredDate;
            basePay = bPay;
        }

        void readPInfo(Scanner scan){
            System.out.print("\nEnter your first name:\t");
            fName = scan.next();
            System.out.print("\nEnter your last name:\t");
            lName = scan.next();
            System.out.print("\nEnter your ID number:\t");
            idNum = scan.nextInt();
            System.out.print("\nEnter your birth day:\t");
            bDay.inputDate(scan);
            System.out.print("\nEnter your date of hire: \t");
            hiredDay.inputDate(scan);
        }
    
        void readPayInfo(Scanner scan){
            System.out.print("\nEnter your base pay:\t");
            basePay = scan.nextDouble();
        }
    
        String getPInfoString(){
            String str = String.format("\nNAME: %s, %s\nID NUMBER: %d\nBIRTH DAY: %s\nDATE HIRED: %s", lName,fName,idNum,bDay.getStringDate(),hiredDay.getStringDate());
            return str;
        }
        
        void setBpay(double newBpay){
            basePay = newBpay;
        }

        double getBpay(){
            return basePay;
        }

        double getGpay(){
            return basePay;
        }

        double computeTax(){
            if(getGpay()>= 800 && getGpay() < 1000)
                return getGpay() * .18;
            else if(getGpay()>= 600 && getGpay() < 800)
                return getGpay() * .15;
            return getGpay() * .10;
        }

        String getPayInfoString(){
            String str = String.format("\nGROSS PAY: %.2f\nTAX DEDUCTION: %.2f\nNET PAY: %.2f\n", getGpay(),computeTax(),getGpay()-computeTax());
            return str;
        }

        @Override
        public String toString(){
            String str = String.format("\nNAME: %s, %s\nID NUMBER: %d\nBIRTH DAY: %s\nDATE HIRED: %s \nGROSS PAY: %.2f\nTAX DEDUCTION: %.2f\nNET PAY: %.2f\n", lName,fName,idNum,bDay.getStringDate(),hiredDay.getStringDate(), getGpay(),computeTax(),getGpay()-computeTax());
            return str;
        }
    
}
