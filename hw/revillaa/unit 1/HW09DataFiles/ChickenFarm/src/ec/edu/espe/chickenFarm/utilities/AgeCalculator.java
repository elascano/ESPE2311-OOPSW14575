package ec.edu.espe.chickenFarm.utilities;
import java.time.LocalDate;

/**
 *
 * @author Antonio Revilla
 */

public class AgeCalculator {

    public static String calculateAgeFromBirthdate(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();

        int years = currentDate.getYear() - birthDate.getYear();
        int months = currentDate.getMonthValue() - birthDate.getMonthValue();
        int days = currentDate.getDayOfMonth() - birthDate.getDayOfMonth();

        if (days < 0) {
            months--;
            days += currentDate.lengthOfMonth();
        }
        if (months < 0) {
            years--;
            months += 12;
        }

        return years + " years, " + months + " months, " + days + " days";
    }
}