/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.ec.Q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class D extends A{
    
    private ArrayList<F> fC;
    private ArrayList <E> eC;

    public ArrayList<F> getfC() {
        return fC;
    }

    public void setfC(ArrayList<F> fC) {
        this.fC = fC;
    }

    public ArrayList<E> geteC() {
        return eC;
    }

    public void seteC(ArrayList<E> eC) {
        this.eC = eC;
    }

    public D(ArrayList<F> fC, ArrayList<E> eC, A a) {
        super(a);
        this.fC = fC;
        this.eC = eC;
    }

    public D(A a) {
        super(a);
    }
    
    
    
}
