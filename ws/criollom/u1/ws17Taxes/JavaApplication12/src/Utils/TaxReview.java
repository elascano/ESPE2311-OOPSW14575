package Utils;

import java.util.Scanner;

public class TaxReview {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su sueldo mensual");
        float mensual = scan.nextFloat();
        System.out.println("Sueldo mensual -> " + mensual);
        System.out.println("Sueldo anual -> " + (mensual * 12));

        Tax tax = new Tax(mensual);
        float impuesto = tax.calculateTax();
        System.out.println("Impuesto anual -> " + impuesto);
    }
}

class Tax {
    private float salaryMonth;

    public Tax(float salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    @Override
    public String toString() {
        return "Tax{" + "salaryMonth=" + getSalaryMonth() + '}';
    }

    public float getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(float salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public float calculateTax() {
        float salaryAnual = salaryMonth * 12;

        if (salaryAnual >= 0 && salaryAnual <= 11722) {
            return (salaryAnual - 0) * 0 + 0;
        } else if (salaryAnual >= 11722 && salaryAnual <= 14930) {
            return (salaryAnual - 11722) * 0.05f + 0;
        } else if (salaryAnual >= 14930 && salaryAnual <= 19385) {
            return (salaryAnual - 14930) * 0.10f + 160;
        } else if (salaryAnual >= 19385 && salaryAnual <= 25638) {
            return (salaryAnual - 19385) * 0.12f + 606;
        } else if (salaryAnual >= 25638 && salaryAnual <= 33738) {
            return (salaryAnual - 25638) * 0.15f + 1356;
        } else if (salaryAnual >= 33738 && salaryAnual <= 44721) {
            return (salaryAnual - 33738) * 0.20f + 2571;
        } else if (salaryAnual >= 44721 && salaryAnual <= 59537) {
            return (salaryAnual - 44721) * 0.25f + 4768;
        } else if (salaryAnual >= 59537 && salaryAnual <= 79388) {
            return (salaryAnual - 59537) * 0.30f + 8472;
        } else if (salaryAnual >= 79388 && salaryAnual <= 105580) {
            return (salaryAnual - 79388) * 0.35f + 14427;
        } else if (salaryAnual >= 105580) {
            return (salaryAnual - 105580) * 0.37f + 23594;
        }
        return 0;
    }
}