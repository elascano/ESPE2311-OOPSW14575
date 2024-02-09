/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q71_100.model;

import java.util.UUID;

/**
 *
 * @author G306M11
 */
public class Student {
    private UUID id;
    private String name;
    private int currentSemester;
    private String major;

    public Student(UUID id, String name, int currentSemester, String major) {
        this.id = id;
        this.name = name;
        this.currentSemester = currentSemester;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", currentSemester=" + currentSemester + ", major=" + major + '}';
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
     * @return the currentSemester
     */
    public int getCurrentSemester() {
        return currentSemester;
    }

    /**
     * @param currentSemester the currentSemester to set
     */
    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


}
