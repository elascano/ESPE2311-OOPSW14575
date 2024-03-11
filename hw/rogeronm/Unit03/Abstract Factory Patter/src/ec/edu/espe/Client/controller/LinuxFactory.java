/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Client.controller;

import ec.edu.espe.Client.model.Button;
import ec.edu.espe.Client.model.Menu;
import ec.edu.espe.Client.model.LinuxButton;
import ec.edu.espe.Client.model.LinuxMenu;

/**
 *
 * @author EDWARICHSNAKE
 */
public class LinuxFactory extends GUIFactory{
       public Button createButton(){
        return new LinuxButton();
    }
    
    public Menu createMenu(){
        return new LinuxMenu();
    }
}
