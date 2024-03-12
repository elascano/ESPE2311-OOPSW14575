
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Rony
 */
public class LinuxFactory extends GUIFactory {
    @Override
    public Button createButton(){
        return(new LinuxButton());
    }
    
    @Override
    public Menu createMenu(){
        return(new LinuxMenu());
    }
}
