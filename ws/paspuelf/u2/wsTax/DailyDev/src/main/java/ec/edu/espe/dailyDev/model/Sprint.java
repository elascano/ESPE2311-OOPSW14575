package ec.edu.espe.dailyDev.model;

import ec.edu.espe.dailyDev.utils.MenuUtils;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class Sprint {

    private UUID id;
    private String name;
    private Date startDate;
    private Date endDate;
    private List<Task> tasks;

    public Sprint(UUID id, String name, Date startDate, Date endDate, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Sprint{" + "id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", tasks=" + tasks + '}';
    }



    public static void create() {
        System.out.println("Creating a new sprint...");
        // Lógica para crear un sprint
        System.out.println("Sprint created!");
    }

    public static void show() {
        System.out.println("Showing sprints...");
        // Lógica para mostrar sprints
        System.out.println("No sprints found.");  // Ajusta según tu lógica real
        MenuUtils.backToMainMenu();
    }

    public static void update() {
        System.out.println("Updating a sprint...");
        // Lógica para la actualización de sprints
        System.out.println("Sprint updated!");
        MenuUtils.backToMainMenu();
    }

    public static void complete() {
        System.out.println("Completing a sprint...");
        // Lógica para completar sprints
        System.out.println("Sprint completed!");
        MenuUtils.backToMainMenu();
    }

    public static void delete() {
        System.out.println("Deleting a sprint...");
        // Lógica para eliminar sprints
        System.out.println("Sprint deleted!");
        MenuUtils.backToMainMenu();
    }
    
    /**
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
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
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
    
    
}
