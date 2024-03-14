import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Date
        Date date = new Date();
        System.out.println(date.getYear()+1900);
        int  mouth = date.getMonth()+1;
        int day = date.getDay();
        System.out.println(date.toString());
        System.out.println(date.toLocaleString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm::ss");
        System.out.println(sdf.format(date));

        //calendar
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = 1+c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);

    }
}