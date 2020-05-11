package secondLearning.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));//2020
        //0-11
        System.out.println(calendar.get(Calendar.MONTH));//4
        calendar.set(Calendar.YEAR, 9999);
        System.out.println(calendar.get(Calendar.YEAR));//9999
        calendar.add(Calendar.YEAR, 100);
        System.out.println(calendar.get(Calendar.YEAR));//10099
        Date date = calendar.getTime();//把日历变成日期
    }
}
