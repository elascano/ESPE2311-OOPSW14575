
package ec.edu.espe.hermanos.model;

/**
 *
 * @author Sebastian
 */
public class Padre {
     private String nombre;
    private String madre;
    private String padre;
    private String abueloPaterno;
    private String abuelaPaterna;
    private String abueloMaterno;
    private String abuelaMaterna;

    public Padre(String nombre, String madre, String padre, String abueloPaterno, String abuelaPaterna, String abueloMaterno, String abuelaMaterna) {
        this.nombre = nombre;
        this.madre = madre;
        this.padre = padre;
        this.abueloPaterno = abueloPaterno;
        this.abuelaPaterna = abuelaPaterna;
        this.abueloMaterno = abueloMaterno;
        this.abuelaMaterna = abuelaMaterna;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the madre
     */
    public String getMadre() {
        return madre;
    }

    /**
     * @param madre the madre to set
     */
    public void setMadre(String madre) {
        this.madre = madre;
    }

    /**
     * @return the padre
     */
    public String getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(String padre) {
        this.padre = padre;
    }

    /**
     * @return the abueloPaterno
     */
    public String getAbueloPaterno() {
        return abueloPaterno;
    }

    /**
     * @param abueloPaterno the abueloPaterno to set
     */
    public void setAbueloPaterno(String abueloPaterno) {
        this.abueloPaterno = abueloPaterno;
    }

    /**
     * @return the abuelaPaterna
     */
    public String getAbuelaPaterna() {
        return abuelaPaterna;
    }

    /**
     * @param abuelaPaterna the abuelaPaterna to set
     */
    public void setAbuelaPaterna(String abuelaPaterna) {
        this.abuelaPaterna = abuelaPaterna;
    }

    /**
     * @return the abueloMaterno
     */
    public String getAbueloMaterno() {
        return abueloMaterno;
    }

    /**
     * @param abueloMaterno the abueloMaterno to set
     */
    public void setAbueloMaterno(String abueloMaterno) {
        this.abueloMaterno = abueloMaterno;
    }

    /**
     * @return the abuelaMaterna
     */
    public String getAbuelaMaterna() {
        return abuelaMaterna;
    }

    /**
     * @param abuelaMaterna the abuelaMaterna to set
     */
    public void setAbuelaMaterna(String abuelaMaterna) {
        this.abuelaMaterna = abuelaMaterna;
    }

    @Override
    public String toString() {
        return "Padre{" + "nombre=" + nombre + ", madre=" + madre + ", padre=" + padre + ", abueloPaterno=" + abueloPaterno + ", abuelaPaterna=" + abuelaPaterna + ", abueloMaterno=" + abueloMaterno + ", abuelaMaterna=" + abuelaMaterna + '}';
    }
    
}

