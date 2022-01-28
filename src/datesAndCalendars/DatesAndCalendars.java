package datesAndCalendars;

import java.util.Calendar;
import java.util.Date;

// 有兩個辦法在Java裡面使用 時間 (Date, Calendar)
public class DatesAndCalendars {
    public static void main(String[] args) {
        DatesAndCalendars.displayCurrentDate();
        DatesAndCalendars.displaySetDate();
    }

    public static void displayCurrentDate() {

        // 先使用 Calendar 去取的當前時間
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar + "\n");
        Date date = new Date();
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }

    public static void displaySetDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031, 02, 10);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
