import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Math {
    public static void main(String args[]){

        Date xDate = new Date();
        Calendar xCal = Calendar.getInstance();


        LocalDate today = LocalDate.now();

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("M/d/yyyy");
        String sToday = today.format(formatDate);

        DateTimeFormatter fDays = DateTimeFormatter.ofPattern("D");
        String iDay = today.format(fDays);

        System.out.println(today);
        System.out.println(sToday);
        System.out.println(iDay);
        System.out.println(today.getMonthValue());

        LocalDate dMakeDate = LocalDate.of(2018,9,13);
        dMakeDate = dMakeDate.plusDays(30);
        System.out.println(dMakeDate);

        today.until(dMakeDate, ChronoUnit.DAYS);




    }



}
