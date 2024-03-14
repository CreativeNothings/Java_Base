import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //LocalDateTime
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println(d+" "+t);
        //转换当前时间
        LocalDate dn = LocalDate.parse("2000-10-28");
        System.out.println(dn);

        //自定义
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        LocalDateTime start = LocalDateTime.of(2000,10,28,0,0,0);
        LocalDateTime end = LocalDateTime.now();
        Duration d1 = Duration.between(start,end);
        Period p = LocalDate.of(2000,10,28).until(LocalDate.now());
        System.out.println(d1);
        System.out.println(p);
    }
}