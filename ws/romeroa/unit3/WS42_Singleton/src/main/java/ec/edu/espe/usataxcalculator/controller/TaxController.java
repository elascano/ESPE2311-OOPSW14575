package ec.edu.espe.usataxcalculator.controller;

import ec.edu.espe.usataxcalculator.model.Tax;
import ec.edu.espe.usataxcalculator.view.FrmTax;


public class TaxController {
    private Tax model;
    private FrmTax view;

    public TaxController(Tax model, FrmTax view) {
        this.model = model;
        this.view = view;
    }

    public void calculateTax() {
        double amount = view.getAmount();
        double taxRate = view.getTaxRate();
        double totalWithTax = model.calculateTotalWithTax(amount, taxRate);
        view.setResult(totalWithTax);
    }
}