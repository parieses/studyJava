package secondLearning.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //当前毫秒值
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date);
        date = new Date(0);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970
        date = new Date();
        System.out.println(date.getTime());//1589167782669
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date.getTime()));
        System.out.println(format.parse("2020-05-11 11:44:28"));
    }
}
