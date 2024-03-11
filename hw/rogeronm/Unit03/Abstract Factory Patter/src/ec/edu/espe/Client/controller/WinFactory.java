/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Client.controller;

import ec.edu.espe.Client.model.Button;
import ec.edu.espe.Client.model.Menu;
import ec.edu.espe.Client.model.WinButton;
import ec.edu.espe.Client.model.WinMenu;

/**
 *
 * @author EDWARICHSNAKE
 */
public class WinFactory extends GUIFactory{
    public Button createButton(){
        return new WinButton();
    }
    
    public Menu createMenu(){
        return new WinMenu();
    }
}
