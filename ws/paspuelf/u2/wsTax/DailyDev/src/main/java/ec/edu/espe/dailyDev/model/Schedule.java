package ec.edu.espe.dailyDev.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class Schedule {
    private List<Task> tasks;
    private List<Reminder> reminders;
    private List<Date> dates;

    public Schedule(List<Task> tasks, List<Reminder> reminders, List<Date> dates) {
        this.tasks = tasks;
        this.reminders = reminders;
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Schedule{" + "tasks=" + tasks + ", reminders=" + reminders + ", dates=" + dates + '}';
    }


    /**
     * @return the tasks
     */
    public List<Task> getTasks() {
        return tasks;
    }

    /**
     * @param tasks the tasks to set
     */
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * @return the reminders
     */
    public List<Reminder> getReminders() {
        return reminders;
    }

    /**
     * @param reminders the reminders to set
     */
    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    /**
     * @return the dates
     */
    public List<Date> getDates() {
        return dates;
    }

    /**
     * @param dates the dates to set
     */
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }
    
    
}
