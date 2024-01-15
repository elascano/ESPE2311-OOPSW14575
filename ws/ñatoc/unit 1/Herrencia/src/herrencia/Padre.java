package herrencia;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class Padre {

    private int x = 0;
    private int y = 0;

//Sobrecarga de constructores    
//constructor 1
    public Padre(int param) {
        System.out.println("Constructor Padre: " + param);
    }
//constructor 2    

    public Padre(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    
 //sobreescribir, utilizar al misma función de la clase padre, pero cambio la funcionalidad
    @Override
    public String toString(){
        return "("+ x + " . " + y+ ")";
    
    }

    
    @Override
    public boolean equals(Object obj) {
     Padre p =(Padre)obj;
     if(x == p.x && y == p.y)
         return true;
     else
         return false;
    }
    
    
    
            
            
            
            
            
            
    //Sobrecarga de metodos, cada metodo creado con el mismo nombre, se diferencia por los parametros
    //no influfe en tipo de retorno de cada metodo para diferenciarlos
    public void imprimir() {
        System.out.println("Padre");
    }

    public void imprimir(int num) {

    }

}
