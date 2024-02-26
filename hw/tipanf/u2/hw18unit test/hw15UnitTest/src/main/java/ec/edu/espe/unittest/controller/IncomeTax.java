package ec.edu.espe.unittest.controller;

/**
 *
 * @author Frederick
 */
public class IncomeTax {
    static float afiliatedPercentage = 0.1145f;
    static float nonAfiliatedPercentage = 0.0945f;
        
    public static float applyIESSDiscount(float anualSalary,boolean isPublicEmployee){
        float disccountIESS=0;
        
        if(isPublicEmployee==true){
            disccountIESS = anualSalary * afiliatedPercentage;
            anualSalary -= disccountIESS; 
        }else{
           disccountIESS = anualSalary * nonAfiliatedPercentage;
           anualSalary -= disccountIESS;
        }
        
        return anualSalary;
        
    }
    
    public static float computeIncomeTax(float monthlySalary,boolean isPublicEmployee){
        float tax;
        float excedentPercentaje=0;
        float basicFractionTax=0;
        float basicFraction=0;
        
        float anualSalary=applyIESSDiscount(monthlySalary*12,isPublicEmployee);
        
        
        if ((anualSalary >= 0) && (anualSalary < 11722)) {
            basicFractionTax = 0;
            excedentPercentaje = 0;
            basicFraction = 0;
        } else {
            if ((anualSalary >= 11722) && (anualSalary < 14930)) {
                basicFractionTax = 0;
                excedentPercentaje = 0.05f;
                basicFraction = 11722;
            } else {
                if ((anualSalary >= 14930) && (anualSalary < 19385)) {
                    basicFractionTax = 160;
                    excedentPercentaje = 0.1f;
                    basicFraction = 14930;
                } else {
                    if ((anualSalary >= 19385) && (anualSalary < 25638)) {
                        basicFractionTax = 606;
                        excedentPercentaje = 0.12f;
                        basicFraction = 19385;
                    } else {
                        if ((anualSalary >= 25638) && (anualSalary < 33738)) {
                            basicFractionTax = 1356;
                            excedentPercentaje = 0.15f;
                            basicFraction = 25638;
                        } else {
                            if ((anualSalary >= 33738) && (anualSalary < 44721)) {
                                basicFractionTax = 2571;
                                excedentPercentaje = 0.2f;
                                basicFraction = 33738;
                            } else {
                                if ((anualSalary >= 44721) && (anualSalary < 59537)) {
                                    basicFractionTax = 4768;
                                    excedentPercentaje = 0.25f;
                                    basicFraction = 44721;
                                } else {
                                    if ((anualSalary >= 59537) && (anualSalary < 79388)) {
                                        basicFractionTax = 8472;
                                        excedentPercentaje = 0.3f;
                                        basicFraction = 59537;
                                    } else {
                                        if ((anualSalary >= 79388) && (anualSalary < 105580)) {
                                            basicFractionTax = 14427;
                                            excedentPercentaje = 0.35f;
                                            basicFraction = 79388;
                                        } else {
                                            if (anualSalary >= 105580) {
                                                basicFractionTax = 23594;
                                                excedentPercentaje = 0.37f;
                                                basicFraction = 105580;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        tax= anualSalary-basicFraction;
        tax *= excedentPercentaje;
        
        tax+=basicFractionTax;
        
        return tax;
    }
    
}
