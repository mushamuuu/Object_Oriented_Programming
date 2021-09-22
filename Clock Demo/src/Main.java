import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        Time time = new Time();

        DateTimeFormatter h = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter m = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter s = DateTimeFormatter.ofPattern("ss");

        executor.scheduleAtFixedRate(() -> {//using this instead of Thread.sleep()
            while (true) {
                try {
                    LocalTime now = LocalTime.now();
                    //parsing DateTimeFormatter to int
                    time.setHour(Integer.parseInt(h.format(now)));
                    time.setMinute(Integer.parseInt(m.format(now)));
                    time.setSecond(Integer.parseInt(s.format(now)));
                    time.displayTime();
//                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Something went wrong.");
                }
            }
        }, 0, 1000, TimeUnit.MILLISECONDS);
    }
}
