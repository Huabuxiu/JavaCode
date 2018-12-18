package exp_7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-12-17 08:55
 **/
public class Datecount {
    public void count() throws ParseException {
        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date date1 = simpleFormat.parse("1949-10-1 12:00");
        Date date2 = simpleFormat.parse("2010-8-15 12:00");
        long start = date1.getTime();
        long end = date2.getTime();
        int days = (int) ((end-start)/(1000 * 60 * 60 * 24));
        System.out.printf("相差天数为：%d",days);
    }

}
