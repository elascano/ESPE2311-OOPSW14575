package ec.edu.espe.dailyDev.model;

import ec.edu.espe.dailyDev.utils.MenuUtils;
import java.util.Date;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class Reminder {
    private String name;
    private String description;
    private Date remindDate;
    private Date deadline;
    private Date creationTime;
    private Task task;

    public Reminder(String name, String description, Date remindDate, Date deadline, Date creationTime) {
        this.name = name;
        this.description = description;
        this.remindDate = remindDate;
        this.deadline = deadline;
        this.creationTime = creationTime;
    }
    
    public static void create() {
        System.out.println("Creating a new reminder...");
        // Lógica para crear un recordatorio
        System.out.println("Reminder created!");
    }

    public static void show() {
        System.out.println("Showing reminders...");
        // Lógica para mostrar recordatorios
        System.out.println("No reminders found.");  // Ajusta según tu lógica real
        MenuUtils.backToMainMenu();
    }

    public static void update() {
        System.out.println("Updating a reminder...");
        // Lógica para la actualización de recordatorios
        System.out.println("Reminder updated!");
        MenuUtils.backToMainMenu();
    }

    public static void complete() {
        System.out.println("Completing a reminder...");
        // Lógica para completar recordatorios
        System.out.println("Reminder completed!");
        MenuUtils.backToMainMenu();
    }

    public static void delete() {
        System.out.println("Deleting a reminder...");
        // Lógica para eliminar recordatorios
        System.out.println("Reminder deleted!");
        MenuUtils.backToMainMenu();
    }

    @Override
    public String toString() {
        return "Reminder{" + "name=" + name + ", description=" + description + ", remindDate=" + remindDate + ", deadline=" + deadline + ", creationTime=" + creationTime + ", task=" + task + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the remindDate
     */
    public Date getRemindDate() {
        return remindDate;
    }

    /**
     * @param remindDate the remindDate to set
     */
    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    /**
     * @return the deadline
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the creationTime
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * @param creationTime the creationTime to set
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

   
    
}
