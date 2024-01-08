package ec.edu.espe.OOPExam.model;

import ec.edu.espe.OOPExam.utils.FileHandler;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Olivier Paspuel
 */
public class Student {

    private final UUID id;
    private String name;
    private String major;

    public Student(String name, String major) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + '}';
    }

    /**
     * @return the id
     */
    public UUID getId() {
        return id;
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
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("||Create a new student||");

        System.out.println("Insert the student's name:\n");
        String name = scanner.nextLine();

        System.out.println("Insert the student's major:\n");
        String major = scanner.nextLine();

        return new Student(name, major);
    }

    public static void deleteAllStudents() {
        ArrayList<Student> emptyList = new ArrayList<>();

        FileHandler.writeFile("students.json", emptyList);

        System.out.println("students deleted");
    }

    public static void createStudents() {
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            students.add(Student.createStudent());

        }

        FileHandler.writeFile("students.json", students);

        System.out.println("\n**objects created succesfully**\n");

    }

}
