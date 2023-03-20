import java.util.Scanner;

public class Date {
    public Date(){
        month = 1;
        day = 1;
        year = 1960;
    }
    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
        checkDate();
    }

    

    public void inputDate(Scanner scan){
        System.out.println("\nEnter month: ");
        month = scan.nextInt();

        System.out.println("\nEnter day: ");
        day = scan.nextInt();

        System.out.println("\nEnter year: ");
        year = scan.nextInt();
        checkDate();
    }

    String getStringDate(){
        return month + "/" + day + "/" + year;
    }

    boolean isEqualTo(Date obj){
        return (obj.month == month) && (obj.day == day) && (obj.year == year);
    }

    int getMonth(){
        return month;
    }

    int getDay(){
        return day;
    }

    int getYear(){
        return year;
    }

    public static boolean isGreaterThan(Date obj1, Date obj2){
        if(obj1.year > obj2.year)
            return true;
        else if(obj1.month > obj2.month)
            return true;
        else if(obj1.day > obj2.day)
            return true;
        return false;
            
    }


    private void checkDate(){
        final int [ ] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if ( (month < 1) || (month > 12) || (day < 1) || (day > daysPerMonth [ month ]) || (year < 1960) || (year > 2023) )
        {
            System.out.println("Invalid Date");
            System.exit ( 1 );
        }
    }

    @Override
    public String toString(){
        return month + "/" + day + "/" + year;
    }



    private int month;
    private int day;
    private int year;
}
