
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class WinFactory extends GUIFactory {
    @Override
    public Button createButton(){
        return(new WinButton());
    }
    
    @Override
    public Menu createMenu(){
        return(new WinMenu());
    }
}
