package formats;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //System.out.printf("Format to two decimal places %.4f", 99.68 );
       //  String result = String.format("Format to two decimal places %.4f", 99.68);
       //System.out.println(result);
        String result = String.format("Format to two decimal places %,d", 10000000);
        //System.out.println(result);

        int number = 8888;
       // System.out.printf(" %c", number);

        int rating = 3;
        double stars = 5.0;
        String hotelName = "Hilton Hotels";

        String multiVariables = String.format("I rate the %s a %d out of %.2f stars", hotelName, rating, stars);
        //System.out.println(multiVariables);

        Date date = new Date();
       // System.out.println(date);

        String timeOnly = String.format("%tr", date);
        //System.out.println(timeOnly);

        Date today = new Date();
        String dayMonthYear = String.format("%tA %tB %tD", today, today, today );
        System.out.println(dayMonthYear);

        System.out.println(" ");

        String dayMonthYearLowercase = String.format("%ta %tb %td", today, today, today );
        System.out.println(dayMonthYearLowercase);

        String dYL = String.format("%ta %<tb %<td", today);
        System.out.println(dYL);





    }
}
