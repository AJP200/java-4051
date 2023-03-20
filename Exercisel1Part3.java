import java.util.Scanner;

public class Exercisel1Part3 {
    static double tax, netPay;
        public static void main(String[] args) {
        
            try (Scanner input = new Scanner(System.in)) {
                String first_name, last_name;
                int ID_Number, hours;
                Double pay_rate, gross_pay;
    
                System.out.println("Enter Name:");
                first_name = input.nextLine();
    
                System.out.println("Enter Last Name:");
                last_name = input.nextLine();
    
                System.out.println("Enter ID Number:");
                ID_Number = input.nextInt();
    
                System.out.println("Enter Hours Worked:");
                hours = input.nextInt();
    
                System.out.println("Enter Pay Rate:");
                pay_rate = input.nextDouble();
    
                gross_pay = hours * pay_rate;
    
                computeTaxNetPay(gross_pay);
    
                String st = String.format("Name:          %5s %s\n", first_name, last_name);
                String ID_string = String.format("ID Number:       %d\n", ID_Number);
                String hour_string = String.format("Hours:         %d\n", hours);
                String payr_string = String.format("Pay Rate:      $%.2f\n", pay_rate);
                String grossp_string = String.format("Gross Pay:     $%.2f\n", gross_pay);
                String taxd_string = String.format("Tax Deduction: $%.2f\n", tax);
                String netp_string = String.format("Net Pay:       $%.2f\n", netPay);
    
                System.out.println(st);
                System.out.println(ID_string);
                System.out.println(hour_string);
                System.out.println(payr_string);
                System.out.println(grossp_string);
                System.out.println(taxd_string);
                System.out.println(netp_string);
            }
    }

    static void computeTaxNetPay(double gross){
        tax = gross * 0.2;
        netPay = gross - tax;
    }

}
