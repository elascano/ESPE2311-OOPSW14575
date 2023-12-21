package ec.edu.espe.incometax.utils;

import java.util.Scanner;

/**
 *
 * @author Juan Granda - Jose Guayasamin
 */
public class Taxes {

    private double income;
    private double taxBaseBefore;
    private double ieesDeduction;
    private double incomeInRealtionshipOfDependency;
    private double taxBaseTotal;

    public static void main(String[] args) {
        Taxes taxCalculator = new Taxes();
        taxCalculator.baseTaxes();
    }

    public void baseTaxes() {
        double total;
        double totalBasic;
        double icomeTaxCaused;
        Taxes taxCalculator = new Taxes();
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the income: ");
        income = enter.nextDouble();
        total = taxCalculator.taxBaseCalculation(income);
        System.out.println("TAX BASE TOTAL:" + total);
        totalBasic = taxCalculator.basicFraction(total);
        System.out.println(totalBasic);
        icomeTaxCaused = taxCalculator.icomeTaxCaused(totalBasic);
        System.out.println("INCOME TAX CAUSED FOR YEAR->" + icomeTaxCaused);
        System.out.println("INCOME TAX CAUSED FOR MONTH->" + icomeTaxCaused / 12);

    }

    public double taxBaseCalculation(double income) {
        double taxBase;
        incomeInRealtionshipOfDependency = income * 12;
        ieesDeduction = incomeInRealtionshipOfDependency * 0.0945;
        taxBaseTotal = incomeInRealtionshipOfDependency - ieesDeduction;

        taxBase = taxBaseTotal;
        return taxBase;
    }

    public double basicFraction(double total) {
        double basicFraction = 0;
        double basicFraccionPercentage = 0;
        double ImpBasicFraction = 0;
        double taxCaused = 0;

        if (total > 0 && total <= 11722) {
            basicFraction = total - 0;
            basicFraccionPercentage = basicFraction * 0;
            ImpBasicFraction = 0;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;

        } else if (total > 11722 && total <= 14930) {
            basicFraction = total - 11722;
            basicFraccionPercentage = basicFraction * 0.05;
            ImpBasicFraction = 0;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else if (total > 14930 && total <= 19385) {
            basicFraction = total - 14930;
            basicFraccionPercentage = basicFraction * 0.1;
            ImpBasicFraction = 160;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else if (total > 19385 && total <= 25638) {
            basicFraction = total - 19385;
            basicFraccionPercentage = basicFraction * 0.12;
            ImpBasicFraction = 606;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else if (total > 25638 && total <= 33738) {
            basicFraction = total - 25638;
            basicFraccionPercentage = basicFraction * 0.15;
            ImpBasicFraction = 1356;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else if (total > 33738 && total <= 44721) {
            basicFraction = total - 33738;
            basicFraccionPercentage = basicFraction * 0.20;
            ImpBasicFraction = 2571;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else if (total > 44721 && total <= 59537) {
            basicFraction = total - 44721;
            basicFraccionPercentage = basicFraction * 0.25;
            ImpBasicFraction = 4768;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else if (total > 59537 && total <= 79388) {
            basicFraction = total - 59537;
            basicFraccionPercentage = basicFraction * 0.3;
            ImpBasicFraction = 8472;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else if (total > 79388 && total <= 105580) {
            basicFraction = total - 79388;
            basicFraccionPercentage = basicFraction * 0.35;
            ImpBasicFraction = 14427;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else if (total > 105580 && total <= 999999) {
            basicFraction = total - 105580;
            basicFraccionPercentage = basicFraction * 0.37;
            ImpBasicFraction = 23594;
            taxCaused = basicFraccionPercentage + ImpBasicFraction;
        } else {
            System.out.println("Error");
        }

        return taxCaused;
    }

    public double icomeTaxCaused(double totalBasic) {
        int charges;
        double value;
        double valorTotal = 0;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the number of charges: ");
        charges = enter.nextInt();
        switch (charges) {
            case 0:
                value = 963.53;
                valorTotal = totalBasic - value;
                if (valorTotal < 0) {
                    valorTotal = 0;
                }
                break;
            case 1:
                value = 1238.83;
                valorTotal = totalBasic - value;
                if (valorTotal < 0) {
                    valorTotal = 0;
                } else {
                    valorTotal = totalBasic - value;
                }
                break;
            case 2:
                value = 1514.13;
                valorTotal = totalBasic - value;
                if (valorTotal < 0) {
                    valorTotal = 0;
                } else {
                    valorTotal = totalBasic - value;

                }
                break;
            case 3:
                value = 1927.07;
                valorTotal = totalBasic - value;
                if (valorTotal < 0) {
                    valorTotal = 0;
                } else {
                    valorTotal = totalBasic - value;

                }
                break;
            case 4:
                value = 2340.01;
                valorTotal = totalBasic - value;
                if (valorTotal < 0) {
                    valorTotal = 0;
                } else {
                    valorTotal = totalBasic - value;

                }
                break;
            case 5:
                value = 2752.96;
                valorTotal = totalBasic - value;
                if (valorTotal < 0) {
                    valorTotal = 0;
                } else {
                    valorTotal = totalBasic - value;

                }
                break;
            default:
                break;
        }

        return valorTotal;

    }

}
