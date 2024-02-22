// Write a program that accepts the number of seconds and returns its time equivalent
// in days, hours, minutes and seconds. For example, given “21893872” (without
// quotes), the program must return “253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)”
// (without quotes).

public class Problem8 {

    public static String secondsToTime(int seconds){
        int days = seconds / (24 * 3600);
        seconds %= (24 * 3600);
        int hours = seconds / 3600;
        seconds %= 3600;
        int mins = seconds / 60;
        int sec = seconds % 60;

        return days + " Day(s) " + hours +  " Hour(s) " + mins + " Minute(s) " + sec + " Second(s)";
    }

    public static void main(String args[]){

        System.out.println(secondsToTime(21893872));
    }
    
}
