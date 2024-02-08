package ec.edu.espe.unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_558
 */
public class TaxTest {
    
    public TaxTest() {
    }

    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva1() {
        System.out.println("computeIva");
        float amount = 100.0F;
        float expResult = 12.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP1() {
        System.out.println("computePVP");
        float amount = 100.0F;
        float expResult = 112.0F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta1() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 48000.0;
        double expResult = 5587.75;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
    
      /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva2() {
        System.out.println("computeIva");
        float amount = 200.0F;
        float expResult = 24.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP2() {
        System.out.println("computePVP");
        float amount = 200.0F;
        float expResult = 224.0F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta2() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 47040.0;
        double expResult = 5347.75;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
    
      /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva3() {
        System.out.println("computeIva");
        float amount = 500.0F;
        float expResult = 60.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP3() {
        System.out.println("computePVP");
        float amount = 500.0F;
        float expResult = 560.0F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta3() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 30000.0;
        double expResult = 2010.3;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
      /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva4() {
        System.out.println("computeIva");
        float amount = 700.0F;
        float expResult = 84.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP4() {
        System.out.println("computePVP");
        float amount = 700.0F;
        float expResult = 784.0F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta4() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 16800.0;
        double expResult = 347.0;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
    
      /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva5() {
        System.out.println("computeIva");
        float amount = 1575.0F;
        float expResult = 189.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP5() {
        System.out.println("computePVP");
        float amount = 985.0F;
        float expResult = 1103.2F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta5() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 9600.0;
        double expResult = 0.0;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
    
      /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva6() {
        System.out.println("computeIva");
        float amount = 50.0F;
        float expResult = 6.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP6() {
        System.out.println("computePVP");
        float amount = 50.0F;
        float expResult = 56.0F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta6() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 10800.0;
        double expResult = 0.0;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
    
      /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva7() {
        System.out.println("computeIva");
        float amount = 80000.0F;
        float expResult = 9600.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP7() {
        System.out.println("computePVP");
        float amount = 80000.0F;
        float expResult = 89600.0F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta7() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 480000.0;
        double expResult = 197279.4;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
    
      /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva8() {
        System.out.println("computeIva");
        float amount = 30000.0F;
        float expResult = 3600.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP8() {
        System.out.println("computePVP");
        float amount = 30000.0F;
        float expResult = 33600.0F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta8() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 600000.0;
        double expResult = 241679.4;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
    
      /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva9() {
        System.out.println("computeIva");
        float amount = 900.0F;
        float expResult = 108.0F;
        float result = Tax.computeIva(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of computePVP method, of class Tax.
     */
    @Test
    public void testComputePVP9() {
        System.out.println("computePVP");
        float amount = 900.0F;
        float expResult = 1008.0F;
        float result = Tax.computePVP(amount);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of calcularImpuestoRenta method, of class Tax.
     */
    @Test
    public void testCalcularImpuestoRenta9() {
        System.out.println("calcularImpuestoRenta");
        double ingresoAnual = 60000.0;
        double expResult = 8610.9;
        double result = Tax.calcularImpuestoRenta(ingresoAnual);
        assertEquals(expResult, result, 0.000001);
    }
    
    /**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva10() {
    System.out.println("computeIva");
    float amount = 700.0F;
    float expResult = 84.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP10() {
    System.out.println("computePVP");
    float amount = 700.0F;
    float expResult = 784.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta10() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 45000.0;
    double expResult = 5860.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva11() {
    System.out.println("computeIva");
    float amount = 1200.0F;
    float expResult = 144.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP11() {
    System.out.println("computePVP");
    float amount = 1200.0F;
    float expResult = 1344.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta11() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 80000.0;
    double expResult = 12910.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}
/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva12() {
    System.out.println("computeIva");
    float amount = 950.0F;
    float expResult = 114.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP12() {
    System.out.println("computePVP");
    float amount = 950.0F;
    float expResult = 1064.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta12() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 70000.0;
    double expResult = 9860.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva13() {
    System.out.println("computeIva");
    float amount = 1200.0F;
    float expResult = 144.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP13() {
    System.out.println("computePVP");
    float amount = 1200.0F;
    float expResult = 1344.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta13() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 80000.0;
    double expResult = 12910.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva14() {
    System.out.println("computeIva");
    float amount = 950.0F;
    float expResult = 114.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP14() {
    System.out.println("computePVP");
    float amount = 950.0F;
    float expResult = 1064.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta14() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 70000.0;
    double expResult = 9860.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva15() {
    System.out.println("computeIva");
    float amount = 1100.0F;
    float expResult = 132.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP15() {
    System.out.println("computePVP");
    float amount = 1100.0F;
    float expResult = 1232.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta15() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 55000.0;
    double expResult = 7110.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva16() {
    System.out.println("computeIva");
    float amount = 800.0F;
    float expResult = 96.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP16() {
    System.out.println("computePVP");
    float amount = 800.0F;
    float expResult = 896.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta16() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 35000.0;
    double expResult = 3610.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}
/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva17() {
    System.out.println("computeIva");
    float amount = 1300.0F;
    float expResult = 156.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP17() {
    System.out.println("computePVP");
    float amount = 1300.0F;
    float expResult = 1456.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta17() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 90000.0;
    double expResult = 15010.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva18() {
    System.out.println("computeIva");
    float amount = 600.0F;
    float expResult = 72.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP18() {
    System.out.println("computePVP");
    float amount = 600.0F;
    float expResult = 672.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta18() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 25000.0;
    double expResult = 2360.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva19() {
    System.out.println("computeIva");
    float amount = 1050.0F;
    float expResult = 126.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP19() {
    System.out.println("computePVP");
    float amount = 1050.0F;
    float expResult = 1176.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta19() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 45000.0;
    double expResult = 5860.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computeIva method, of class Tax.
 */
@Test
public void testComputeIva20() {
    System.out.println("computeIva");
    float amount = 850.0F;
    float expResult = 102.0F;
    float result = Tax.computeIva(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of computePVP method, of class Tax.
 */
@Test
public void testComputePVP20() {
    System.out.println("computePVP");
    float amount = 850.0F;
    float expResult = 952.0F;
    float result = Tax.computePVP(amount);
    assertEquals(expResult, result, 0.000001);
}

/**
 * Test of calcularImpuestoRenta method, of class Tax.
 */
@Test
public void testCalcularImpuestoRenta20() {
    System.out.println("calcularImpuestoRenta");
    double ingresoAnual = 30000.0;
    double expResult = 3610.9;
    double result = Tax.calcularImpuestoRenta(ingresoAnual);
    assertEquals(expResult, result, 0.000001);
}
}
