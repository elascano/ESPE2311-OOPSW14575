
package ec.espe.edu.designPattern.model;

/**
 *
 * @author Rony
 */
public class LinuxButton extends Button{

    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton "+caption);
    }

}
