import java.time.*;
import java.time.temporal.WeekFields;

public class hellomirza {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 3, 3);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfYear = date.getDayOfYear();
        boolean isLeap = date.isLeapYear();
        int weekOfYear = date.get(WeekFields.ISO.weekOfWeekBasedYear());

        System.out.println("Facts about 3 March 2025:\n");
        System.out.println("- Date: " + date);
        System.out.println("- Day of week (computed): " + dayOfWeek);
        System.out.println("- Day of year: " + dayOfYear);
        System.out.println("- Week of year (ISO): " + weekOfYear);
        System.out.println("- Leap year: " + isLeap);
        System.out.println("- UN observance: World Wildlife Day (observed on March 3)");
        System.out.println("- Zodiac sign: Pisces (Feb 19 - Mar 20)");
        System.out.println("- Notes: 3 March is the 62nd day of a non-leap year.");
         System.out.println("- New line is adding in the after the trigger is on.");
    }
}
