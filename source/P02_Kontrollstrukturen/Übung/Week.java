package P02_Kontrollstrukturen.Übung;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Week {
    public static void main (String [] args){
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        System.out.println(switch (today){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Arbeit";
            case SATURDAY, SUNDAY -> "Party";
        });
    }
}
