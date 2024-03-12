
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class WinButton extends Button {

    @Override
    public void paint() {
        System.out.println("I'm a WinButton "+caption);
    }

}
