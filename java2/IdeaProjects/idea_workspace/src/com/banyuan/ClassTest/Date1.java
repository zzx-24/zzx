package ClassTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Date1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期：");
        String str = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        int day = (date2.getYear()-date.getYear())*365;
        long hour = (date2.getTime()-day*24*60*60*1000)/1000/60/60;
        System.out.println(day+" "+hour);
    }
}
