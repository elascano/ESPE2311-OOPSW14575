
package ec.edu.espe.Taxlib.Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex Cuzco, HoneyBadgers, DCCO-ESPE
 */
public class Taxestest {

    public Taxestest () {
    }

    /**
     * Test del método calcularIva.
     */
    @Test
    public void testCalcularIva() {
        double monto = 200.0;
        double expectedIva = 13.0;
        double actualIva = Taxes.calcularIva(monto);
        assertEquals(expectedIva, actualIva, 0.01); // Comprobamos que el resultado sea aproximadamente igual al esperado
    }

    /**
     * Test del método calcularTotalConIva.
     */
    @Test
    public void testCalcularTotalConIva() {
        double monto = 100.0;
        double expectedTotal = 12.0;
        double actualTotal = Taxes.calcularTotalConIva(monto);
        assertEquals(expectedTotal, actualTotal, 0.01); // Comprobamos que el resultado sea aproximadamente igual al esperado
    }
}
