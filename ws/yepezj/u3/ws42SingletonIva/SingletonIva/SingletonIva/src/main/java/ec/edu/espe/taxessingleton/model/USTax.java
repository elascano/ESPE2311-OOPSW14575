package ec.edu.espe.taxessingleton.model;

/**
 *
 * @author Jefferson Yepez, DCCO - ESPE, BitCoderz
 */
public class USTax {

    private static USTax instance;

    private USTax() {

    }

    public static USTax getInstace() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public static float salesTotal(float price) {
        return (price * 1.12f);
    }

    public static float computeTaxes(float price) {
        return (price * 0.12f);
    }
}
