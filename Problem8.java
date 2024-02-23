// Write a program that accepts the number of seconds and returns its time equivalent
// in days, hours, minutes and seconds. For example, given “21893872” (without
// quotes), the program must return “253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)”
// (without quotes).

public class Problem8 {

    public static String secondsToTime(int seconds){
        // calculate days
        int days = seconds / (24 * 3600);
        // get the remaing seconds
        seconds %= (24 * 3600);
        // calculate hours from seconds
        int hours = seconds / 3600;
        // calculate remaing seconds
        seconds %= 3600;
        // calculate minutes from the remaing seconds
        int mins = seconds / 60;
        // calculate remaing seconds after derivng days, hours and minutes
        int sec = seconds % 60;

        return days + " Day(s) " + hours +  " Hour(s) " + mins + " Minute(s) " + sec + " Second(s)";
    }

    public static void main(String args[]){

        int seconds = 21893872;
        String time = secondsToTime(seconds);
        System.out.println(time);
    }
    
}
