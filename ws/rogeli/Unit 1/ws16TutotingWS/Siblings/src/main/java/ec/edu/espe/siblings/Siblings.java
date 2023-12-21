
package ec.edu.espe.siblings;
import ec.edu.espe.model.Sibling;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.model.Parent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ilhan
 */
public class Siblings {

    public static void main(String[] args) {
         String jsonRaw = "{\n" +
                "  \"Parent\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Edison\",\n" +
                "    \"parents\": [\n" +
                "      {\n" +
                "        \"Parent\": {\n" +
                "          \"id\": 1,\n" +
                "          \"name\": \"\"\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"Parent\": {\n" +
                "          \"id\": 2,\n" +
                "          \"name\": \"Isabel\"\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"isStuding\": false\n" +
                "  }\n" +
                "}";

        System.out.println("Original file" + jsonRaw);

        Gson gson = new Gson();
        Parent parent = gson.fromJson(jsonRaw, Parent.class);

        System.out.println("Parent: " + parent.toString());

        String jsonConvert = gson.toJson(parent);
        System.out.println(jsonConvert);
    }
}
