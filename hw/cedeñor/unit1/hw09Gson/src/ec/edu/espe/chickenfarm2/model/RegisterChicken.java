/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm2.model;

import java.util.Date;
import java.util.Scanner;

public class RegisterChicken {
     public Chicken registerChicken(){
        Scanner readChicken = new Scanner(System.in);
        System.out.print("Id: ");
        int id = readChicken.nextInt();
        System.out.print("Name:");
        String name = readChicken.next();
        System.out.print("Color: ");
        String color = readChicken.next();
        System.out.print("Is Molting: true or false? ");
        boolean isMolting = readChicken.nextBoolean();
        System.out.print("Year Of Born: ");
        int yearOfBorn = readChicken.nextInt();
        System.out.print("Month Of Born: (0=JAN) ");
        int monthOfBorn = readChicken.nextInt();
        System.out.print("Day Of Born: ");
        int dayOfBorn = readChicken.nextInt();
        Chicken chicken = new Chicken(id, name, color, isMolting, new Date(yearOfBorn, monthOfBorn, dayOfBorn));
        return chicken;
    }
}
