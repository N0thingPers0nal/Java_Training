package Tasks;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Handling {
    public static void main(String[] args) throws ParseException {
        String date1 = "29/10/2023";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
//        Task1
//        add 10 days using calendar
//        to remove try catch block use throws
        try {
            Date date = simpleDateFormat.parse(date1);
            //System.out.println(new Date());
            calendar.setTime(date);
            calendar.add(Calendar.DATE, 10);
            //System.out.println(Calendar.DAY_OF_MONTH);
            //System.out.println(calendar.getTime());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        Task 2
//        Declaration of Date
        Date d = new Date(2023, 10, 29);
        try {
//            string to date
            Date d1 = simpleDateFormat.parse(date1);
//            compare of to dates
//            System.out.println(d.compareTo(d1));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
//Task 3
        calendar.set(2023, 10, 29);
        Date dm1 = calendar.getTime();
        calendar.set(2023, 8, 10);
        Date dm2 = calendar.getTime();
        System.out.println(dm1 + " /" + dm2);
        long left_Days = dm1.getTime() - dm2.getTime();
//        System.out.println(left_Days/1000*60*60*24);
//        System.out.println("Left Days= "+ TimeUnit.DAYS.convert(left_Days,TimeUnit.MILLISECONDS));

//Task 4
        Date d_f = simpleDateFormat.parse(date1);
        SimpleDateFormat d_f1 = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println(d_f1.format(d_f) + "/// " + d_f);

//Task 5
        SimpleDateFormat d_c = new SimpleDateFormat("dd/MM/yyyy");
        Date d3 = simpleDateFormat.parse(date1);
        calendar.setTime(d3);
        Calendar cd = Calendar.getInstance();
        cd.setTime(d_f);
//        System.out.println((d_c.format(d3).compareTo(d_f1.format(d_f))));
        System.out.println(cd.equals(calendar));

//        Task 6
        Date date = simpleDateFormat.parse(date1);
        //System.out.println(new Date());
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 10);
        System.out.println(calendar.getTime());

    }
}
