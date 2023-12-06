/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.utils;

/**
 *
 * @author mateo
 */

import java.time.LocalDate;

/**
 *
 * @author mateo
 */
public class DateHandler {

    public int computeAge(String bornDate) {
        String[] bornDateArray = new String[3];
        String[] todaysDateArray = new String[3];
        bornDateArray = bornDate.split("-");
        todaysDateArray = getDate().split("-");

        int age = Integer.parseInt(todaysDateArray[0]) - Integer.parseInt(bornDateArray[0]);

        if (Integer.parseInt(todaysDateArray[1])
                < Integer.parseInt(bornDateArray[1])
                || (Integer.parseInt(todaysDateArray[1])
                == Integer.parseInt(bornDateArray[1]
                ) && Integer.parseInt(todaysDateArray[2])
                < Integer.parseInt(bornDateArray[2]))) {
            age--;
        }
        return age;
    }

    public String getDate() {
        return LocalDate.now().toString();
    }
}
