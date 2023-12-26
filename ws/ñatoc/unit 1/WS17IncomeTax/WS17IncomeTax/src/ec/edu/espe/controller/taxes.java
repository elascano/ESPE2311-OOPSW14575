package ec.edu.espe.controller;

import java.util.Scanner;

/**
 *
 * @author Carlos Ñato, The Javas, DCC-ESPE
 */
public class taxes {

    static Scanner consoleScanner = new Scanner(System.in);
    String name;
    int CI;
    float salary;

    public taxes(String name, int CI, float salary) {
        this.name = name;
        this.CI = CI;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "taxes{" + "name=" + name + ", CI=" + CI + ", salary=" + salary + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void tax() {

        System.out.println("Enter monthly salary.");
        float netIncome = consoleScanner.nextFloat();
        System.out.println("Are you a public servant (yes/no) ");
        String servantInput = consoleScanner.next();
        boolean areServant = servantInput.equalsIgnoreCase("yes");
        float impBase = netIncome * 12;
        
        if (areServant){
            impBase = impBase - (impBase * 0.0945f);
        }else {
            impBase = impBase;
        }
        if (impBase > 0 && impBase < 11722) {
            System.out.println("You do not have to contribute to this tax");
        } else if (impBase >= 11722 && impBase < 14930) {
            float surpBase = impBase - 11722;
        } else if (impBase >= 14930 && impBase < 19385) {
            float basicFraction = 4612 ;
            float taxFraction = 0.25f;
            float surpBase = impBase - 43147;
            float taxSurp = surpBase * taxFraction;
            float incomeTax = taxSurp + basicFraction;
            System.out.println("Impuesto--->" + incomeTax);
        } else if (impBase >= 19385 && impBase < 25638) {
                        float basicFraction = 4612 ;
            float taxFraction = 0.25f;
            float surpBase = impBase - 43147;
            float taxSurp = surpBase * taxFraction;
            float incomeTax = taxSurp + basicFraction;
            System.out.println("Impuesto--->" + incomeTax);
        } else if (impBase >= 25638 && impBase < 33738) {
            float basicFraction = 4612 ;
            float taxFraction = 0.25f;
            float surpBase = impBase - 43147;
            float taxSurp = surpBase * taxFraction;
            float incomeTax = taxSurp + basicFraction;
            System.out.println("Impuesto--->" + incomeTax);
        } else if (impBase >= 33738 && impBase < 44721) {
            float basicFraction = 4612 ;
            float taxFraction = 0.25f;
            float surpBase = impBase - 43147;
            float taxSurp = surpBase * taxFraction;
            float incomeTax = taxSurp + basicFraction;
            System.out.println("Impuesto--->" + incomeTax); 
        }else if (impBase >= 44721 && impBase < 59537) {
            float basicFraction = 4768 ;
            float taxFraction = 0.25f;
            float surpBase = impBase - 44721;
            float taxSurp = surpBase * taxFraction;
            float incomeTax = taxSurp + basicFraction;
            System.out.println("Taxes to pay--->" + incomeTax);
        }else if (impBase >= 59537 && impBase < 79388) {
            float basicFraction = 4612 ;
            float taxFraction = 0.25f;
            float surpBase = impBase - 43147;
            float taxSurp = surpBase * taxFraction;
            float incomeTax = taxSurp + basicFraction;
            System.out.println("Impuesto--->" + incomeTax);
        }else if (impBase >= 79388 && impBase < 105580) {
            float basicFraction = 4612 ;
            float taxFraction = 0.25f;
            float surpBase = impBase - 43147;
            float taxSurp = surpBase * taxFraction;
            float incomeTax = taxSurp + basicFraction;
            System.out.println("Impuesto--->" + incomeTax);
        }
        else if (impBase >= 105580) {
            float basicFraction = 4612 ;
            float taxFraction = 0.25f;
            float surpBase = impBase - 43147;
            float taxSurp = surpBase * taxFraction;
            float incomeTax = taxSurp + basicFraction;
            System.out.println("Impuesto--->" + incomeTax);
        }
    
  
    }
    
    
       
    
    
    
    }


