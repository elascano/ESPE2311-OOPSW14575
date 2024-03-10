
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(){
        int sys = 0 ; 
        if (sys == 0)
            return (new WinFactory());
        else
            return (new LinuxFactory());
    }
    
    public abstract Button createButton();
    public abstract Menu createMenu();
    
}
