package ec.edu.espe.dailyDev.utils;

import ec.edu.espe.dailyDev.model.Task;
import io.github.cdimascio.dotenv.Dotenv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Olivier Paspuel
 */
public class GPTHandler {

    public static String generateHtmlMessage(List<Task> tasks) {
        StringBuilder tasksStr = new StringBuilder("");

        // Iterate through tasks and append information to the HTML
        for (Task task : tasks) {
//            String taskHtml = String.format("<b>Title:</b> %s<br><b>Status:</b> %s<br><b>Priority:</b> %s<br><b>Due Date:</b> %s<br><br>",
//                    task.getName(), (task.isCompleted() ? "Completed" : "Incomplete"), task.getPriority(), formatDate(task.getDueDate()));

            tasksStr.append(task.getName()).append(task.isCompleted());
            tasksStr.append("||");
        }

        return tasksStr.toString();
    }

    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }

    // 
    public static String getDailyMessage(List<Task> tasks) {

        Dotenv dotenv = Dotenv.load();
        String GPT_KEY = dotenv.get("GPT_KEY");
        String htmlMessage = generateHtmlMessage(tasks);
        String message = "Answer with html, using <br> instead of \n. Create a daily message that a developer would use to present his work status, make it short and concise" + htmlMessage;
        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = GPT_KEY;
        String model = "gpt-3.5-turbo"; // current model of chatgpt api

        try {
            // Create the HTTP POST request
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "Bearer " + apiKey);
            con.setRequestProperty("Content-Type", "application/json");

            // Build the request body
            String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + message + "\"}]}";
            con.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            writer.write(body);
            writer.flush();
            writer.close();

            // Get the response
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // returns the extracted contents of the response.
            return extractContentFromResponse(response.toString());

        } catch (IOException e) {
            System.err.println(e);
        }
        return null;
    }

    public static String extractContentFromResponse(String response) {
        int startMarker = response.indexOf("content") + 11; // Marker for where the content starts.
        int endMarker = response.indexOf("\"", startMarker); // Marker for where the content ends.
        return response.substring(startMarker, endMarker); // Returns the substring containing only the response.
    }

}
