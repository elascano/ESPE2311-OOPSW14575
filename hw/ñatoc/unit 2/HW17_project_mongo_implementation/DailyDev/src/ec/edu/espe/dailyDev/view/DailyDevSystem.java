package ec.edu.espe.dailyDev.view;

import ec.edu.espe.dailyDev.model.Task;
import ec.edu.espe.dailyDev.utils.DailyHandler;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class DailyDevSystem {

    public static void main(String[] args) throws Exception {
//        String dailyM = DailyHandler.createDailyMessage(Task.getTasksFromFile("tasks.json"), Task.getTasksFromFile("tasks.json"), "Olivier");
        LandingPage.showLandingPage();
//        System.out.println(dailyM);
    }
}