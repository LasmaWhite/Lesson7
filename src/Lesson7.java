public class Lesson7 {
    public static void main(String[] args) {
        // Alarm clock application
        String dayOfWeek;

        // initialization
        dayOfWeek = "Saturday";

        if (dayOfWeek == "Tuesday" || dayOfWeek == "Monday") {
        System.out.println("Alarm is set to 7 o'clock");
        } else if ( dayOfWeek == "Wednesday") {
            System.out.println("Alarm is set to 8 o'clock");
        } else if (  dayOfWeek == "Thursday" || dayOfWeek == "Friday") {
            System.out.println("Alarm is set to 7:30");
        } else if ( dayOfWeek == "Saturday" || dayOfWeek == "Sunday") {
            System.out.println("No alarm is set");
        } else {
            System.out.println("No such day of Week exists");
        }
        // If you go to office
        // working day - high heels
        // Casual Fridays - you can wear flats
        // Holidays - you stay at home
        // Halloween - you can wear any costume

        String day = "Working day";

        if (day == "Working day") {
            System.out.println("You have to wear high heels");
        } else if (day== "Casual Friday") {
            System.out.println("You can wear flats");
        } else if (day == "Holiday") {
            System.out.println("You stay at home");
        } else if (day == "Halloween") {
            System.out.println("You can wear any costume");
        } else {
            System.out.println("Such day does not exist");
        }

    }
}
