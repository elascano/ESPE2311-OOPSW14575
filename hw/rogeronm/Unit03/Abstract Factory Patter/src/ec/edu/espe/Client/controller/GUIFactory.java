/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Client.controller;

import ec.edu.espe.Client.model.Button;
import ec.edu.espe.Client.model.Menu;

/**
 *
 * @author EDWARICHSNAKE
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(){
        int sys = readFromConfigFile("OS_TYPE");
        if(sys == 0){
            return new WinFactory();
        }else{
            return new LinuxFactory();
        }
    }

    private static int readFromConfigFile(String os_type) {
        return 1;
    }
    
    public abstract Button createButton();
    public abstract Menu createMenu();

}
