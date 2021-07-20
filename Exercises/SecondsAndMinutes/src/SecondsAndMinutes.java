public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds){
        if((minutes >= 0) && (seconds >=0) && (seconds <= 59)){
            int hours = (minutes / 60);
            int newMinutes = (minutes % 60);
            return (hours + "h " + newMinutes + "m " + seconds + "s");
        }
        else{
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;
            int hours = minutes / 60;
            minutes = minutes % 60;
            return (hours + "h " + minutes + "m " + seconds + "s");
        }
        else{
            return "Invalid Value";
        }
    }
}
