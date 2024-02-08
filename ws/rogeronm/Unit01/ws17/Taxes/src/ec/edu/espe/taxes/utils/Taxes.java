package ec.edu.espe.taxes.utils;

/**
 *
 * @author mate-
 */
public class Taxes {
    private double salary;
    private double ingresoBaseAnual;
    private double gastoDeducible;
    private double baseImponible;
    private double impuestoPagar;
    private double fraccionExponible;

    public Taxes(double salary, double ingresoBaseAnual, double gastoDeducible, double baseImponible, double impuestoPagar, double fraccionExponible) {
        this.salary = salary;
        this.ingresoBaseAnual = ingresoBaseAnual;
        this.gastoDeducible = gastoDeducible;
        this.baseImponible = baseImponible;
        this.impuestoPagar = impuestoPagar;
        this.fraccionExponible = fraccionExponible;
    }

    @Override
    public String toString() {
        return "IessTaxes{" + "salary=" + salary + ", ingresoBaseAnual=" + ingresoBaseAnual + ", gastoDeducible=" + gastoDeducible + ", baseImponible=" + baseImponible + ", impuestoPagar=" + impuestoPagar + ", fraccionExponible=" + fraccionExponible + '}';
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the ingresoBaseAnual
     */
    public double getIngresoBaseAnual() {
        return ingresoBaseAnual;
    }

    /**
     * @param ingresoBaseAnual the ingresoBaseAnual to set
     */
    public void setIngresoBaseAnual(double ingresoBaseAnual) {
        this.ingresoBaseAnual = ingresoBaseAnual;
    }

    /**
     * @return the gastoDeducible
     */
    public double getGastoDeducible() {
        return gastoDeducible;
    }

    /**
     * @param gastoDeducible the gastoDeducible to set
     */
    public void setGastoDeducible(double gastoDeducible) {
        this.gastoDeducible = gastoDeducible;
    }

    /**
     * @return the baseImponible
     */
    public double getBaseImponible() {
        return baseImponible;
    }

    /**
     * @param baseImponible the baseImponible to set
     */
    public void setBaseImponible(double baseImponible) {
        this.baseImponible = baseImponible;
    }

    /**
     * @return the impuestoPagar
     */
    public double getImpuestoPagar() {
        return impuestoPagar;
    }

    /**
     * @param impuestoPagar the impuestoPagar to set
     */
    public void setImpuestoPagar(double impuestoPagar) {
        this.impuestoPagar = impuestoPagar;
    }

    /**
     * @return the fraccionExponible
     */
    public double getFraccionExponible() {
        return fraccionExponible;
    }

    /**
     * @param fraccionExponible the fraccionExponible to set
     */
    public void setFraccionExponible(double fraccionExponible) {
        this.fraccionExponible = fraccionExponible;
    }
    
    

   
}
