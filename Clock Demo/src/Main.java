
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();

        DateTimeFormatter h = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter m = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter s = DateTimeFormatter.ofPattern("ss");

        LocalTime now = LocalTime.now();

        //parsing DateTimeFormatter to int
        time.setHour(Integer.parseInt(h.format(now)));
        time.setMinute(Integer.parseInt(m.format(now)));
        time.setSecond(Integer.parseInt(s.format(now)));
        time.displayTime();
    }
}
