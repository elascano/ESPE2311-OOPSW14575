package ec.edu.espe.iva.controller;

/**
 *
 * @author mateo
 */
public class IvaComputer {

    static float ivaPorcentage = 0.12f;
    static float min = 1500.35f;
    
    public static  float computeIva(float ammount){
        return (ammount * ivaPorcentage);
    }
    
    public static float computeTotalPrice(float ammount){
        return (computeIva(ammount)+ammount);
    }

    public static float getIvaPorcentage() {
        return ivaPorcentage;
    }

    public void setIvaPorcentage(float ivaPorcentage) {
        IvaComputer.ivaPorcentage = ivaPorcentage / 100;
    }

    public static float getMin() {
        return min;
    }

    public static void setMin(float min) {
        IvaComputer.min = min;
    }
    
    
    
}
