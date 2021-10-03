/**
 * The Clock Demo program implements an application that
 * simply displays the time to the standard output every second.
 * @author  Lowell Perez
 * @version 1.0
 * @since   29-09-21
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
/**
* this method displays the time in HH:mm:ss
*
* */
    public void displayTime(){
        System.out.println("The time is " + hour +":"+ minute +":"+ second);
    }

    public void setHour(int h){
        this.hour = h;
    }

//    public int  getHour(){
//        return hour;
//    }

    public void setMinute(int m){
        this.minute = m;
    }

//    public int getMinute(){
//        return minute;
//    }

    public void setSecond(int s){
        this.second = s;
    }

//    public int getSecond(){
//        return second;
//    }
}
