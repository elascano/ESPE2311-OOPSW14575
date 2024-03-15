package ec.edu.espe.dailyDev.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class for formatting data.
 * 
 * @author Olivier Paspuel
 */
public class DataFormatter {

    /**
     * Format a date using the specified pattern.
     * 
     * @param date    The date to be formatted.
     * @param pattern The pattern for formatting the date.
     * @return The formatted date as a string.
     */
    public static String formatDate(Date date, String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    /**
     * Format a boolean as "Yes" or "No".
     * 
     * @param value The boolean value to be formatted.
     * @return "Yes" if true, "No" if false.
     */
    public static String formatBooleanAsYesNo(boolean value) {
        return value ? "Yes" : "No";
    }
}
