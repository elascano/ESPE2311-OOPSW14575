/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.dailyDev.utils;

import ec.edu.espe.dailyDev.model.Task;
import java.util.List;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class DailyHandler {
 
    
    public static String createDailyMessage(List<Task> completedTasks, List<Task> upcomingTasks, String userName) {
        StringBuilder message = new StringBuilder();

        message.append("Good morning team! Here's my daily update:\n\n");

        // Completed tasks
        if (!completedTasks.isEmpty()) {
            message.append("Completed Tasks:\n");
            for (Task task : completedTasks) {
                message.append("  [X] ").append(task.getName()).append("\n");
            }
            message.append("\n");
        } else {
            message.append("No completed tasks today!\n\n");
        }

        // Upcoming tasks
        if (!upcomingTasks.isEmpty()) {
            message.append("Upcoming Tasks:\n");
            for (Task task : upcomingTasks) {
                message.append("  [ ] ").append(task.getName()).append("\n");
            }
            message.append("\n");
        } else {
            message.append("All tasks completed! Ready for new challenges!\n\n");
        }

        // Additional information or personalized message
        message.append("Remember, every task completed brings us closer to our goals. Let's rock the day!\n");
        message.append("Thank you!\n\n");

        // Personalized closing based on the user's name
        message.append("Best regards,\n").append(userName);

        return message.toString();
    }
}