package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Main {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E yyyy.MM.dd");
        System.out.println(simpleDateFormat.format(date));

        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("u/w/E/a/dd/MMMM/yyyy/zzzz");
        System.out.println(simpleDateFormat1.format(date));


    }
}
