
package ec.edu.espe.exam.utilis;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateSerializer implements JsonSerializer<Date> {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy, hh:mm:ss a", Locale.ENGLISH);

    @Override
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(dateFormat.format(date));
    }
}
