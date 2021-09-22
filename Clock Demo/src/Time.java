public class Time {
    private int hour;
    private int minute;
    private int second;

    public void displayTime(){
        System.out.println("The time is " + hour +":"+ minute +":"+ second);
    }

    public void setHour(int h){//12
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
