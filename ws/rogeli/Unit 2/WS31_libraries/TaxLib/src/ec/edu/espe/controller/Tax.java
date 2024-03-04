
package ec.edu.espe.controller;

/**
 *
 * @author Ilhan R
 */
public class Tax {
    
    private static float ivaPercentage = 12;
    
    public static float computeIva(float ammount){
        float iva;
        
        iva= ammount*ivaPercentage /100;
        return iva;        
    }
    
    public static float computePvP(float ammount){
        float total;
        
        total = ammount + computeIva(ammount);
        return total;
    }
    
    public static float computeTaxableBase(float mensualIncome){
        float baseSalary= 450;
        float taxableIncome = mensualIncome*12;
        float exemptIncome = mensualIncome+baseSalary;
        float grossIncome = taxableIncome+exemptIncome; 
        
        float iessContribution = (mensualIncome*9.45f)/100;
        float deductibleExpenses = iessContribution*12;
        
        float BaseImponible = grossIncome-deductibleExpenses;
        
        return BaseImponible;
    }
    
    public static float computeIncomeTax(float mensualIncome){
        float baseImponible = computeTaxableBase(mensualIncome);
        float baseFraction = 0;
        if(baseImponible<11722){
            baseFraction = ((baseImponible-0)*0)+0;
        }
        else if(baseImponible>11722 && baseImponible<14930){
            baseFraction = ((baseImponible-11722)*0.05f)+0;
        }
        else if(baseImponible>14930 && baseImponible<19385){
            baseFraction = ((baseImponible-14930)*0.1f)+160;
        }
        else if(baseImponible>19385 && baseImponible<25638){
            baseFraction = ((baseImponible-19385)*0.12f)+606;
        }
        else if(baseImponible>25638 && baseImponible<33738){
            baseFraction = ((baseImponible-25638)*0.15f)+1356;
        }
        else if(baseImponible>33738 && baseImponible<44721){
            baseFraction = ((baseImponible-23738)*0.2f)+2571;
        }
        else if(baseImponible>44721 && baseImponible<59537){
            baseFraction = ((baseImponible-44721)*0.25f)+4768;
        }
        else if(baseImponible>59537 && baseImponible<79388){
            baseFraction = ((baseImponible-59537)*0.3f)+8472;
        }
        else if(baseImponible>79388 && baseImponible<105580){
            baseFraction = ((baseImponible-79388)*0.35f)+14427;
        }
        else if(baseImponible>105580){
            baseFraction = ((baseImponible-105580)*0.37f)+23594;
        }
        
        float personalExpenses = 4289.65f;
        float incomeTax = (baseFraction - personalExpenses);
        
        return incomeTax;
    }
}
