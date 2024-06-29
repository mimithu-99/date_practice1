package DatePractice01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateThree {
    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat adf = new SimpleDateFormat("M/d/yyyy");


        System.out.println(adf.format(d));
        System.out.println(d.toString());


    }
}
