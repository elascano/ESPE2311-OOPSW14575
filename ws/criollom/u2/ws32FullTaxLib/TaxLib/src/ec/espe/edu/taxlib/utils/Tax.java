
package ec.espe.edu.taxlib.utils;

/**
 *
 * @author Mateo Gabriel Criollo/OOP14575/InterByte
 */
public class Tax {
    static float ivaPorcentage = 12.0f;
    static float valor1=11722.0f;
    static float valor2=14930.0f;
    static float valor3=19385.0f;
    static float valor4=25638.0f;
    static float valor5=33738.0f;
    static float valor6=44721.0f;
    static float valor7=59537.0f;
    static float valor8=79388.0f;
    static float valor9=105580.0f;
    
    public static float computerIva(float amount){
        float iva;
        iva=amount * ivaPorcentage/100;
        return iva;
    }
    
    public static float computerPVP(float amount){
        float total;
        
        total= amount + computerIva(amount);
        return total;
                
    }
    
    public static float computerIncomeTax(float monthSalary){
        float anualSalary;
        anualSalary=monthSalary*12;
        if(anualSalary>=0 && anualSalary<=valor1){
            return(anualSalary-0)*0+0;
        }
        if(anualSalary>valor1 && anualSalary<=valor2 ){
            return (anualSalary-valor1)*0.05f+0;
        }
        
        if (anualSalary>valor2 && anualSalary<=valor3){
            return(anualSalary-valor2)*0.10f+160;
        }
        
        if(anualSalary>valor3 && anualSalary<=valor4){
            return(anualSalary-valor3)*0.12f+606;
        }
        
        if(anualSalary>valor4 && anualSalary <=valor5){
            return(anualSalary-valor4)*0.15f+1356;
        }
        
        if (anualSalary>valor5 && anualSalary<=valor6){
            return(anualSalary-valor5)*0.20f+2571;
        }
        
        if(anualSalary>valor6 && anualSalary<=valor7){
            return(anualSalary-valor6)*0.25f+4768;
        }
        
        if(anualSalary>valor7 && anualSalary<=valor8){
            return(anualSalary-valor7)*0.30f+8472;
        }
        
        if(anualSalary>valor8 && anualSalary<=valor9){
            return(anualSalary-valor8)*0.35f+14427;
        }
        
        if(anualSalary>valor9){
            return(anualSalary-valor9)*0.37f+23594;
        }
        return 0.0f;
    }
}
