
package ec.edu.espe.dailyDev.model;

import ec.edu.espe.dailyDev.utils.MenuUtils;

/**
 *
 * @author Team Number: 4 - CodingNinjas  
 */

public class Project {
    private Team AssignedTeam;
    private String name;
    private Task[] tasks;

    public Project(Team AssignedTeam, String name, Task[] tasks) {
        this.AssignedTeam = AssignedTeam;
        this.name = name;
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Project{" + "AssignedTeam=" + AssignedTeam + ", name=" + name + ", tasks=" + tasks + '}';
    }



 
    public static void create() {
        System.out.println("Creating a new project...");
        // Lógica para crear un proyecto
        System.out.println("Project created!");
    }

    public static void show() {
        System.out.println("Showing projects...");
        // Lógica para mostrar proyectos
        System.out.println("No projects found.");  // Ajusta según tu lógica real
        MenuUtils.backToMainMenu();
    }

    public static void update() {
        System.out.println("Updating a project...");
        // Lógica para la actualización de proyectos
        System.out.println("Project updated!");
        MenuUtils.backToMainMenu();
    }

    public static void complete() {
        System.out.println("Completing a project...");
        // Lógica para completar proyectos
        System.out.println("Project completed!");
        MenuUtils.backToMainMenu();
    }

    public static void delete() {
        System.out.println("Deleting a project...");
        // Lógica para eliminar proyectos
        System.out.println("Project deleted!");
        MenuUtils.backToMainMenu();
    }
    
    /**
     * @return the AssignedTeam
     */
    public Team getAssignedTeam() {
        return AssignedTeam;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the tasks
     */
    public Task[] getTasks() {
        return tasks;
    }

    public void setAssignedTeam(Team AssignedTeam) {
        this.AssignedTeam = AssignedTeam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }
    
    
    
    
}
