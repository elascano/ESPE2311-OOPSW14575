package ec.edu.espe.dailyDevHM.model;

import java.util.ArrayList;

/**
 *
 * @author Antonio Revilla 
 */
public class Team {
    private int id;
    private String name;
    private int numberOfProject;
    private Projects projects[];

    public Team(int id, String name, int numberOfProject, Projects[] projects) {
        this.id = id;
        this.name = name;
        this.numberOfProject = numberOfProject;
        this.projects = projects;
    }

@Override
public String toString() {
    String team = "Team" + "id=" + getId() + ", name=" + getName() + ", numberOfProject=" + getNumberOfProject() + ", projects=";
    for (Projects project : getProjects()) {
        team = team + project; 
    }
    team = team + "}";
    return team;
}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
     * @return the numberOfProject
     */
    public int getNumberOfProject() {
        return numberOfProject;
    }

    /**
     * @param numberOfProject the numberOfProject to set
     */
    public void setNumberOfProject(int numberOfProject) {
        this.numberOfProject = numberOfProject;
    }

    /**
     * @return the projects
     */
    public Projects[] getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(Projects[] projects) {
        this.projects = projects;
    }
    
    
    
    
            
}
