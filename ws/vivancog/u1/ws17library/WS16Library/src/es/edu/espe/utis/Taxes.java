
package es.edu.espe.utis;

/**
 *
 * @author IMG_NUC
 */
public class Taxes {
    
    public static float calculateTaxes(float monthlySalary,boolean isPublicEmployee){
        
        float anualSalary= monthlySalary*12;
        float tax=0;
        float excedentPercentaje=0;
        float basicFractionTax=0;
        float basicFraction=0;
        
        float disccountIESS=0;
        
        if(isPublicEmployee=true){
            disccountIESS = anualSalary * 0.1145F;
            anualSalary -= disccountIESS; 
        }else{
           disccountIESS = anualSalary * 0.945F;
            anualSalary -= disccountIESS;
        }
        
        
        
        
        if((anualSalary >= 0) && (anualSalary < 11722)){
            basicFractionTax=0;
            excedentPercentaje=0;
            basicFraction=0;
        }else{
            if((anualSalary >= 11722) && (anualSalary < 14930)){
            basicFractionTax=0;
            excedentPercentaje=0.05f;
            basicFraction=11722;
            }else{
            if((anualSalary >= 14930) && (anualSalary < 19385)){
            basicFractionTax=160;
            excedentPercentaje=0.1f;
            basicFraction=14930;
            }else{
            if((anualSalary >= 19385) && (anualSalary < 25638)){
            basicFractionTax=606;
            excedentPercentaje=0.12f;
            basicFraction=19385;
            }else{
            if((anualSalary >= 25638) && (anualSalary < 33738)){
            basicFractionTax=1356;
            excedentPercentaje=0.15f;
            basicFraction=25638;
            }else{
            if((anualSalary >= 33738) && (anualSalary < 44721)){
            basicFractionTax=2571;
            excedentPercentaje=0.2f;
            basicFraction=33738;
            }else{
            if((anualSalary >= 44721) && (anualSalary < 59537)){
            basicFractionTax=4768;
            excedentPercentaje=0.25f;
            basicFraction=44721;
            }else{
            if((anualSalary >= 59537) && (anualSalary < 79388)){
            basicFractionTax=8472;
            excedentPercentaje=0.3f;
            basicFraction=59537;
            }else{
            if((anualSalary >= 79388) && (anualSalary < 105580)){
            basicFractionTax=14427;
            excedentPercentaje=0.35f;
            basicFraction=79388;
            }else{
            if(anualSalary >= 105580){
            basicFractionTax=23594;
            excedentPercentaje=0.37f;
            basicFraction=105580;
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
