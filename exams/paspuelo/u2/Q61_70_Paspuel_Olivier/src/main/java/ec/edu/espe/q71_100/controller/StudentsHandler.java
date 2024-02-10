/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q71_100.controller;

import static ec.edu.espe.q71_100.controller.MongoDBHandler.createDocument;
import ec.edu.espe.q71_100.model.Student;
import java.util.UUID;
import org.bson.Document;

/**
 *
 * @author G306M11
 */
public class StudentsHandler {

    public static boolean createStudent(String name, int currentS, String major) {
        UUID id = UUID.randomUUID();
        Student student = new Student(id, name, currentS, major);
        int semestersLeft = calculateSemestersLeft(student);
        Document newDoc = new Document("id", id)
                .append("name", name)
                .append("currentSemester", currentS)
                .append("major", major)
                .append("semestersLeft", semestersLeft);

        return createDocument(newDoc, "Students");
    }
    
    private static int calculateSemestersLeft(Student student){
        switch (student.getMajor()) {
            case "Business Administration" -> {
                return 8 - student.getCurrentSemester();
            }
            case "Software Engineering" -> {
                return 8 - student.getCurrentSemester();
            }
            case "Physical Education" -> {
                return 9 - student.getCurrentSemester();
            }
            case "Biotechnology Engineering" -> {
                return 9 - student.getCurrentSemester();
            }
            case "Medicine" -> {
                return 10 - student.getCurrentSemester();
            }
            default -> throw new AssertionError();
        }
    }
}
