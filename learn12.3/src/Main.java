import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

       //ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.now();
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zdt);
        System.out.println(zny);
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zbj = ldt.atZone(ZoneId.systemDefault());
        System.out.println(zbj);
    }
}