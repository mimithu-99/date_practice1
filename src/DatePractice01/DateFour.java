package DatePractice01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFour {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat adf = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy. hh:mm:ss");
        System.out.println(adf.format(d));
        System.out.println(sd.format(d));
        System.out.println(d.toString());
    }
}
