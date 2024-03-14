import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime departureAtBJ = LocalDateTime.of(2019,9,15,13,0,0);
        int hours = 13;
        int minutes = 20;
        LocalDateTime arrivalAtNY = cal(departureAtBJ,hours,minutes);
        if (!LocalDateTime.of(2019, 10, 15, 14, 20, 0)
                .equals(cal(LocalDateTime.of(2019, 10, 15, 13, 0, 0), 13, 20))) {
            System.err.println("测试失败!");
        } else if (!LocalDateTime.of(2019, 11, 15, 13, 20, 0)
                .equals(cal(LocalDateTime.of(2019, 11, 15, 13, 0, 0), 13, 20))) {
            System.err.println("测试失败!");
        }
    }
    static LocalDateTime cal(LocalDateTime ldt,int hours,int minutes){
        ZonedDateTime zbj = ldt.atZone(ZoneId.of("Asia/Shanghai"));
        zbj = zbj.plusHours(hours).plusMinutes(minutes);
        return zbj.withZoneSameInstant(ZoneId.of("America/New_York")).toLocalDateTime();
    }
}