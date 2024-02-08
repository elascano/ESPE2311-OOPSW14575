
package herrencia;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Hija1 extends Padre{
// constructor
    public Hija1(int param) {
        super(param+2);
        System.out.println("Constructor hija: "+param);
    }
   
    
    // @Override indica que estamos sobreescribiendo el metodo ylo priorisa, así indico a java que estoy sobreescribiendo el metodo que ya hereda del pabre.
    @Override
     public void imprimir(){
        super.imprimir();
        System.out.println("Hija");
    
    }

    
}
