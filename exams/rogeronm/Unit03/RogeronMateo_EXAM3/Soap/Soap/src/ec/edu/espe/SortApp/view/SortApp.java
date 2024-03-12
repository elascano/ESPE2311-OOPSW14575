/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SortApp.view;

import ec.esu.espe.SortApp.controller.SortingContext;

/**
 *
 * @author EDWARICHSNAKE
 */
public class SortApp {
    public static void main(String[] args) {
        int data[] = {1,2,3,4};
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
    }
}
