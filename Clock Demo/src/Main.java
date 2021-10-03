/**
 * The Clock Demo program implements an application that
 * simply displays the time to the standard output every second.
 * @author  Lowell Perez
 * @version 1.0
 * @since   29-09-21
 */
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * This is the main method which makes use of Time.java methods.
 */

public class Main {
    public static void main(String[] args){
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        Time time = new Time();

        DateTimeFormatter h = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter m = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter s = DateTimeFormatter.ofPattern("ss");

        executor.scheduleAtFixedRate(() -> {//using this instead of Thread.sleep(), loops every 1 second
                    LocalTime now = LocalTime.now();
                    //parsing DateTimeFormatter to int
                    time.setHour(Integer.parseInt(h.format(now)));
                    time.setMinute(Integer.parseInt(m.format(now)));
                    time.setSecond(Integer.parseInt(s.format(now)));
                    time.displayTime();
                    //Thread.sleep(1000);
        }, 0, 1000, TimeUnit.MILLISECONDS);
    }
}
