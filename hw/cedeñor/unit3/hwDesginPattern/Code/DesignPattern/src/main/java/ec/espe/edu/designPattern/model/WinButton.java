
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Rony
 */
public class WinButton extends Button {

    @Override
    public void paint() {
        System.out.println("I'm a WinButton "+caption);
    }

}
