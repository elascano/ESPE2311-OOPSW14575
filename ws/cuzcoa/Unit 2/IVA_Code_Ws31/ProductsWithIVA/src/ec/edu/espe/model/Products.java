
package ec.edu.espe.model;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */

public class Products {

    private int cost;

    private static double TASA_IVA = 12.0;

    @Override
    public String toString() {
        return "Products{" + "cost=" + cost + '}';
    }

    public double[] priceWithIva() {
        double iva = this.getCost() * (getTASA_IVA() / 100.0);
        double precioTotal = this.getCost() + iva;

        return new double[]{iva, precioTotal};
    }

    public static double getTASA_IVA() {
        return TASA_IVA;
    }

    public static void setTASA_IVA(double nuevaTasa) {
        TASA_IVA = nuevaTasa;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}