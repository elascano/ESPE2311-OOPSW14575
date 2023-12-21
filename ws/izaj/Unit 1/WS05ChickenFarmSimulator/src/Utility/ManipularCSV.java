package Utility;

import java.awt.PageAttributes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class ManipularCSV {
    private BufferedReader reader;//lee el archivo
    private String line; //recibe la linea de cada fila 
    private String parts[] = null;//Almacena cada linea leida



public void readArchive(String nameArchive){
    try {
        reader = new BufferedReader(new FileReader(nameArchive));
        while((line = reader.readLine())!=null){
            parts = line.split(",");
            printLine();
            System.out.println();
        }
        reader.close();
        line = null;
        parts = null;
    
    } catch (IOException e){
        JOptionPane.showMessageDialog(null,e);
   
    }

}    
public void printLine(){
        for (String part : parts) {
            System.out.println(part + " | ");
        }



}

    public void readArchive(PageAttributes.MediaType C) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


}
